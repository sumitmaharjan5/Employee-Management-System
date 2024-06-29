package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ChangePassword extends JFrame {
    
    ChangePassword() {
        setLayout(null);

        JLabel oldpass = new JLabel("Confirm your old Password:");
        oldpass.setBounds(30, 40, 200, 30);
        oldpass.setFont(new Font("Raleway", Font.BOLD, 15));
        add(oldpass);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(250, 40, 200, 30);
        add(pass);

        JButton confirm = new JButton("check");
        confirm.setBounds(120, 100, 100, 30);
        add(confirm);

        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

                try {

                    String checkpass = pass.getText();
                    String query = "select * from login where username='admin'";

                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                        String pass=rs.getString(2);
                        if (checkpass.equals(pass)) {
                            setVisible(false);
                        new PasschangeForm().setVisible(true);

                        //next class
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password");
//                setVisible(false);
                    }
                    }
                    

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        );
        
        JButton back = new JButton("back");
        back.setBounds(260, 100, 100, 30);
        add(back);
        
         back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
//                new Setting().setVisible(true);
            }
        });

        setSize(500, 200);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChangePassword();
    }
}
