package employee.record.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.sql.*;
public class Employee_leave_approve extends JFrame {

    String fname;
    String lname;
    String address;
    String position;
    String status,ltype,reason,sdate,edate;
    Employee_leave_approve(String username) {
        setLayout(null);
//        
     JLabel title = new JLabel("Leave Approve/Reject");
        title.setBounds(150, 20, 300, 40);
        title.setFont(new Font("Raleway", Font.BOLD, 20));
        add(title);
        try {
            Conn c = new Conn();
            String query = "select * from userleave where fname='" + username + "' ";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                fname = rs.getString("fname");
                lname = rs.getString("lname");
                address = rs.getString("address");
                position = rs.getString("position");
                ltype=rs.getString("leave_type");
                reason=rs.getString("reason");
                sdate=rs.getString("startdate");
                edate=rs.getString("enddate");
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
//        lblname.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblname.setForeground(Color.B);
        add(lblname);

        JLabel labellast = new JLabel("Last name:");
        labellast.setBounds(50, 150, 100, 30);
        labellast.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labellast);

        JLabel lbllast = new JLabel(lname);
        lbllast.setBounds(160, 150, 200, 30);
//        lbllast.setFont(new Font("Raleway", Font.BOLD, 15));
//            lbllast.setForeground(Color.RED);
        add(lbllast);

        JLabel labelAddress = new JLabel("Address:");
        labelAddress.setBounds(50, 200, 100, 30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelAddress);

        JLabel lbladdress = new JLabel(address);
        lbladdress.setBounds(160, 200, 200, 30);
//        lbladdress.setFont(new Font("Raleway", Font.BOLD, 15));
//            lbladdress.setForeground(Color.RED);
        add(lbladdress);

        JLabel labelposition = new JLabel("Position:");
        labelposition.setBounds(50, 250, 100, 30);
        labelposition.setFont(new Font("Raleway", Font.BOLD, 15));
        add(labelposition);

        JLabel lblposition = new JLabel(position);
        lblposition.setBounds(160, 250, 200, 30);
//        lblposition.setFont(new Font("Raleway", Font.BOLD, 15));
//            lblposition.setForeground(Color.RED);
        add(lblposition);

        JLabel Type = new JLabel("Leave type*:");
        Type.setBounds(50, 300, 300, 40);
        Type.setFont(new Font("Raleway", Font.BOLD, 15));
        add(Type);

        
        JLabel cbpositiontxt = new JLabel(ltype);
        cbpositiontxt.setBounds(160, 305, 200, 30);
        add(cbpositiontxt);

        JLabel reasons = new JLabel("Reason*:");
        reasons.setBounds(50, 350, 100, 30);
        reasons.setFont(new Font("Raleway", Font.BOLD, 15));
        add(reasons);

        JLabel lblReason = new JLabel(reason);
        lblReason.setBounds(160, 355, 200, 30);
        add(lblReason);
     
        JLabel startDate = new JLabel("From*:");
        startDate.setBounds(50, 400, 100, 30);
        startDate.setFont(new Font("Raleway", Font.BOLD, 15));
        add(startDate);

        JLabel sdatee = new JLabel(sdate);
        sdatee.setBounds(160, 400, 100, 30);
        add(sdatee);

        JLabel endDate = new JLabel("To*:");
        endDate.setBounds(270, 400, 110, 30);
        endDate.setFont(new Font("Raleway", Font.BOLD, 15));
        add(endDate);

        JLabel edatee = new JLabel(edate);
        edatee.setBounds(305, 400, 110, 30);
        add(edatee);

        JButton approve = new JButton("Approve");
        approve.setBounds(120, 480, 100, 40);
        add(approve);
        
        approve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                

                String firstname = lblname.getText();
                String lastame = lbllast.getText();
                String address = lbladdress.getText();
                String position = lblposition.getText();
                String typee = cbpositiontxt.getText();
                String reason = lblReason.getText();
                String startdate = sdatee.getText();
                String enddate = edatee.getText();
                String status ="Approved";
                
                try{
                    Conn conn=new Conn();
                    String query="update userleave set fname='"+firstname+"', lname='"+lastame+"', address='"+address+"', position='"+position+"', leave_type='"+typee+"', reason='"+reason+"', startdate='"+startdate+"', enddate='"+enddate+"', leave_type='"+typee+"', status='"+status+"' where fname='"+fname+"'";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Detail has been updated");
                    setVisible(false);
//                    new Home();
                    new Leave();
                }catch(Exception e){
                    e.printStackTrace();
                }
               
            }
        });
        
        JButton reject = new JButton("Reject");
        reject.setBounds(250, 480, 100, 40);
        add(reject);
        
        reject.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                

                String firstname = lblname.getText();
                String lastame = lbllast.getText();
                String address = lbladdress.getText();
                String position = lblposition.getText();
                String typee = cbpositiontxt.getText();
                String reason = lblReason.getText();
                String startdate = sdatee.getText();
                String enddate = edatee.getText();
                String status ="Rejected";
                
                try{
                    Conn conn=new Conn();
                    String query="update userleave set fname='"+firstname+"', lname='"+lastame+"', address='"+address+"', position='"+position+"', leave_type='"+typee+"', reason='"+reason+"', startdate='"+startdate+"', enddate='"+enddate+"', leave_type='"+typee+"', status='"+status+"' where fname='"+fname+"'";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Detail has been updated");
                    setVisible(false);
//                    new Home();
                    new Leave();
                }catch(Exception e){
                    e.printStackTrace();
                }
               
            }
        });
//
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocation(500, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee_leave_approve("");
    }
}
