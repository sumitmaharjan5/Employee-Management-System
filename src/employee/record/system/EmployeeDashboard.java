package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeDashboard extends JFrame {

    String fname;
    String lname;
    String address;
    String position;
    String status;

    EmployeeDashboard(String username) {
        setTitle("Employee Details");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ray.jpg"));
        Image i2 = i1.getImage().getScaledInstance(560, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 300, 630);
        add(image);
        // image vitra ko image.
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/second.png"));
        Image i5 = i4.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(45, 40, 200, 200);
        image.add(image2);

        //left pannel ko side ko:
//        JLabel hello = new JLabel("Welcome");
//        hello.setBounds(80, 220, 200, 40);
//        hello.setFont(new Font("Raleway", Font.BOLD, 30));
//        image.add(hello);
//
//        JLabel admin = new JLabel("Admin");
//        admin.setBounds(100, 260, 200, 40);
//        admin.setFont(new Font("Raleway", Font.BOLD, 30));
//        image.add(admin);
        JButton Logout = new JButton("Logout");
        Logout.setBounds(70, 450, 150, 40);
        image.add(Logout);

        Logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new EmployeeLogin().setVisible(true);
            }
        });

        //Attendence Details personal
        JButton viewDetail = new JButton("My Details");
        viewDetail.setBounds(70, 250, 150, 40);
        image.add(viewDetail);

        viewDetail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new EmployeeDetail(username);
            }
        });
        
        JButton approval = new JButton("Leave Approval");
        approval.setBounds(70, 350, 150, 40);
        image.add(approval);

        approval.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new EmpLeave_decision(username);
            }
        });

        //
        JLabel welcome = new JLabel("Welcome");
        welcome.setBounds(450, 50, 200, 40);
        welcome.setFont(new Font("Raleway", Font.BOLD, 30));
        add(welcome);

        JLabel efname = new JLabel(username);
        efname.setBounds(600, 50, 200, 40);
        efname.setFont(new Font("Raleway", Font.BOLD, 30));
        add(efname);

        JLabel text = new JLabel("Click here to make you attendance:");
        text.setBounds(400, 150, 200, 40);
//        text.setFont(new Font("Raleway", Font.BOLD, 20));
        add(text);

        JButton checkin = new JButton("check in");
        checkin.setBounds(610, 155, 150, 30);
        add(checkin);
        
        JLabel leave = new JLabel("Click here to take leave:");
        leave.setBounds(400, 260, 200, 40);
//        text.setFont(new Font("Raleway", Font.BOLD, 20));
        add(leave);

        JButton leavebtn = new JButton("Take Leave");
        leavebtn.setBounds(610, 265, 150, 30);
        add(leavebtn);

        checkin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

                try {
                    Conn c = new Conn();
                    String query = "Select * from employee where fname='" + username + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        fname = rs.getString("fname");
                        lname = rs.getString("lname");
                        address = rs.getString("address");
                        position = rs.getString("position");
                        status = "Present";
                    }
//                    System.out.println(""+fname+ ""+lname+""+address+ ""+position+ ""+status );
                    Conn co = new Conn();
                    String secquery = "insert into userAttendence values('" + fname + "','" + lname + "','" + address + "','" + position + "','" + status + "')";
                    co.s.executeUpdate(secquery);
                    JOptionPane.showMessageDialog(null, "Attendence has been taken");

                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }
        });
        
        leavebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                new Employee_leave_form(username);
            }
        });

        setSize(850, 600);
        setLocation(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        new EmployeeDashboard("");
    }

}
