package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmpLeave_decision extends JFrame {

    String sdate;
    String edate;
    String status;

    EmpLeave_decision(String username) {
        setTitle("Leave Approval");
        setLayout(null);

        JLabel heading = new JLabel("Leave Approval");
        heading.setBounds(180, 20, 200, 60);
        heading.setFont(new Font("Raleway", Font.BOLD, 20));
        add(heading);

        try {
            Conn c = new Conn();
            String query = "select * from userleave where fname='" + username + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                sdate = rs.getString("startdate");
                edate = rs.getString("enddate");
                status = rs.getString("status");
            }
            JLabel text = new JLabel("Your leave from ");
            text.setBounds(50, 100, 300, 30);
            text.setFont(new Font("Raleway", Font.BOLD, 15));
            add(text);

            JLabel sdatee = new JLabel(sdate);
            sdatee.setBounds(180, 100, 300, 30);
            sdatee.setFont(new Font("Raleway", Font.BOLD, 20));
            sdatee.setForeground(Color.RED);
            add(sdatee);

            JLabel txt1 = new JLabel("to");
            txt1.setBounds(310, 100, 300, 30);
            txt1.setFont(new Font("Raleway", Font.BOLD, 15));
            add(txt1);

            JLabel edatee = new JLabel(edate);
            edatee.setBounds(350, 100, 300, 30);
            edatee.setFont(new Font("Raleway", Font.BOLD, 20));
            edatee.setForeground(Color.RED);
            add(edatee);

            JLabel txt = new JLabel("is");
            txt.setBounds(250, 150, 300, 30);
            txt.setFont(new Font("Raleway", Font.BOLD, 15));
            add(txt);

            JLabel approvetxt = new JLabel(status);
            approvetxt.setBounds(220, 200, 300, 30);
            approvetxt.setFont(new Font("Raleway", Font.BOLD, 20));
            approvetxt.setForeground(Color.RED);
            add(approvetxt);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.setBounds(180, 250, 150, 40);
        add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
            }
        });
        setSize(500, 400);
        setLocation(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmpLeave_decision("");
    }
}
