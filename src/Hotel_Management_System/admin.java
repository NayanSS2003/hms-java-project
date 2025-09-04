package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {
    JButton add_Employee, add_Room, add_Drivers, logout, back;

    admin() {
        setTitle("Suryawanshi Hotel & Resort - Admin Dashboard");
        setLayout(null);
        getContentPane().setBackground(new Color(38, 26, 11));

        JLabel title = new JLabel("ADMIN DASHBOARD");
        title.setBounds(100, 50, 400, 40);
        title.setForeground(new Color(255, 230, 180));
        title.setFont(new Font("Tahoma", Font.BOLD, 32));
        add(title);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(100, 180, 600, 500);
        mainPanel.setBackground(new Color(50, 35, 15, 150));
        mainPanel.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 2));
        add(mainPanel);

        add_Employee = createStyledButton("ADD EMPLOYEE");
        add_Employee.setBounds(250, 100, 220, 45);
        add_Employee.addActionListener(this);
        mainPanel.add(add_Employee);

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        JLabel label = new JLabel(new ImageIcon(l11));
        label.setBounds(70, 60, 120, 120);
        mainPanel.add(label);

        add_Room = createStyledButton("ADD ROOM");
        add_Room.setBounds(250, 250, 220, 45);
        add_Room.addActionListener(this);
        mainPanel.add(add_Room);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        JLabel label1 = new JLabel(new ImageIcon(image));
        label1.setBounds(70, 210, 120, 120);
        mainPanel.add(label1);

        add_Drivers = createStyledButton("ADD DRIVERS");
        add_Drivers.setBounds(250, 400, 220, 45);
        add_Drivers.addActionListener(this);
        mainPanel.add(add_Drivers);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        JLabel label2 = new JLabel(new ImageIcon(image1));
        label2.setBounds(70, 360, 120, 120);
        mainPanel.add(label2);

        ImageIcon hotelLogo = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image logoImage = hotelLogo.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        JLabel logoLabel = new JLabel(new ImageIcon(logoImage));
        logoLabel.setBounds(1000, 180 + (500 - 350) / 2, 350, 350);
        add(logoLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        buttonPanel.setBackground(new Color(38, 26, 11));
        buttonPanel.setBounds(100, 720, 600, 60);
        add(buttonPanel);

        logout = createDistinctButton("Logout");
        logout.addActionListener(this);
        buttonPanel.add(logout);

        back = createDistinctButton("Back");
        back.addActionListener(this);
        buttonPanel.add(back);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(255, 215, 0));
        button.setForeground(new Color(38, 26, 11));
        button.setFont(new Font("Tahoma", Font.BOLD, 16));
        button.setBorder(BorderFactory.createLineBorder(new Color(195, 155, 60), 2));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    private JButton createDistinctButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(255, 215, 0));
        button.setForeground(new Color(38, 26, 11));
        button.setFont(new Font("Tahoma", Font.BOLD, 18));
        button.setBorder(BorderFactory.createLineBorder(new Color(195, 155, 60), 2));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add_Employee) {
            new AddEmployee();
        } else if (e.getSource() == add_Room) {
            new AddRoom();
        } else if (e.getSource() == add_Drivers) {
            new addDriver();
        } else if (e.getSource() == logout) {
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new admin();
    }
}