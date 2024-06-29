package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeLogin extends JFrame {

    JTextField tfusername;
    JPasswordField tfpassword;

    EmployeeLogin() {
        setTitle("Employee login");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 40, 100, 30);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 40, 150, 30);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 90, 100, 30);
        add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 90, 150, 30);
        add(tfpassword);

        JButton login = new JButton("Login");
        login.setBounds(40, 170, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    String username = tfusername.getText();
                    String password = tfpassword.getText();

                    String query = "select * from employee where fname='" + username + "'";

                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    if (rs.next()) {
                        setVisible(false);
                        new EmployeeDashboard(username).setVisible(true);

                        //next class
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password");
//                setVisible(false);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        JButton close = new JButton("CLose");
        close.setBounds(180, 170, 120, 30);
        close.setBackground(Color.BLACK);
        close.setForeground(Color.WHITE);
        add(close);

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
            }
        });

        setSize(600, 300);
        setLocation(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        new EmployeeLogin();
    }
}
