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

public class Project extends JFrame implements ActionListener {

    public Project() {
        setSize(2000, 1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/payroll.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("Master");
        m1.setForeground(Color.DARK_GRAY);
        
        JMenuItem t1 = new JMenuItem("New Employee");
        
        t1.setBackground(Color.red);
        t1.setForeground(Color.BLUE);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/New.png")));
        
        JMenuItem t3 = new JMenuItem("Salary");
        
        t3.setBackground(Color.red);
        t3.setForeground(Color.BLUE);
        t3.setFont(new Font("monospaced",Font.PLAIN,12));
        t3.setMnemonic('S');
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        t3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/schedreport.png")));
        
        JMenuItem t4 = new JMenuItem("List Employee");
        
        t4.setBackground(Color.red);
        t4.setForeground(Color.BLUE);
        t4.setFont(new Font("monospaced",Font.PLAIN,12));
        t4.setMnemonic('L');
        t4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        t4.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/newinvoice.png")));
        
        m1.add(t1);
        m1.add(t3);
        m1.add(t4);
        mb.add(m1);
        
        t1.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
        
        JMenu edit = new JMenu("Update");
        edit.setForeground(Color.red);
        
        JMenuItem s1 = new JMenuItem("Update Salary");
        s1.setForeground(Color.BLUE);
        s1.setBackground(Color.red);
        s1.setFont(new Font("monospaced", Font.PLAIN,12));
        s1.setMnemonic('U');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
        s1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/EditOpen.png")));
        
        JMenuItem s2 = new JMenuItem("Update Employee");
        s2.setForeground(Color.BLUE);
        s2.setBackground(Color.red);
        s2.setFont(new Font("monospaced", Font.PLAIN,12));
        s2.setMnemonic('p');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        s2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        
        JMenuItem s3 = new JMenuItem("Take Attendence");
        s3.setBackground(Color.red);
        s3.setForeground(Color.BLUE);
        s3.setFont(new Font("monospaced", Font.PLAIN, 12));
        s3.setMnemonic('T');
        s3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        s3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/EXPENSE.png")));
        
        edit.add(s1);
        edit.add(s2);
        edit.add(s3);
        mb.add(edit);
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        
        JMenu rep = new JMenu("Reports");
        rep.setForeground(Color.red);
        
        JMenuItem p1 = new JMenuItem("Generate PaySlip");
        p1.setForeground(Color.BLUE);
        p1.setBackground(Color.red);
        p1.setFont(new Font("monospaced", Font.PLAIN,12));
        p1.setMnemonic('P');
        p1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        p1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/payments.png")));
        
        JMenuItem p2 = new JMenuItem("List Attendence");
        p2.setForeground(Color.BLUE);
        p2.setBackground(Color.red);
        p2.setFont(new Font("monospaced", Font.PLAIN,12));
        p2.setMnemonic('L');
        p2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        p2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        
        
        rep.add(p1);
        rep.add(p2);
        mb.add(rep);
        
        p1.addActionListener(this);
        p2.addActionListener(this);

        JMenu util = new JMenu("Utilities");
        util.setForeground(Color.red);
        
        JMenuItem u1 = new JMenuItem("Notepad");
        u1.setForeground(Color.BLUE);
        u1.setBackground(Color.red);
        u1.setFont(new Font("monospaced", Font.PLAIN,12));
        u1.setMnemonic('o');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        u1.setIcon(new ImageIcon(ClassLoader.getSystemResource("Icons/New.png")));
        
        JMenuItem u2 = new JMenuItem("Calculator");
        u2.setForeground(Color.BLUE);
        u2.setBackground(Color.red);
        u2.setFont(new Font("monospaced", Font.PLAIN,12));
        u2.setMnemonic('C');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        u2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/calc.png")));
        
        JMenuItem u3 = new JMenuItem("Web Browser");
        u3.setForeground(Color.BLUE);
        u3.setBackground(Color.red);
        u3.setFont(new Font("monospaced", Font.PLAIN,12));
        u3.setMnemonic('E');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        u3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/explorer.jpg")));
        
        util.add(u1);
        util.add(u2);
        util.add(u3);
        mb.add(util);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);
        
        JMenu m8 = new JMenu("Exit");
        m8.setForeground(Color.red);
        
        JMenuItem m8i1 = new JMenuItem("Exit");
        m8i1.setForeground(Color.BLUE);
        m8i1.setBackground(Color.red);
        m8i1.setFont(new Font("monospaced",Font.PLAIN,12));
        m8i1.setMnemonic('X');
        m8i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        m8i1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/exit.png")));
        
        m8.add(m8i1);
        mb.add(m8);
        
        m8i1.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent ae){
        
        String msg = ae.getActionCommand();
        
        if(msg.equals("New Employee"))
            new New_Employee().setVisible(true);
        else if(msg.equals("List Employee"))
            new List_Employee().setVisible(true);
        else if(msg.equals("Update Employee"))
            new Update_employee().setVisible(true);
        else if(msg.equals("Salary"))
            new Salary().setVisible(true);
        else if(msg.equals("Update Salary"))
            new Update_salary().setVisible(true);
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){}
        }
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }
        else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("Notepad.exe");
            }catch(Exception e){}
        }
        else if(msg.equals("Take Attendence"))
            new TakeAttendence().setVisible(true);
        else if(msg.equals("Exit"))
            dispose();
        else if(msg.equals("Generate PaySlip"))
            new Pay_Slip().setVisible(true);
        else if(msg.equals("List Attendence"))
            new List_Attendence().setVisible(true);
    }
    
    public static void main(String args[]){
        new Project().setVisible(true);
    }

    
}
