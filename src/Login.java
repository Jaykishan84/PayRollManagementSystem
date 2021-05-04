/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAYKISHAN SATIKUVAR
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    Login(){
        super("Login Page");
        setLayout(new BorderLayout());
        
        t1 = new JTextField(10);
        t2 = new JPasswordField(10);
        JLabel l = new JLabel(new ImageIcon(ClassLoader.getSystemResource("icon\\defaultpic.png")));
        
        b1 = new JButton("Submit", new ImageIcon(ClassLoader.getSystemResource("icon\\login.png")));
        b2 = new JButton("Cancel", new ImageIcon(ClassLoader.getSystemResource("icon\\Cancel.png")));
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        JPanel p1,p2,p3,p4;
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        add(l, BorderLayout.WEST);
        
        p2.add(new JLabel("Username"));
        p2.add(t1);
        p2.add(new JLabel("Password"));
        p2.add(t2);
        add(p2, BorderLayout.CENTER);
        
        p4.add(b1);
        p4.add(b2);
        add(p4, BorderLayout.SOUTH);
        
        setVisible(true);
        setSize(600,350);
        setLocation(500,300);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
            Conn c1 = new Conn();
            String username = t1.getText();
            String password = String.valueOf(t2.getPassword());
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
            
            ResultSet rs = c1.s.executeQuery(query);
            if(rs.next()){
                new Project().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    
    public static void main(String args[]){
        new Login().setVisible(true);
    }
    
    
}
