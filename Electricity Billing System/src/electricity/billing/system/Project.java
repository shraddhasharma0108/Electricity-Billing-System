
package electricity.billing.system;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Project extends JFrame{
    Project(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        
        
        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        mb.add(master);
        
        
        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospace",Font.PLAIN,12));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        master.add(newcustomer);
        newcustomer.setMnemonic('D');
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));  //for control+D
        
        
        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospace",Font.PLAIN,12));
        customerdetails.setBackground(Color.WHITE);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2));   
        customerdetails.setMnemonic('M');
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));  //for control+D
        master.add(customerdetails);
        
        JMenuItem depositdetails = new JMenuItem("Deposite Details");
         depositdetails.setFont(new Font("monospace",Font.PLAIN,12));
         depositdetails.setBackground(Color.WHITE);
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
         depositdetails.setIcon(new ImageIcon(image3));
         depositdetails.setMnemonic('N');
        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));  //for control+D
        master.add( depositdetails);
        
        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospace",Font.PLAIN,12));
         calculatebill.setBackground(Color.WHITE);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image4 = icon4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('B');
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));  //for control+D
        master.add( calculatebill);
       
         
        JMenu info = new JMenu("Information");
        master.setForeground(Color.RED);
        mb.add(info);
        
        JMenuItem updateinformation = new JMenuItem("Update Information");
        updateinformation.setForeground(Color.RED);
        mb.add(updateinformation);
        updateinformation.setFont(new Font("monospace",Font.PLAIN,12));
        updateinformation.setBackground(Color.WHITE);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5 = icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        updateinformation.setIcon(new ImageIcon(image5));
        updateinformation.setMnemonic('P');
       updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));  
        info.add(updateinformation);
        
        JMenuItem viewinformation = new JMenuItem("View Information");
        viewinformation.setForeground(Color.RED);
        mb.add(viewinformation);
        viewinformation.setFont(new Font("monospace",Font.PLAIN,12));
        viewinformation.setBackground(Color.WHITE);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinformation.setIcon(new ImageIcon(image6));
        viewinformation.setMnemonic('L');
        viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK)); 
        info.add(viewinformation);
        
        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        mb.add(user);
        
        JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setForeground(Color.RED);
        mb.add(paybill);
       paybill.setFont(new Font("monospace",Font.PLAIN,12));
        paybill.setBackground(Color.WHITE);
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image7 = icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('B');
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK)); 
        user.add(paybill);
        
        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setForeground(Color.RED);
        mb.add(billdetails);
        billdetails.setFont(new Font("monospace",Font.PLAIN,12));
        billdetails.setBackground(Color.WHITE);
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image8 = icon8.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(image8));
       billdetails.setMnemonic('L');
       billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK)); 
        user.add(billdetails);
        
        JMenu report = new JMenu("Report");
        user.setForeground(Color.BLUE);
        mb.add(report);
        
        JMenuItem generatebill = new JMenuItem("Generate Bill");
        generatebill .setForeground(Color.RED);
        mb.add(generatebill );
        generatebill .setFont(new Font("monospace",Font.PLAIN,12));
        generatebill .setBackground(Color.WHITE);
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image9 = icon9.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        generatebill .setIcon(new ImageIcon(image9));
        generatebill.setMnemonic('P');
       generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));  
        report.add(generatebill);
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setForeground(Color.RED);
        mb.add(notepad );
        notepad .setFont(new Font("monospace",Font.PLAIN,12));
        notepad .setBackground(Color.WHITE);
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image10 = icon10.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad .setIcon(new ImageIcon(image10));
        notepad.setMnemonic('P');
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));  
         utility.add(notepad);
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setForeground(Color.RED);
        mb.add(notepad );
        calculator.setFont(new Font("monospace",Font.PLAIN,12));
        calculator.setBackground(Color.WHITE);
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image11 = icon11.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11 ));
        calculator.setMnemonic('P');
      calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        utility.add(calculator);
        
        
        
        
        setLayout(new FlowLayout());
        setVisible(true);
    }
    
    public static void main(String[]args){
        new Project();
    }
    
}
