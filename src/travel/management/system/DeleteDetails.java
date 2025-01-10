

package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class DeleteDetails extends JFrame implements ActionListener {
    JButton Delete;
    String username;
   DeleteDetails(String username){
       this.username = username;
    setBounds(450,180,870,625);
    setLayout(null);
    getContentPane().setBackground(Color.cyan);
    
    JLabel lblusername =new JLabel("username");
    lblusername.setBounds(30,50,150,25);
    add(lblusername);
    
    JLabel Labelusername =new JLabel();
    Labelusername.setBounds(220,50,150,25);
    add(Labelusername);
    
    
    JLabel lblid =new JLabel("id");
    lblid.setBounds(30,110,150,25);
    add(lblid);
    
    JLabel Labelid =new JLabel();
    Labelid.setBounds(220,110,150,25);
    add(Labelid);
    
    JLabel lblnumber =new JLabel("Number");
    lblnumber.setBounds(30,170,150,25);
    add(lblnumber);
    
    JLabel Labelnumber =new JLabel();
    Labelnumber.setBounds(220,170,150,25);
    add(Labelnumber);
    
    JLabel lblname =new JLabel("Name");
    lblname.setBounds(30,230,150,25);
    add(lblname);
    
    JLabel Labelname =new JLabel();
    Labelname.setBounds(220,230,150,25);
    add(Labelname);
    
    JLabel lblgender =new JLabel("Gender");
    lblgender.setBounds(30,290,150,25);
    add(lblgender);
    
    JLabel Labelgender =new JLabel();
    Labelgender.setBounds(220,290,150,25);
    add(Labelgender);
    
     JLabel lblcountry=new JLabel("Country");
    lblcountry.setBounds(500,50,150,25);
    add(lblcountry);
    
    JLabel Labelcountry =new JLabel();
    Labelcountry.setBounds(690,50,150,25);
    add(Labelcountry);
    
    JLabel lbladdress=new JLabel("Address");
    lbladdress.setBounds(500,110,150,25);
    add(lbladdress);
    
    JLabel Labeladdress =new JLabel();
    Labeladdress.setBounds(690,110,150,25);
    add(Labeladdress);
    
    JLabel lblphone=new JLabel("Phone");
    lblphone.setBounds(500,170,150,25);
    add(lblphone);
    
    JLabel Labelphone =new JLabel();
    Labelphone.setBounds(690,170,150,25);
    add(Labelphone);
    
    JLabel lblemail=new JLabel("Email");
    lblemail.setBounds(500,230,150,25);
    add(lblemail);
    
    JLabel Labelemail =new JLabel();
    Labelemail.setBounds(690,230,150,25);
    add(Labelemail);
    
    Delete=new JButton("Delete");
    Delete.setBackground(Color.BLACK);
    Delete.setForeground(Color.white);
    Delete.setBounds(350,350,100,25);
    Delete.addActionListener(this);
    add(Delete);
    
    ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
    Image i2 =i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
    ImageIcon i3 =new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(20,400,600,200);
    add(image);
    
    ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
    Image i5 =i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
    ImageIcon i6 =new ImageIcon(i5);
    JLabel image2 =new JLabel(i6);
    image2.setBounds(600,400,600,200);
    add(image2);
           
    try{
        Conn conn =new Conn();
        String query ="select * from customer where username ='"+username+"'";
        ResultSet rs = conn.s.executeQuery(query);
          while(rs.next()){
              
         Labelusername .setText(rs.getString("username"));
          Labelid .setText(rs.getString("id"));
          Labelnumber .setText(rs.getString("number"));
          Labelname .setText(rs.getString("name"));
          Labelgender .setText(rs.getString("gender"));
          Labelcountry .setText(rs.getString("country"));
          Labeladdress .setText(rs.getString("address"));
          Labelphone .setText(rs.getString("phone"));
          Labelemail .setText(rs.getString("email"));
          
    }
    }catch (Exception e){
    
    }
    
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       try{
       
           Conn c= new Conn();
           c.s.executeUpdate("delete from account where username = '"+username+"'");
          c.s.executeUpdate("delete from customer where username = '"+username+"'");
           c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
            c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");
            
            JOptionPane.showMessageDialog(null, "Data Deleted Sucessfully");
            
            setVisible(false);
           
       }catch (Exception e){
       
       e.printStackTrace();
       }
    }
    public static void main(String[]args){
     new  DeleteDetails("") ;
}

}
