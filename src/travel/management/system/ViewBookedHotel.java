package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class  ViewBookedHotel extends JFrame implements ActionListener {
    JButton back;
   ViewBookedHotel(String username){
    setBounds(400,200,1000,600);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
    JLabel text =new JLabel("VIEW BOOKED HOTEL DETAILS");
    text.setFont(new Font("Tahoma",Font.BOLD,20));
    text.setBounds(60,0,400,30);
    add(text);
    
    JLabel lblusername =new JLabel("username");
    lblusername.setBounds(30,50,150,25);
    add(lblusername);
    
    JLabel Labelusername =new JLabel();
    Labelusername.setBounds(220,50,150,25);
    add(Labelusername);
    
    
    JLabel lblpackage =new JLabel("HOTEL Name");
    lblpackage.setBounds(30,90,150,25);
    add(lblpackage);
    
    JLabel Labelpackage =new JLabel();
    Labelpackage.setBounds(220,90,150,25);
    add(Labelpackage);
    
    JLabel lblpersons =new JLabel("Total Persons");
    lblpersons.setBounds(30,130,150,25);
    add(lblpersons);
    
    JLabel Labelpersons =new JLabel();
    Labelpersons.setBounds(220,130,150,25);
    add(Labelpersons);
    
    JLabel lbldays =new JLabel("Total Days");
    lbldays.setBounds(30,170,150,25);
    add(lbldays);
    
    JLabel Labeldays =new JLabel();
    Labeldays.setBounds(220,170,150,25);
    add(Labeldays);
    
    JLabel lblac =new JLabel("AC/Non-AC");
    lblac.setBounds(30,210,150,25);
    add(lblac);
    
    JLabel Labelac =new JLabel();
    Labelac.setBounds(220,210,150,25);
    add(Labelac);
    
    JLabel lblfood =new JLabel("Food Included ?");
    lblfood.setBounds(30,250,150,25);
    add(lblfood);
    
    JLabel Labelfood =new JLabel();
    Labelfood.setBounds(220,250,150,25);
    add(Labelfood);
    
  
    JLabel lblid =new JLabel("ID");
    lblid.setBounds(30,290,150,25);
    add(lblid);
    
    JLabel Labelid =new JLabel();
    Labelid.setBounds(220,290,150,25);
    add(Labelid);
    
    JLabel lblnumber =new JLabel("Number");
    lblnumber.setBounds(30,330,150,25);
    add(lblnumber);
    
    JLabel Labelnumber =new JLabel();
    Labelnumber.setBounds(220,330,150,25);
    add(Labelnumber);
    
     JLabel lblphone=new JLabel("Phone number");
    lblphone.setBounds(30,370,150,25);
    add(lblphone);
    
    JLabel Labelphone =new JLabel();
    Labelphone.setBounds(220,370,150,25);
    add(Labelphone);
    
    JLabel lblprice=new JLabel("Total cost");
    lblprice.setBounds(30,410,150,25);
    add(lblprice);
    
    JLabel Labelprice =new JLabel();
    Labelprice.setBounds(220,410,150,25);
    add(Labelprice);
    
    
    back=new JButton("Back");
    back.setBackground(Color.BLACK);
    back.setForeground(Color.white);
    back.setBounds(130,460,100,25);
    back.addActionListener(this);
    add(back);
    
    ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
    Image i2 =i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
    ImageIcon i3 =new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(450,20,500,400);
    add(image);
    
    
           
    try{
        Conn conn =new Conn();
        String query ="select * from bookhotel where username ='"+username+"'";
        ResultSet rs = conn.s.executeQuery(query);
          while(rs.next()){
              
         Labelusername .setText(rs.getString("username"));
          Labelid .setText(rs.getString("id"));
          Labelnumber .setText(rs.getString("number"));
          Labelpackage .setText(rs.getString("name"));
          Labelprice .setText(rs.getString("Price"));
          Labelphone .setText(rs.getString("phone"));
          Labelpersons .setText(rs.getString("persons"));
          Labelfood .setText(rs.getString("food"));
          Labelac .setText(rs.getString("ac"));
          Labeldays .setText(rs.getString("days"));
          
          
    }
    }catch (Exception e){
    
    }
    
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         setVisible(false);
    }
    public static void main(String[]args){
     new ViewBookedHotel("muhammad") ;
}

}


