package Hotel_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, phoneText, aadharText, emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox<String> comboBox;
    JButton add,back;

    AddEmployee(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(38, 26, 11));
        add(panel);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(460, 24, 445, 35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(new Color(255, 230, 180));
        panel.add(AED);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("Tahoma", Font.BOLD, 17));
        name.setForeground(new Color(255, 255, 230));
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(new Color(255, 255, 230));
        nameText.setFont(new Font("Tahoma", Font.BOLD,14));
        nameText.setForeground(new Color(38, 26, 11));
        panel.add(nameText);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("Tahoma", Font.BOLD, 17));
        Age.setForeground(new Color(255, 255, 230));
        panel.add(Age);
        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(255, 255, 230));
        ageText.setFont(new Font("Tahoma", Font.BOLD,14));
        ageText.setForeground(new Color(38, 26, 11));
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("Tahoma", Font.BOLD, 17));
        gender.setForeground(new Color(255, 255, 230));
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(new Color(38, 26, 11));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(new Color(255, 255, 230));
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(new Color(38, 26, 11));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonF.setForeground(new Color(255, 255, 230));
        panel.add(radioButtonF);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonM);
        genderGroup.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("Tahoma", Font.BOLD,17));
        job.setForeground(new Color(255, 255, 230));
        panel.add(job);

        String[] jobs = {"Front Desk", "Housekeeping", "Kitchen Staff", "Room Service", "Manager", "Accountant", "Chef"};
        comboBox = new JComboBox<>(jobs);
        comboBox.setBackground(new Color(255, 255, 230));
        comboBox.setBounds(200,170,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setForeground(new Color(38, 26, 11));
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("Tahoma", Font.BOLD, 17));
        salary.setForeground(new Color(255, 255, 230));
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(new Color(255, 255, 230));
        salaryText.setFont(new Font("Tahoma", Font.BOLD,14));
        salaryText.setForeground(new Color(38, 26, 11));
        panel.add(salaryText);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("Tahoma", Font.BOLD, 17));
        phone.setForeground(new Color(255, 255, 230));
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(new Color(255, 255, 230));
        phoneText.setFont(new Font("Tahoma", Font.BOLD,14));
        phoneText.setForeground(new Color(38, 26, 11));
        panel.add(phoneText);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("Tahoma", Font.BOLD, 17));
        aadhar.setForeground(new Color(255, 255, 230));
        panel.add(aadhar);
        aadharText = new JTextField();
        aadharText.setBounds(200,320,150,27);
        aadharText.setBackground(new Color(255, 255, 230));
        aadharText.setFont(new Font("Tahoma", Font.BOLD,14));
        aadharText.setForeground(new Color(38, 26, 11));
        panel.add(aadharText);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("Tahoma", Font.BOLD, 17));
        email.setForeground(new Color(255, 255, 230));
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(new Color(255, 255, 230));
        emailText.setFont(new Font("Tahoma", Font.BOLD,14));
        emailText.setForeground(new Color(38, 26, 11));
        panel.add(emailText);

        add = createStyledButton("ADD");
        add.setBounds(80,420,100,30);
        add.addActionListener(this);
        panel.add(add);

        back = createStyledButton("BACK");
        back.setBounds(200,420,100,30);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);

        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String aadhar = aadharText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()){
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = "Female";
            }

            try{
                conn c = new conn();
                String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"','"+phone+"', '"+email+"', '"+aadhar+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else if (e.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}