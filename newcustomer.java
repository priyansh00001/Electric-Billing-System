package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class newcustomer extends JFrame implements ActionListener {

    JTextField tfname, tfaddress, tfcity, tfstate, tfemail, tfphone; 
    
    JButton next,cancel;
    JLabel heading, lblname,lblmeterno,lblmeter,lbladdress,lblcity,lblstate,lblemail,lblphone;
    
    newcustomer(){
     setSize(700,500);
     setLocation(400,200);
     
     JPanel p = new JPanel();
     p.setLayout(null);
     p.setBackground(new Color(173, 216,230));
     add(p);
     
     heading = new JLabel("NEW CUSTOMER");
     heading.setBounds(180,10,200,25);
     heading.setFont(new Font("Tahoma", Font.BOLD , 24));
     p.add(heading);
     
     lblname = new JLabel("Customer Name");
     lblname.setBounds(100,80,100,20);
     p.add(lblname);
     
     tfname = new JTextField();
     tfname.setBounds(240,80,200,20);
     p.add(tfname);
     
     lblmeterno = new JLabel("Meter Number");
     lblmeterno.setBounds(100,120,100,20);
     p.add(lblmeterno);
     
     lblmeter = new JLabel("");
     lblmeter.setBounds(240,120,100,20);
     p.add(lblmeter);
     
     Random ran = new Random();
     Long number = ran.nextLong() % 1000000;
     lblmeter.setText(" "+ Math.abs(number));
     
     
     lbladdress = new JLabel("Address");
     lbladdress.setBounds(100,160,100,20);
     p.add(lbladdress);
     
     tfaddress = new JTextField();
     tfaddress.setBounds(240,160,200,20);
     p.add(tfaddress);
     
     lblcity = new JLabel("City");
     lblcity.setBounds(100,200,100,20);
     p.add(lblcity);
     
     tfcity = new JTextField();
     tfcity.setBounds(240,200,200,20);
     p.add(tfcity);
     
     lblstate = new JLabel("State");
     lblstate.setBounds(100,240,100,20);
     p.add(lblstate);
     
     tfstate = new JTextField();
     tfstate.setBounds(240,240,200,20);
     p.add(tfstate);
     
     lblemail = new JLabel("Email");
     lblemail.setBounds(100,280,100,20);
     p.add(lblemail);
     
     tfemail = new JTextField();
     tfemail.setBounds(240,280,200,20);
     p.add(tfemail);
     
     lblphone = new JLabel("Phone");
     lblphone.setBounds(100,320,100,20);
     p.add(lblphone);
     
     tfphone = new JTextField();
     tfphone.setBounds(240,320,200,20);
     p.add(tfphone);
     
     next = new JButton("Next");
     next.setBounds(120,380,100,20);
     next.setBackground(Color.BLACK);
     next.setForeground(Color.WHITE);
     next.addActionListener(this);
     p.add(next);
     
     cancel = new JButton("Cancel");
     cancel.setBounds(290,380,100,20);
     cancel.setBackground(Color.BLACK);
     cancel.setForeground(Color.WHITE);
     cancel.addActionListener(this);
     p.add(cancel);
     
     setLayout(new BorderLayout());
     
     add(p,"Center");
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hicon1.jpg"));
     Image i2 = i1.getImage().getScaledInstance(150, 300,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel Image = new JLabel(i3);
     add(Image,"West");
     
     getContentPane().setBackground(Color.WHITE);
     
     setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            String name = tfname.getText();
            String meter = lblmeter.getText();
            String address = tfaddress.getText();
            String city = tfcity.getText();
            String state = tfstate.getText();
            String email = tfemail.getText();
            String phone = tfphone.getText();
            
            String query1 = "insert into customer values('"+name+"','"+meter+"','"+address+"','"+city+"','"+state+"','"+email+"','"+phone+"')";
            String query2 = "insert into login values('"+meter+"','', '"+name+"', '', '')";
            
            try{
                conn c = new conn();
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
                
                new meterinfo(meter);
            }catch (Exception e){
            
                e.printStackTrace();
            
            }
            
        }else {
        
            setVisible(false);
        }
        
    }
public static void main (String[] args){

    new newcustomer();
}
}
