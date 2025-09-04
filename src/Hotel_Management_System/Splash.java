package Hotel_Management_System;
import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,758,580);
        add(label);
        setLayout(null);
        setLocation(300,80);
        setSize(758,580);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
