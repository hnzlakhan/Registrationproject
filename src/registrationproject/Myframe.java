
package registrationproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
/**
 *
 * @author Hanzla Khan
 */
public class Myframe extends JFrame implements ActionListener {
    
    JLabel usernamelabel,newpasslabel,forcepasschangelabel,firstnamelabel,surnamelabel,
            emailaddresslabel,citytownlabel,countrylabel,desclabel,curentpiclabel,deletelabel,newpiclabel,picdesclabel; 
    JTextField usernametext,firstnametext,surnametext,
            emailaddresstext,citytowntext,desctext,newpictext,picdesctext;
    JPasswordField  newpasstext;
    JComboBox countrycombobox;
    JTextArea desctextarea;
    JCheckBox passchangecheck,deletecheck;
    JButton updateprofbutton,browsebutton;
    JLabel msg,picmsg;
 
    
    Myframe()
    {
    setTitle("Reg Form by Hanzla Khan");
    setSize(650,700);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    setbounds();
    
   
    setVisible(true);
    }
    
    public void setbounds()
    {
    Container c = getContentPane();
    c.setLayout(null);
    
    usernamelabel = new JLabel("username*");
    usernamelabel.setBounds(220,30,100,20);
    c.add(usernamelabel);
   
    usernametext = new JTextField();
    usernametext.setBounds(300,30, 100,20);
    c.add(usernametext);
    
    newpasslabel = new JLabel("New Password*");
    newpasslabel.setBounds(200,60,100,20);
    c.add(newpasslabel);
   
    newpasstext = new JPasswordField();
    newpasstext.setBounds(300,60, 100,20);
    c.add(newpasstext);
    
    forcepasschangelabel = new JLabel("Force Password Change*");
    forcepasschangelabel.setBounds(10,90,150,20);
    c.add(forcepasschangelabel);
    
    passchangecheck = new JCheckBox();
    passchangecheck.setBounds(300,90,150,20);
    c.add(passchangecheck);
    
    firstnamelabel = new JLabel("First name*");
    firstnamelabel.setBounds(220,120,100,20);
    c.add(firstnamelabel);
   
    firstnametext = new JTextField();
    firstnametext.setBounds(300,120, 100,20);
    c.add(firstnametext);
    
     surnamelabel = new JLabel("surname*");
    surnamelabel.setBounds(220,150,100,20);
    c.add(surnamelabel);
   
    surnametext = new JTextField();
    surnametext.setBounds(300,150, 100,20);
    c.add(surnametext);
    
     emailaddresslabel = new JLabel("Email address*");
    emailaddresslabel.setBounds(200,180,100,20);
    c.add(emailaddresslabel);
   
    emailaddresstext = new JTextField();
    emailaddresstext.setBounds(300,180,120,20);
    c.add(emailaddresstext);
    
     citytownlabel = new JLabel("city/town*");
    citytownlabel.setBounds(220,210,100,20);
    c.add(citytownlabel);
   
    citytowntext = new JTextField();
    citytowntext.setBounds(300,210, 100,20);
    c.add(citytowntext);
    
    countrylabel = new JLabel("Select a Country*");
    countrylabel.setBounds(190,240,100,20);
    c.add(countrylabel);
    
    String cities [] = {"Pakistan","Germany","Indonesia","France"}; 
    countrycombobox = new JComboBox(cities);
    countrycombobox.setBounds(300,240,100,20);
    c.add(countrycombobox);
    
     desclabel = new JLabel("Description*");
    desclabel.setBounds(10,270,100,20);
    c.add(desclabel);
    
    desctextarea = new JTextArea();
   desctextarea.setBounds(30,300,300,150);
   c.add(desctextarea);
    
     curentpiclabel = new JLabel("Current Picture");
    curentpiclabel.setBounds(190,470,100,20);
    c.add(curentpiclabel);
    
     picmsg = new JLabel();
    picmsg.setBounds(300,470,100,20);
    c.add(picmsg);
    
    deletelabel = new JLabel("Delete");
    deletelabel.setBounds(240,500,150,20);
    c.add(deletelabel);
    
    deletecheck = new JCheckBox();
    deletecheck.setBounds(300,500,150,20);
    c.add(deletecheck);
    
    newpiclabel = new JLabel("New Picture(Maz Size 64Mb)");
    newpiclabel.setBounds(120,530,250,20);
    c.add(newpiclabel);
    
    newpictext = new JTextField();
    newpictext.setBounds(300,530, 100,20);
    c.add(newpictext);
    
    browsebutton = new JButton("Browse...");
    browsebutton.setBounds(410,530, 90,20);
    c.add(browsebutton);
   
     browsebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                browsebuttonActionPerformed(evt);
            }
        });
     
     picdesclabel = new JLabel("Picture description");
    picdesclabel.setBounds(170,560,150,20);
    c.add(picdesclabel);
    
    picdesctext = new JTextField();
    picdesctext.setBounds(300,560, 100,20);
    c.add(picdesctext);
    
     updateprofbutton = new JButton("Update Profile");
    updateprofbutton.setBounds(300,590, 120,20);
    c.add(updateprofbutton);
    
    updateprofbutton.addActionListener(this);
    
    msg = new JLabel();
    msg.setBounds(300,620,300,20);
    c.add(msg);
    
    }
    
    private void browsebuttonActionPerformed(ActionEvent evt) {                                                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        newpictext.setText(filename);
        
        if(newpictext.getText().isEmpty())
        {
        picmsg.setText("None");
        }
        else
        {
         picmsg.setText("File attached");
        }
       
    }   
    @Override
    public void actionPerformed(ActionEvent e) {
        
      
      msg.setText("Status Message");
      
        if(usernametext.getText().isEmpty() )
        {
       usernamelabel.setForeground(Color.red);        
        msg.setText("There are required fields in this form marked *");
        
        }
        if(newpasstext.getText().isEmpty())
        {
       newpasslabel.setForeground(Color.red);
        msg.setText("There are required fields in this form marked *");
        }
         if(passchangecheck.isSelected())
         {}
         else
         {
       forcepasschangelabel.setForeground(Color.red);
        msg.setText("There are required fields in this form marked *");
        }
        if(firstnametext.getText().isEmpty())
        {
       firstnamelabel.setForeground(Color.red);
        msg.setText("There are required fields in this form marked *");
        }
        if(surnametext.getText().isEmpty())
        {
      surnamelabel.setForeground(Color.red);
        msg.setText("There are required fields in this form marked *");
        }
        if(emailaddresstext.getText().isEmpty())
        {
      emailaddresslabel.setForeground(Color.red);
        msg.setText("There are required fields in this form marked *");
        
        }
        if(citytowntext.getText().isEmpty())
        {
        citytownlabel.setForeground(Color.red);
        msg.setText("There are required fields in this form marked *");
        
        }
        
        if(!usernametext.getText().isEmpty() && !newpasstext.getText().isEmpty() && !firstnametext.getText().isEmpty()
                && !surnametext.getText().isEmpty() && !emailaddresstext.getText().isEmpty() && !citytowntext.getText().isEmpty()) 
         {
         msg.setText("Profile successfully updated");
         }
         
    }
    
    
}
