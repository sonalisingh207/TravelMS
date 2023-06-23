package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JButton back;
    
    ViewBookedHotel(String username) {
        setBounds(400,200,1000,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(60,0,400,30);
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid=new JLabel("Hotel Name");
        lblid.setBounds(30,90,150,25);
        add(lblid);
        
        JLabel labelpackage=new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);
        
        JLabel lblnumber=new JLabel("Total Person");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        JLabel labelperson=new JLabel();
        labelperson.setBounds(220,130,150,25);
        add(labelperson);
        
        JLabel lbldays=new JLabel("Total Days");
        lbldays.setBounds(30,170,150,25);
        add(lbldays);
        
        JLabel labeldays=new JLabel();
        labeldays.setBounds(220,170,150,25);
        add(labeldays);
        
        JLabel lblac=new JLabel("AC/Non-AC");
        lblac.setBounds(30,210,150,25);
        add(lblac);
        
        JLabel labelac=new JLabel();
        labelac.setBounds(220,210,150,25);
        add(labelac);
        
        JLabel lblfood=new JLabel("Food included?");
        lblfood.setBounds(30,250,150,25);
        add(lblfood);
        
        JLabel labelfood=new JLabel();
        labelfood.setBounds(220,250,150,25);
        add(labelfood);
        
        JLabel lblname=new JLabel("ID");
        lblname.setBounds(30,290,150,25);
        add(lblname);
        
        JLabel labelid=new JLabel();
        labelid.setBounds(220,290,150,25);
        add(labelid);
        
        JLabel lblgender=new JLabel("Number");
        lblgender.setBounds(30,330,150,25);
        add(lblgender);
        
        JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,330,150,25);
        add(labelnumber);
        
        JLabel lblcountry=new JLabel("Phone");
        lblcountry.setBounds(30,370,150,25);
        add(lblcountry);
        
        JLabel labelphone=new JLabel();
        labelphone.setBounds(220,370,150,25);
        add(labelphone);
        
        JLabel lbladdress=new JLabel("Total Cost");
        lbladdress.setBounds(30,410,150,25);
        add(lbladdress);
        
        JLabel labelprice=new JLabel();
        labelprice.setBounds(220,410,150,25);
        add(labelprice);
        
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130,460,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(450,20,500,400);
        add(image);
                
        try{
            Conn c=new Conn();
            String query="select*from bookhotel where username= '"+username+"'  "; 
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                
                labelid.setText(rs.getString("id"));
                labelpackage.setText(rs.getString("name"));
                labelnumber.setText(rs.getString("number"));
                labelprice.setText(rs.getString("price"));
                labelphone.setText(rs.getString("phone"));
                labelperson.setText(rs.getString("person"));
                labelfood.setText(rs.getString("food"));
                labelac.setText(rs.getString("ac"));
                labeldays.setText(rs.getString("days"));
                
            }
                
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String args[]){
        new ViewBookedHotel("");
    }
    
}