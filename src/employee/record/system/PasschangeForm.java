package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class PasschangeForm extends JFrame {

    PasschangeForm() {
        setLayout(null);
        setTitle("New Password");

        JLabel newpass = new JLabel("New Passwod:");
        newpass.setBounds(30, 40, 200, 30);
        newpass.setFont(new Font("Raleway", Font.BOLD, 15));

        add(newpass);

        JPasswordField npass = new JPasswordField();
        npass.setBounds(250, 40, 200, 30);
        add(npass);

        JLabel repass = new JLabel("Re-type New Passwod:");
        repass.setBounds(30, 80, 200, 30);
        repass.setFont(new Font("Raleway", Font.BOLD, 15));
        add(repass);

        JPasswordField rpass = new JPasswordField();
        rpass.setBounds(250, 80, 200, 30);
        add(rpass);

        JButton confirm = new JButton("Confirm");
        confirm.setBounds(200, 150, 100, 30);
        add(confirm);

        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

                String newpass = npass.getText();
                if (newpass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Invalid Password !");
                } else {
                    try {
                        Conn conn = new Conn();
                        String query = "update login set password='" + newpass + "'";
                        conn.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Password has been updated");
                        setVisible(false);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        setSize(500, 250);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PasschangeForm();
    }
}
