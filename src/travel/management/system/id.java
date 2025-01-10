
package travel.management.system;

import javax.swing.*;
import java .awt.*;
import java.sql.*;
import java.awt.event.*;


public class id extends JFrame implements ActionListener {
   
    
    JTextField tfgpa,tffirstname,tflastname,tfrollno;
   
    JButton add,back;
   
    
    id(String firstname){
    setBounds(450,200,850,550);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
     JLabel lblfirstname =new JLabel("first name");
    lblfirstname.setBounds(30,50,150,25);
    add(lblfirstname);
    
    tffirstname =new JTextField();
    tffirstname.setBounds(220,50,150,25);
    add(tffirstname);

    
    
    JLabel lbllastname =new JLabel("last Name");
    lbllastname.setBounds(30,90,150,25);
    add(lbllastname);
    
    tflastname =new JTextField();
    tflastname.setBounds(220,90,150,25);
    add(tflastname);
    
    JLabel lblgpa =new JLabel("Gpa");
    lblgpa.setBounds(30,130,150,25);
    add(lblgpa);
   
    tfgpa = new JTextField();
    tfgpa.setBounds(220,130,150,25);
    add(tfgpa);
    
    
    JLabel lblrollno =new JLabel("roll no");
    lblrollno.setBounds(30,170,150,25);
    add(lblrollno);
    
    tfrollno = new JTextField();
    tfrollno.setBounds(220,170,150,25);
    add(tfrollno);
    
    
    add =new JButton ("Add");
    add.setBackground(Color.BLACK);
    add.setBounds(70,430,100,25);
    add.setForeground(Color.WHITE);
    add.addActionListener(this);
    add(add);
    
    back=new JButton ("Back");
    back.setBackground(Color.BLACK);
    back.setBounds(220,430,100,25);
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    add(back);
    
    
    try{
    Conn c = new Conn();
   ResultSet rs = c.s.executeQuery("select * from id where firstname ='"+firstname+"'");
    while(rs.next()){
      tffirstname.setText(rs.getString("firstname"));
      tflastname.setText(rs.getString("lastname"));
    }
    } catch (Exception e){
      e.printStackTrace();
    }
   
    setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
       if (ae.getSource()==add){
       String firstname =tffirstname.getText();
       String lastname = tflastname.getText();
       String rollno = tfrollno.getText();   
      String gpa = tfgpa.getText();
       
       
       
         try{
         Conn c = new Conn();
         String query ="insert into id value('"+firstname+"', '"+lastname+"', '"+rollno+"','"+gpa+"')";
         c.s.executeUpdate(query);
         
         JOptionPane.showMessageDialog(null,"id Added Successfully");
         setVisible(false);
         
         } catch (Exception e){
         
         e.printStackTrace();
         } 
      
       }else{
           setVisible(false);
       }
    
    }       
            
  public static void main(String[]args) {
    
    new id("");
  }
}
