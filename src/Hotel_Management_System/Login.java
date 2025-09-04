package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;

    Login(){
        JLabel label1 = new JLabel("Username");
        label1.setBounds(40,40,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(new Color(255, 215, 0));
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(40,90,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(new Color(255, 215, 0));
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,40,150,30);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma", Font.PLAIN,15));
        textField1.setBackground(new Color(50, 35, 15));
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,90,150,30);
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(50, 35, 15));
        add(passwordField1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(250, 220, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(318, 25, 255, 220);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,160,120,30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(new Color(255, 215, 0));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,160,120,30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(new Color(255, 215, 0));
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(38, 26, 11));
        setLayout(null);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            try {
                conn c = new conn();
                String user = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    new Dashboard();
                    setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid");
                }

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            System.exit(102);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}