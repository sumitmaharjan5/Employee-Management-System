package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class Leave extends JFrame {

    JTable table;
    JButton search, update;

    Leave() {

        setLayout(null);
        setTitle("View Leave");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ray.jpg"));
        Image i2 = i1.getImage().getScaledInstance(560, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 300, 630);
        add(image);
        // image vitra ko image.
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/leave.png"));
        Image i5 = i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(45, 40, 200, 200);
        image.add(image2);

        //left pannel ko side ko:
        JLabel hello = new JLabel("Leave ");
        hello.setBounds(100, 220, 200, 40);
        hello.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(hello);

        JLabel admin = new JLabel("Records");
        admin.setBounds(85, 260, 200, 40);
        admin.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(admin);

        JButton home = new JButton("Back");
        home.setBounds(70, 500, 150, 40);
        image.add(home);

        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Home();
            }
        });

//        table
        JLabel searchlbl = new JLabel("Search by Employee name:");
        searchlbl.setBounds(310, 20, 150, 20);
        add(searchlbl);

        Choice fname = new Choice();
        fname.setBounds(480, 20, 150, 20);
        add(fname);
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from userleave");
            while (rs.next()) {
// Search employee by id part::::;
                fname.add(rs.getString("fname"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
// Main data table::::::::::
        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from userleave");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(300, 100, 900, 600);
        add(jsp);

//         table fin--
//         search print and update part:::::::
//search part:::::::::::::::::::::
        search = new JButton("Search");
        search.setBounds(640, 20, 80, 20);
        add(search);

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String query = "Select * from userleave where fname='" + fname.getSelectedItem() + "'";
                try {
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });

// update part::::::::::::::::
        update = new JButton("Request check");
        update.setBounds(850, 20, 150, 20);
        add(update);

        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
//                setVisible(false);
                new Employee_leave_approve(fname.getSelectedItem());
            }
        });

//finish
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1220, 630);
        setLocation(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Leave();
    }
}