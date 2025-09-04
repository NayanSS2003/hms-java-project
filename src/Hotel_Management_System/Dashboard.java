package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton adminButton, receptionButton;

    Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard1.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(0, 0, screenWidth, screenHeight);
        add(imageLabel);

        receptionButton = new JButton("RECEPTION");
        receptionButton.setBounds(580, 480, 150, 40);
        receptionButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        receptionButton.setBackground(new Color(30, 25, 15));
        receptionButton.setForeground(new Color(255, 215, 0));
        receptionButton.setBorderPainted(false);
        receptionButton.setFocusPainted(false);
        receptionButton.addActionListener(this);
        imageLabel.add(receptionButton);

        adminButton = new JButton("ADMIN");
        adminButton.setBounds(780, 480, 150, 40);
        adminButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        adminButton.setBackground(new Color(30, 25, 15));
        adminButton.setForeground(new Color(255, 215, 0));
        adminButton.setBorderPainted(false);
        adminButton.setFocusPainted(false);
        adminButton.addActionListener(this);
        imageLabel.add(adminButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == receptionButton) {
            new Reception();
            setVisible(false);
        } else {
            new Login2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}