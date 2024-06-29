package employee.record.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class Manager_Department_record extends JFrame {

    JTable table;
    Choice cemployeeId;
    JButton search, print, update;

    Manager_Department_record() {
        setLayout(null);
        setTitle("View EMPLOYEE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ray.jpg"));
        Image i2 = i1.getImage().getScaledInstance(560, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 300, 630);
        add(image);
        // image vitra ko image.
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/management.png"));
        Image i5 = i4.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(45, 40, 200, 200);
        image.add(image2);

        //left pannel ko side ko:
        JLabel hello = new JLabel("Manager");
        hello.setBounds(85, 220, 200, 40);
        hello.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(hello);

        JLabel admin = new JLabel("Department");
        admin.setBounds(60, 260, 200, 40);
        admin.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(admin);

        JButton back = new JButton("Back");
        back.setBounds(70, 500, 150, 40);
        image.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new ViewRecords().setVisible(true);
            }
        });

//        JButton home = new JButton("Home");
//        home.setBounds(70, 500, 150, 40);
//        image.add(home);
//
//        home.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent a) {
//                setVisible(false);
//                new Home().setVisible(true);
//            }
//        });
//        
        // table:::::::
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel searchlbl = new JLabel("Search by Employee id:");
        searchlbl.setBounds(310, 20, 150, 20);
        add(searchlbl);

        cemployeeId = new Choice();
        cemployeeId.setBounds(480, 20, 150, 20);
        add(cemployeeId);
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where position='Manager'");
            while (rs.next()) {
// Search employee by id part::::;
                cemployeeId.add(rs.getString("employee_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
// Main data table::::::::::
        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where position='Manager'");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(300, 100, 900, 600);
        add(jsp);

        search = new JButton("Search");
        search.setBounds(640, 20, 80, 20);
        add(search);

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String query = "Select * from employee where employee_id='" + cemployeeId.getSelectedItem() + "'";
                try {
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });
//print part::::::::::::::::::
        print = new JButton("Print");
        print.setBounds(750, 20, 80, 20);
        add(print);

        print.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                try {
                    table.print();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

// update part::::::::::::::::
        update = new JButton("Update");
        update.setBounds(850, 20, 80, 20);
        add(update);

        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Update(cemployeeId.getSelectedItem());
            }
        });

//
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1220, 630);
        setLocation(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Manager_Department_record();
    }

}
