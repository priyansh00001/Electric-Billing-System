
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class project extends JFrame implements ActionListener{
    
    String atype, meter;
    project(String atype, String meter){
        this.atype = atype;
        this.meter = meter;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 850,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
       
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        
        JMenu master = new JMenu("MASTER");
        master.setForeground(Color.BLACK);
        
        
        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("Monospaced", Font.PLAIN, 15));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image icon1 = image1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(icon1));
        newcustomer.setMnemonic('D');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        master.add(newcustomer);
        
        
        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("Monospaced", Font.PLAIN, 15));
        customerdetails.setBackground(Color.WHITE);
        ImageIcon image2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image icon2 = image2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(icon2));
        customerdetails.setMnemonic('M');
        customerdetails.addActionListener(this);
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        master.add(customerdetails);
        
        JMenuItem depositdetails = new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("Monospaced", Font.PLAIN, 15));
        depositdetails.setBackground(Color.WHITE);
        ImageIcon image3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image icon3 = image3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(icon3));
        depositdetails.setMnemonic('N');
        depositdetails.addActionListener(this);
        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        master.add(depositdetails);
        
        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("Monospaced", Font.PLAIN, 15));
        calculatebill.setBackground(Color.WHITE);
        ImageIcon image4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image icon4 = image4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(icon4));
        calculatebill.setMnemonic('B');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        master.add(calculatebill);
        
        JMenu info = new JMenu("INFORMATION");
        info.setForeground(Color.BLACK);
        
        
        JMenuItem updateinfo = new JMenuItem("Update Information");
        updateinfo.setFont(new Font("Monospaced", Font.PLAIN, 15));
        updateinfo.setBackground(Color.WHITE);
        ImageIcon image5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image icon5 = image5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        updateinfo.setIcon(new ImageIcon(icon5));
        updateinfo.setMnemonic('P');
        updateinfo.addActionListener(this);
        updateinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        info.add(updateinfo);
        
        JMenuItem viewinfo = new JMenuItem("View Information");
        viewinfo.setFont(new Font("Monospaced", Font.PLAIN, 15));
        viewinfo.setBackground(Color.WHITE);
        ImageIcon image6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image icon6 = image6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(icon6));
        viewinfo.setMnemonic('A');
        viewinfo.addActionListener(this);
        viewinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        info.add(viewinfo);
        
        
        JMenu user = new JMenu("USER");
        user.setForeground(Color.BLACK);
        
        
        JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setFont(new Font("Monospaced", Font.PLAIN, 15));
        paybill.setBackground(Color.WHITE);
        ImageIcon image7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image icon7 = image7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(icon7));
        paybill.setMnemonic('L');
        paybill.addActionListener(this);
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        user.add(paybill);
        
        JMenuItem billdetails = new JMenuItem("Bill details");
        billdetails.setFont(new Font("Monospaced", Font.PLAIN, 15));
        billdetails.setBackground(Color.WHITE);
        ImageIcon image8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon8.png"));
        Image icon8 = image8.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(icon8));
        billdetails.setMnemonic('C');
        billdetails.addActionListener(this);
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        user.add(billdetails);
        
        JMenu report = new JMenu("REPORT");
        report.setForeground(Color.BLACK);
        
        
        JMenuItem generatebill = new JMenuItem("Generate Bill");
        generatebill.setFont(new Font("Monospaced", Font.PLAIN, 15));
        generatebill.setBackground(Color.WHITE);
        ImageIcon image9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image icon9 = image9.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        generatebill.setIcon(new ImageIcon(icon9));
        generatebill.setMnemonic('J');
        generatebill.addActionListener(this);
        generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, ActionEvent.CTRL_MASK));
        report.add(generatebill);
        
        JMenu utility = new JMenu("UTILITY");
        utility.setForeground(Color.BLACK);
       
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("Monospaced", Font.PLAIN, 15));
        notepad.setBackground(Color.WHITE);
        ImageIcon image10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image icon10 = image10.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(icon10));
        notepad.setMnemonic('E');
        notepad.addActionListener(this);
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        utility.add(notepad);
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("Monospaced", Font.PLAIN, 15));
        calculator.setBackground(Color.WHITE);
        ImageIcon image11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image icon11 = image11.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(icon11));
        calculator.setMnemonic('H');
        calculator.addActionListener(this);
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        utility.add(calculator);
        
        JMenu exit  = new JMenu("EXIT");
        exit.setForeground(Color.BLACK);
        
        
        JMenuItem exits = new JMenuItem("Exit");
        exits.setFont(new Font("Monospaced", Font.PLAIN, 15));
        exits.setBackground(Color.WHITE);
        ImageIcon image12 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image icon12 = image12.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        exits.setIcon(new ImageIcon(icon12));
        exits.setMnemonic('F');
        exits.addActionListener(this);
        exits.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        exit.add(exits);
        
        if (atype.equals("Admin")){
             mb.add(master);
        }else{
            mb.add(info);
            mb.add(user);
            mb.add(report);
        }
        
        mb.add(utility);
        mb.add(exit); 
        
        setLayout(new FlowLayout());
        
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Customer")){
           new newcustomer();
        }else if (msg.equals("Customer Details") ){
            new CustomerDetails();
        }else if(msg.equals("Deposit Details")){
            new DepositDetails();
        }else if (msg.equals("Calculate Bill")){
            new CalculateBill();
        }else if(msg.equals("View Information")){
            new ViewInformation(meter);
        }else if (msg.equals("Update Information")){
            new UpdateInformation(meter);
        }else if (msg.equals("Bill details")){
            new BillDetails(meter);
        }else if (msg.equals("Notepad")){
        
            try{
            
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch (Exception e){
            
                e.printStackTrace();
            }
        }else if (msg.equals("Calculator")){
        
            try{
            
                Runtime.getRuntime().exec("calc.exe");
                
            }catch (Exception e){
            
                e.printStackTrace();
            }
        }else if(msg.equals("Exit")){
        
            setVisible(false);
            new login();
        
        }else if(msg.equals("Pay Bill")){
        
            new PayBill(meter);
        }else if(msg.equals("Generate Bill")){
            new GenerateBill(meter);
                
        }
    }
    
    public static void main(String args[]){
    
        new project("", "");
    }
    
}
