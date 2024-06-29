package employee.record.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Employee_leave_form extends JFrame {

    JComboBox cbpositiontxt;
    String fname;
    String lname;
    String address;
    String position;
    String status;
    
//    String firstname;
//    String lastname;
//    String eaddress;
//    String eposition;            
//    String type;
//    String startDate;
//    String endDate;

    Employee_leave_form(String username) {
        setTitle("Leave form");
        setLayout(null);

        JLabel title = new JLabel("Fill the form to take leave");
        title.setBounds(120, 20, 300, 40);
        title.setFont(new Font("Raleway", Font.BOLD, 20));
        add(title);

        try {
            Conn c = new Conn();
            String query = "select * from employee where fname='" + username + "' ";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                fname = rs.getString("fname");
                lname = rs.getString("lname");
                address = rs.getString("address");
                position = rs.getString("position");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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

        JLabel labelAddress = new JLabel("Address:");
        labelAddress.setBounds(50, 200, 100, 30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelAddress);

        JLabel lbladdress = new JLabel(address);
        lbladdress.setBounds(160, 200, 200, 30);
        lbladdress.setFont(new Font("Raleway", Font.BOLD, 15));
//            lbladdress.setForeground(Color.RED);
        add(lbladdress);

        JLabel labelposition = new JLabel("Position:");
        labelposition.setBounds(50, 250, 100, 30);
        labelposition.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelposition);

        JLabel lblposition = new JLabel(position);
        lblposition.setBounds(160, 250, 200, 30);
        lblposition.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblposition.setForeground(Color.RED);
        add(lblposition);

        JLabel Type = new JLabel("Leave type*:");
        Type.setBounds(50, 300, 300, 40);
        Type.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Type);

        String work[] = {"Please select the leave type", "Sick leave", "Bereavement leave", "Unpaid leave", "other"};
        cbpositiontxt = new JComboBox(work);
        cbpositiontxt.setBounds(160, 305, 200, 30);
        add(cbpositiontxt);

        JLabel reason = new JLabel("Reason*:");
        reason.setBounds(50, 350, 100, 30);
        reason.setFont(new Font("Raleway", Font.BOLD, 15));
        add(reason);

        JTextField lblReason = new JTextField();
        lblReason.setBounds(160, 355, 200, 30);
        add(lblReason);

        JLabel startDate = new JLabel("From*:");
        startDate.setBounds(50, 400, 100, 30);
        startDate.setFont(new Font("Raleway", Font.BOLD, 15));
        add(startDate);

        JDateChooser sdate = new JDateChooser();
        sdate.setBounds(160, 400, 100, 30);
        add(sdate);

        JLabel endDate = new JLabel("To*:");
        endDate.setBounds(270, 400, 110, 30);
        endDate.setFont(new Font("Raleway", Font.BOLD, 15));
        add(endDate);

        JDateChooser edate = new JDateChooser();
        edate.setBounds(305, 400, 110, 30);
        add(edate);

        JButton request = new JButton("Request");
        request.setBounds(150, 480, 100, 40);
        add(request);

        request.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String firstname = lblname.getText();
                String lastname = lbllast.getText();
//                String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
                String eaddress = lbladdress.getText();
                String eposition = lblposition.getText();
//                String position = (String) cbpositiontxt.getSelectedItem();
                String reason = lblReason.getText();
                String type = (String) cbpositiontxt.getSelectedItem();
                String startDate = ((JTextField) sdate.getDateEditor().getUiComponent()).getText();
                String endDate = ((JTextField) edate.getDateEditor().getUiComponent()).getText();
                String status="pending";


                try{
                    Conn conn=new Conn();
                    String query="insert into userleave values('"+firstname+"','"+lastname+"','"+eaddress+"','"+eposition+"','"+type+"','"+reason+"','"+startDate+"','"+endDate+"','"+status+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Detail has been added");
                    setVisible(false);
                    new Home();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Cancel");
        back.setBounds(300, 480, 100, 40);
        add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
            }
        });

        setSize(500, 600);
        setLocation(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee_leave_form("");
    }
}
