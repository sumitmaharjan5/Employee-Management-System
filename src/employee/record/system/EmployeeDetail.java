package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeDetail extends JFrame {

    String fname;
    String lname;
    String dob;
    String address;
    String phone;
    String position;
    String salary;
    String email;
    String employee_id;

    EmployeeDetail(String username) {
        setTitle("Employee Details");
        setLayout(null);

        try {
            Conn c = new Conn();
            String query = "select * from employee where fname='" + username + "' ";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                fname = rs.getString("fname");
                lname = rs.getString("lname");
                dob = rs.getString("dob");
                address = rs.getString("address");
                phone = rs.getString("phone");
                position = rs.getString("position");
                salary = rs.getString("salary");
                email = rs.getString("email");
                employee_id = rs.getString("employee_id");
            }

            JLabel alert = new JLabel("Your Details");
            alert.setBounds(200, 20, 500, 40);
            alert.setFont(new Font("Raleway", Font.BOLD, 30));
            alert.setForeground(Color.RED);
            add(alert);

            JLabel labelname = new JLabel("First name:");
            labelname.setBounds(50, 100, 100, 30);
            labelname.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labelname);

            JLabel lblname = new JLabel(fname);
            lblname.setBounds(160, 100, 200, 30);
            lblname.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblname.setForeground(Color.B);
            add(lblname);

            JLabel labellast = new JLabel("Last name:");
            labellast.setBounds(50, 150, 100, 30);
            labellast.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labellast);

            JLabel lbllast = new JLabel(lname);
            lbllast.setBounds(160, 150, 200, 30);
            lbllast.setFont(new Font("Raleway", Font.BOLD, 15));
//            lbllast.setForeground(Color.RED);
            add(lbllast);

            JLabel labeldob = new JLabel("Date of Birth:");
            labeldob.setBounds(50, 200, 100, 30);
            labeldob.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labeldob);

            JLabel lblphone = new JLabel(dob);
            lblphone.setBounds(160, 200, 200, 30);
            lblphone.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblphone.setForeground(Color.RED);
            add(lblphone);

            JLabel labelAddress = new JLabel("Address:");
            labelAddress.setBounds(50, 250, 100, 30);
            labelAddress.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labelAddress);

            JLabel lbladdress = new JLabel(address);
            lbladdress.setBounds(160, 250, 200, 30);
            lbladdress.setFont(new Font("Raleway", Font.BOLD, 15));
//            lbladdress.setForeground(Color.RED);
            add(lbladdress);

            JLabel labelphone = new JLabel("Phone:");
            labelphone.setBounds(50, 300, 100, 30);
            labelphone.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labelphone);

            JLabel lblphn = new JLabel(phone);
            lblphn.setBounds(160, 300, 200, 30);
            lblphn.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblphn.setForeground(Color.RED);
            add(lblphn);

            JLabel labelposition = new JLabel("Position:");
            labelposition.setBounds(50, 350, 100, 30);
            labelposition.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labelposition);

            JLabel lblposition = new JLabel(position);
            lblposition.setBounds(160, 350, 200, 30);
            lblposition.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblposition.setForeground(Color.RED);
            add(lblposition);

            JLabel labelemail = new JLabel("Email:");
            labelemail.setBounds(50, 400, 100, 30);
            labelemail.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labelemail);

            JLabel lblemail = new JLabel(email);
            lblemail.setBounds(160, 400, 200, 30);
            lblemail.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblemail.setForeground(Color.RED);
            add(lblemail);

            JLabel labele_id = new JLabel("Your id:");
            labele_id.setBounds(50, 450, 100, 30);
            labele_id.setFont(new Font("Raleway", Font.BOLD, 15));
            add(labele_id);

            JLabel lble_id = new JLabel(employee_id);
            lble_id.setBounds(160, 450, 200, 30);
            lble_id.setFont(new Font("Raleway", Font.BOLD, 15));
//            lble_id.setForeground(Color.RED);
            add(lble_id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JButton back = new JButton("Back");
        back.setBounds(200, 500, 150, 40);
        add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
            }
        });

        setSize(600, 600);
        setLocation(450, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeDetail("");
    }

}
