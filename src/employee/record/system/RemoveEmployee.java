package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RemoveEmployee extends JFrame implements ActionListener {

    Choice cEmpId;
    JButton delete;

    RemoveEmployee() {
        setLayout(null);
        setTitle("View EMPLOYEE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ray.jpg"));
        Image i2 = i1.getImage().getScaledInstance(560, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 300, 630);
        add(image);
        // image vitra ko image.
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/remove logo.png"));
        Image i5 = i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(45, 40, 200, 200);
        image.add(image2);

        //left pannel ko side ko:
        JLabel hello = new JLabel("Remove ");
        hello.setBounds(80, 220, 200, 40);
        hello.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(hello);

        JLabel admin = new JLabel("Records");
        admin.setBounds(80, 260, 200, 40);
        admin.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(admin);

        JButton home = new JButton("Home");
        home.setBounds(70, 500, 150, 40);
        image.add(home);

        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Home().setVisible(true);
            }
        });

        JLabel labelempId = new JLabel("Select EMPLOYEE ID to remove:");
        labelempId.setBounds(350, 50, 250, 30);
        labelempId.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelempId);

        cEmpId = new Choice();
        cEmpId.setBounds(600, 55, 150, 30);
        add(cEmpId);

        try {
            Conn c = new Conn();
            String query = "Select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                cEmpId.add(rs.getString("employee_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labelname = new JLabel("First name:");
        labelname.setBounds(350, 150, 100, 30);
        labelname.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelname);

        JLabel lblname = new JLabel("");
        lblname.setBounds(500, 150, 200, 30);
        lblname.setFont(new Font("Raleway", Font.BOLD, 15));
        lblname.setForeground(Color.RED);
        add(lblname);

        JLabel labellast = new JLabel("Last name:");
        labellast.setBounds(350, 200, 100, 30);
        labellast.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labellast);

        JLabel lbllast = new JLabel("");
        lbllast.setBounds(500, 200, 200, 30);
        lbllast.setFont(new Font("Raleway", Font.BOLD, 15));
        lbllast.setForeground(Color.RED);
        add(lbllast);

        JLabel labelphone = new JLabel("Phone:");
        labelphone.setBounds(350, 250, 100, 30);
        labelphone.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelphone);

        JLabel lblphone = new JLabel("");
        lblphone.setBounds(500, 250, 200, 30);
        lblphone.setFont(new Font("Raleway", Font.BOLD, 15));
        lblphone.setForeground(Color.RED);
        add(lblphone);

        JLabel labelAddress = new JLabel("Address:");
        labelAddress.setBounds(350, 300, 100, 30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelAddress);

        JLabel lbladdress = new JLabel("");
        lbladdress.setBounds(500, 300, 200, 30);
        lbladdress.setFont(new Font("Raleway", Font.BOLD, 15));
        lbladdress.setForeground(Color.RED);
        add(lbladdress);

        JLabel labelposition = new JLabel("Position:");
        labelposition.setBounds(350, 350, 100, 30);
        labelposition.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelposition);

        JLabel lblposition = new JLabel("");
        lblposition.setBounds(500, 350, 200, 30);
        lblposition.setFont(new Font("Raleway", Font.BOLD, 15));
        lblposition.setForeground(Color.RED);
        add(lblposition);

        JLabel labelemail = new JLabel("Email:");
        labelemail.setBounds(350, 400, 100, 30);
        labelemail.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelemail);

        JLabel lblemail = new JLabel("");
        lblemail.setBounds(500, 400, 200, 30);
        lblemail.setFont(new Font("Raleway", Font.BOLD, 15));
        lblemail.setForeground(Color.RED);
        add(lblemail);

        try {
            Conn c = new Conn();
            String query = "Select * from employee where employee_id='" + cEmpId.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                lblname.setText(rs.getString("fname"));
                lbllast.setText(rs.getString("lname"));
                lblphone.setText(rs.getString("phone"));
                lbladdress.setText(rs.getString("address"));
                lblposition.setText(rs.getString("position"));
                lblemail.setText(rs.getString("email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String query = "Select * from employee where employee_id='" + cEmpId.getSelectedItem() + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        lblname.setText(rs.getString("fname"));
                        lbllast.setText(rs.getString("lname"));
                        lblphone.setText(rs.getString("phone"));
                        lbladdress.setText(rs.getString("address"));
                        lblposition.setText(rs.getString("position"));
                        lblemail.setText(rs.getString("email"));
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        delete = new JButton("Delete");
        delete.setBounds(550, 480, 100, 30);
        delete.addActionListener(this);
        add(delete);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 630);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == delete) {
            try {
                Conn c = new Conn();
                String query = "delete from employee where employee_id='" + cEmpId.getSelectedItem() + "'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Successfully");
                setVisible(false);
                new Home();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
