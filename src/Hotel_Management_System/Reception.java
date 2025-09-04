package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener {
    JButton btnNCF, btnRoom, btnDepartment, btnAEI, btnCI, btnMI, btnCO, btnUC, btnURS, btnPUS, btnSR, logout, back;

    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280, 5, 1238, 820);
        panel.setBackground(new Color(38, 26, 11));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 270, 820);
        panel1.setBackground(new Color(38, 26, 11));
        panel1.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 2));
        add(panel1);

        int buttonY = 30;
        int buttonWidth = 220;
        int buttonHeight = 35;
        int buttonSpacing = 40;

        btnNCF = createMainButton("New Customer Form");
        btnNCF.setBounds(25, buttonY, buttonWidth, buttonHeight);
        panel1.add(btnNCF);

        btnRoom = createMainButton("Room");
        btnRoom.setBounds(25, buttonY + buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnRoom);

        btnDepartment = createMainButton("Department");
        btnDepartment.setBounds(25, buttonY + 2 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnDepartment);

        btnAEI = createMainButton("All Employee Info");
        btnAEI.setBounds(25, buttonY + 3 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnAEI);

        btnCI = createMainButton("Customer Info");
        btnCI.setBounds(25, buttonY + 4 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnCI);

        btnMI = createMainButton("Manager Info");
        btnMI.setBounds(25, buttonY + 5 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnMI);

        btnCO = createMainButton("Check Out");
        btnCO.setBounds(25, buttonY + 6 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnCO);

        btnUC = createMainButton("Update Check-In Details");
        btnUC.setBounds(25, buttonY + 7 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnUC);

        btnURS = createMainButton("Update Room Status");
        btnURS.setBounds(25, buttonY + 8 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnURS);

        btnPUS = createMainButton("Pick up Service");
        btnPUS.setBounds(25, buttonY + 9 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnPUS);

        btnSR = createMainButton("Search Room");
        btnSR.setBounds(25, buttonY + 10 * buttonSpacing, buttonWidth, buttonHeight);
        panel1.add(btnSR);

        logout = createSecondaryButton("Logout");
        logout.setBounds(25, 480, 100, 35);
        panel1.add(logout);

        back = createSecondaryButton("Back");
        back.setBounds(145, 480, 100, 35);
        panel1.add(back);
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i2 = i11.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(10, 560, 250, 250);
        panel1.add(label1);

        btnNCF.addActionListener(this);
        btnRoom.addActionListener(this);
        btnDepartment.addActionListener(this);
        btnAEI.addActionListener(this);
        btnCI.addActionListener(this);
        btnMI.addActionListener(this);
        btnCO.addActionListener(this);
        btnUC.addActionListener(this);
        btnURS.addActionListener(this);
        btnPUS.addActionListener(this);
        btnSR.addActionListener(this);
        logout.addActionListener(this);
        back.addActionListener(this);

        getContentPane().setBackground(new Color(38, 26, 11));
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    private JButton createMainButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(255, 215, 0));
        button.setForeground(new Color(38, 26, 11));
        button.setFont(new Font("Tahoma", Font.BOLD, 16));
        button.setBorder(BorderFactory.createLineBorder(new Color(195, 155, 60), 2));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    private JButton createSecondaryButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(38, 26, 11));
        button.setForeground(new Color(255, 215, 0));
        button.setFont(new Font("Tahoma", Font.BOLD, 16));
        button.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 2));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNCF) {
            new NewCustomer();
        } else if (e.getSource() == btnRoom) {
            new Room();
        } else if (e.getSource() == btnDepartment) {
            new Department();
        } else if (e.getSource() == btnAEI) {
            new Employee();
        } else if (e.getSource() == btnCI) {
            new CustomerInfo();
        } else if (e.getSource() == btnMI) {
            new ManagerInfo();
        } else if (e.getSource() == btnCO) {
            new CheckOut();
        } else if (e.getSource() == btnUC) {
            new UpdateCheck();
        } else if (e.getSource() == btnURS) {
            new UpdateRoom();
        } else if (e.getSource() == btnPUS) {
            new PickUp();
        } else if (e.getSource() == btnSR) {
            new SearchRoom();
        } else if (e.getSource() == logout) {
            System.exit(0);
        } else if (e.getSource() == back) {
            setVisible(false);
            new Dashboard();
        }
    }

    public static void main(String[] args) {
        new Reception();
    }
}