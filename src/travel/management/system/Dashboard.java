
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    JButton addpersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,viewpackage;
    JButton viewhotel,destinations,bookhotel, viewbookedhotel,payments, calculator,deletePersonalDetails;
    
    
    Dashboard(String username){  
      this.username= username;  
    //setBounds(0,0,1600,1000);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);
    
    
    JPanel p1=new JPanel();
    p1.setLayout(null);
    p1.setBackground(new Color(0,0,102));
    p1.setBounds(0,0,1600,65);
    add(p1);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
    Image i2 =i1 .getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT );
    ImageIcon  i3 = new ImageIcon(i2);
    JLabel icon= new JLabel(i3);
    icon.setBounds(5,0,70,70);
      p1. add(icon);
   
   JLabel heading = new JLabel("Dashboard");
   heading.setBounds(80,10,300,40);
   heading.setForeground(Color.WHITE);
   heading.setFont(new Font("Tahoma",Font.BOLD,30));
    p1.add(heading);
    
    JPanel p2=new JPanel();
    p2.setLayout(null);
    p2.setBackground(new Color(0,0,102));
    p2.setBounds(0,65,300,900);
    add(p2);
    
        addpersonalDetails=new JButton("Add personal Details");
       addpersonalDetails .setBounds(0,0,300,50);
       addpersonalDetails .setBackground(new Color(0,0,102));
        addpersonalDetails.setForeground(Color.WHITE);
        addpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       addpersonalDetails.setMargin(new Insets(0,0,0,60));
       addpersonalDetails.addActionListener(this);
        p2.add(addpersonalDetails);
        
          updatePersonalDetails=new JButton("Update personal Details");
       updatePersonalDetails .setBounds(0,50,300,50);
       updatePersonalDetails .setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       updatePersonalDetails.setMargin(new Insets(0,0,0,30));
       updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
         viewPersonalDetails=new JButton("View Details");
       viewPersonalDetails .setBounds(0,100,300,50);
       viewPersonalDetails .setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewPersonalDetails.setMargin(new Insets(0,0,0,130));
       viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
         deletePersonalDetails =new JButton("Delete Details");
        deletePersonalDetails .setBounds(0,150,300,50);
        deletePersonalDetails .setBackground(new Color(0,0,102));
         deletePersonalDetails.setForeground(Color.WHITE);
         deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,130));
       deletePersonalDetails.addActionListener(this);
        p2.add( deletePersonalDetails);
        
         checkpackages=new JButton("Check package");
        checkpackages .setBounds(0,200,300,50);
        checkpackages .setBackground(new Color(0,0,102));
         checkpackages.setForeground(Color.WHITE);
         checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add( checkpackages);
        
        bookpackage=new JButton("Book package");
        bookpackage .setBounds(0,250,300,50);
        bookpackage .setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add( bookpackage);
        
        viewpackage=new JButton("View package");
        viewpackage .setBounds(0,300,300,50);
        viewpackage .setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add( viewpackage);
        
        
        viewhotel=new JButton("View Hotel");
        viewhotel .setBounds(0,350,300,50);
        viewhotel .setBackground(new Color(0,0,102));
        viewhotel.setForeground(Color.WHITE);
        viewhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotel.setMargin(new Insets(0,0,0,130));
        viewhotel.addActionListener(this);
        p2.add( viewhotel);
        
       bookhotel=new JButton("BOOK Hotel");
        bookhotel .setBounds(0,400,300,50);
        bookhotel .setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
       bookhotel.addActionListener(this);
        p2.add( bookhotel);
        
        viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel .setBounds(0,450,300,50);
        viewbookedhotel .setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.addActionListener(this);
        p2.add( viewbookedhotel);
        
        destinations=new JButton("Destinations");
        destinations .setBounds(0,500,300,50);
        destinations .setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add( destinations);
        
        payments=new JButton("Payments");
        payments .setBounds(0,550,300,50);
        payments .setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add( payments);
        
         calculator=new JButton("Calculator");
        calculator .setBounds(0,600,300,50);
        calculator .setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add( calculator);
         setVisible(true);
         
        JButton notepad=new JButton("Notepad");
        notepad .setBounds(0,650,300,50);
        notepad .setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        p2.add( notepad);
         setVisible(true);
         
         JButton about=new JButton("About");
        about .setBounds(0,700,300,50);
        about .setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
         about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        p2.add( about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 =i4.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
        ImageIcon i6 =new ImageIcon(i5);
        JLabel image =new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text =new JLabel(" Travel and Tourism Management system");
        text.setBounds(400,70,1000,70);
        text.setForeground(Color.BLACK);
        text.setFont( new Font("Raleway",Font.PLAIN,40));
        image.add(text);
         setVisible(true);

           }
    
   public void actionPerformed( ActionEvent ae){
       if(ae.getSource()== addpersonalDetails){
         new Addcustomer(username);
       
       }else if  (ae.getSource()==viewPersonalDetails) {
           new Viewcustomer(username);
           
       }else if (ae.getSource()== updatePersonalDetails){
          new UpdateCustomer(username);
       
       }else if (ae.getSource()==checkpackages){
       
             new CheckPackage(); 
       }else if(ae.getSource()==bookpackage){
       
              new BookPackage(username);       
       }else if (ae.getSource()==viewpackage){
       
             new ViewPackage(username);
       } else if(ae.getSource()==viewhotel){
       
              new CheckHotels();
       } else if(ae.getSource()==destinations){
       
               new Destinations();
       }else if(ae.getSource()==bookhotel){
       
           BookHotel bookHotel = new  BookHotel(username);
       } else if(ae.getSource()== viewbookedhotel){
       
            new  ViewBookedHotel(username);
       
       } else if(ae.getSource()==payments){
       
           Payment Payment = new Payment();
          
       } else if(ae.getSource()==calculator){
       
        try{
            Runtime.getRuntime().exec("calc.exe");
            
        }catch (Exception e){
        
         e.printStackTrace();
        
        }
           
       } 
   
     } 
            
    public static void main(String[]args){
        new Dashboard("");
   }
}