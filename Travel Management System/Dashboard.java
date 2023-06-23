package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackages,bookPackage,viewPackage,viewHotels,destinations,bookHotels,viewbookedHotels,payments,calculator,notepad,about,deletePersonalDetails;
    Dashboard(String username) {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(5,0,70,70);
        p1.add(image);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("TAHOMA",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,48,300,50);
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails=new JButton("View Details");
        viewPersonalDetails.setBounds(0,96,300,50);
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,144,300,50);
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setFont(new Font("TAHOMA", Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkPackages=new JButton("Check Packages");
        checkPackages.setBounds(0,192,300,50);
        checkPackages.setForeground(Color.white);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setFont(new Font("TAHOMA", Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackage=new JButton("Book Package");
        bookPackage.setBounds(0,240,300,50);
        bookPackage.setForeground(Color.white);
        bookPackage.setBackground(new Color(0,0,102));
        bookPackage.setFont(new Font("TAHOMA", Font.PLAIN,20));
        bookPackage.setMargin(new Insets(0,0,0,120));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);
        
        viewPackage=new JButton("View Package");
        viewPackage.setBounds(0,288,300,50);
        viewPackage.setForeground(Color.white);
        viewPackage.setBackground(new Color(0,0,102));
        viewPackage.setFont(new Font("TAHOMA", Font.PLAIN,20));
        viewPackage.setMargin(new Insets(0,0,0,120));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);
        
        viewHotels=new JButton("View Hotels");
        viewHotels.setBounds(0,336,300,50);
        viewHotels.setForeground(Color.white);
        viewHotels.setBackground(new Color(0,0,102));
        viewHotels.setFont(new Font("TAHOMA", Font.PLAIN,20));
        viewHotels.setMargin(new Insets(0,0,0,140));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);
        
        bookHotels=new JButton("Book Hotels");
        bookHotels.setBounds(0,384,300,50);
        bookHotels.setForeground(Color.white);
        bookHotels.setBackground(new Color(0,0,102));
        bookHotels.setFont(new Font("TAHOMA", Font.PLAIN,20));
        bookHotels.setMargin(new Insets(0,0,0,140));
        bookHotels.addActionListener(this);
        p2.add(bookHotels);
        
        viewbookedHotels=new JButton("View Booked Hotels");
        viewbookedHotels.setBounds(0,432,300,50);
        viewbookedHotels.setForeground(Color.white);
        viewbookedHotels.setBackground(new Color(0,0,102));
        viewbookedHotels.setFont(new Font("TAHOMA", Font.PLAIN,20));
        viewbookedHotels.setMargin(new Insets(0,0,0,70));
        viewbookedHotels.addActionListener(this);
        p2.add(viewbookedHotels);
        
        destinations=new JButton("Destinations");
        destinations.setBounds(0,480,300,50);
        destinations.setForeground(Color.white);
        destinations.setBackground(new Color(0,0,102));
        destinations.setFont(new Font("TAHOMA", Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments=new JButton("Payment");
        payments.setBounds(0,528,300,50);
        payments.setForeground(Color.white);
        payments.setBackground(new Color(0,0,102));
        payments.setFont(new Font("TAHOMA", Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator=new JButton("Calculator");
        calculator.setBounds(0,576,300,50);
        calculator.setForeground(Color.white);
        calculator.setBackground(new Color(0,0,102));
        calculator.setFont(new Font("TAHOMA", Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad=new JButton("Notepad");
        notepad.setBounds(0,624,300,50);
        notepad.setForeground(Color.white);
        notepad.setBackground(new Color(0,0,102));
        notepad.setFont(new Font("TAHOMA", Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about=new JButton("About");
        about.setBounds(0,672,300,50);
        about.setForeground(Color.white);
        about.setBackground(new Color(0,0,102));
        about.setFont(new Font("TAHOMA", Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image im2=im1.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        JLabel image1=new JLabel(im3);
        image1.setBounds(0,0,1650,1000);
        add(image1);
        
        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.PLAIN,55));
        image1.add(text);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails)
            new AddCustomer(username);
    else if(ae.getSource() == viewPersonalDetails)
            new ViewCustomers(username);
    else if(ae.getSource() == updatePersonalDetails)
            new UpdateCustomer(username);
    else if(ae.getSource() == checkPackages)
            new CheckPackage();
    else if(ae.getSource() == bookPackage)
            new BookPackage(username);
    else if(ae.getSource() == viewPackage)
            new ViewPackage(username);
    else if(ae.getSource() == viewHotels)
            new CheckHotels();
    else if(ae.getSource() == destinations)
            new Destinations();
    else if(ae.getSource() == bookHotels)
            new BookHotel(username);
    else if(ae.getSource() == viewbookedHotels)
            new ViewBookedHotel(username);
    else if(ae.getSource() == payments)
            new Payment();
    else if(ae.getSource() == calculator)
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){
                e.printStackTrace();
            }
    else if(ae.getSource() == notepad)
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){
                e.printStackTrace();
            }
    else if(ae.getSource() == about)
            new About();
    else if(ae.getSource() == deletePersonalDetails)
            new DeleteDetails(username);
    }
    
    public static void main(String args[]){
        new Dashboard("");
    }
    
}
