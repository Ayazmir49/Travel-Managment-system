
package travel.management.system;

import javax.swing.*;
import java.awt.event.*;



public class Cash extends JFrame implements ActionListener {
    
  Cash(){
       
       setBounds(500,200,800,600);
       
       JEditorPane Pane = new JEditorPane();
       Pane.setEditable(false);
    
    try{
    Pane.setPage("https://www.bankalfalah.com/personal-banking/digital-banking/alfa-payment-gateway/");
    }catch (Exception e){
    
    Pane.setContentType("text/html");
    Pane.setText("<html>Could not Load, Error 404</html>");
    }
      JScrollPane sp =new JScrollPane(Pane);
      getContentPane().add(sp);
      
      JButton back =new JButton("Back");
      back.setBounds(610,20,80,40);
      back.addActionListener(this);
       Pane. add(back);
      
      
      setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
    
           setVisible(false);
           new Cash();
    
    
}
   
public static void main(String[]args){
    
    new Cash();
    
    }
}
   
   
    