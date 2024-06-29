package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Setting extends JFrame {

    Setting() {
        setTitle("Setting");
        setLayout(null);

        JLabel settingtxt = new JLabel("Settings");
        settingtxt.setBounds(220, 10, 150, 50);
        settingtxt.setFont(new Font("Raleway", Font.BOLD, 30));
        add(settingtxt);

        JLabel change = new JLabel("Change Password:");
        change.setBounds(20, 100, 200, 50);
        change.setFont(new Font("Raleway", Font.BOLD, 15));
        add(change);

        JButton pass = new JButton("Click here");
        pass.setBounds(180, 110, 150, 30);
        add(pass);

        pass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new ChangePassword();
            }
        });

//        JLabel reset = new JLabel("Reset Date:");
//        reset.setBounds(20, 190, 200, 50);
//        reset.setFont(new Font("Raleway", Font.BOLD, 15));
//        add(reset);

//        JButton resetbtn = new JButton("Click here");
//        resetbtn.setBounds(180, 200, 150, 30);
//        add(resetbtn);
//
//        resetbtn.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent a) {
//                new ResetData();
//            }
//        });

        JButton apply = new JButton("Apply");
        apply.setBounds(100, 300, 150, 40);
        add(apply);
        apply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
//                new Home().setVisible(true);
            }
        });
        JButton home = new JButton("back");
        home.setBounds(300, 300, 150, 40);
        add(home);
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
//                new Home().setVisible(true);
            }
        });

        setSize(560, 450);
        setLocation(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Setting();
    }
}
