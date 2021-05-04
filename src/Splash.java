/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
//abstract window toolkit
import javax.swing.*;
/**
 *
 * @author JAYKISHAN SATIKUVAR
 */
class Splash {
    public static void main(String args[]){
        SFrame s1 = new SFrame("Payroll Management System");
        s1.setVisible(true);
        
        int x=1;
        int i;
        for(i=2;i<600;i+=4,x+=1){
            s1.setLocation((800-((i+x)/2)), 500-(i/2));
            s1.setSize(x+i, i);
            try{
                Thread.sleep(10);
            }catch(Exception e){
                
            }
        }
        
    }
}

class SFrame extends JFrame implements Runnable{
    Thread t1;
    
    SFrame(String s){
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icon/payroll_system.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start();
        
    }
    
    @Override
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            Login f1 = new Login(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
