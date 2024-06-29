
package employee.record.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ResetData extends JFrame{
    ResetData(){
        setTitle("Alert!");
        setLayout(null);
        
        JLabel alert = new JLabel("Note: Every Records Available will be deleted !");
        alert.setBounds(25, 20, 500, 40);
        alert.setFont(new Font("Raleway", Font.BOLD, 15));
        alert.setForeground(Color.RED);
        add(alert);
        
        JButton okey = new JButton("Confirm");
        okey.setBounds(70, 80, 100, 30);
        add(okey);

        okey.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                  try {
                        Conn conn = new Conn();
                        String query = "DELETE FROM employee";
                        conn.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Datas Has been Deleted Completely !");
                        setVisible(false);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        });
        
        JButton denay = new JButton("Back");
        denay.setBounds(210, 80, 100, 30);
        add(denay);
        
        denay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
//                new Setting();
            }
        });
        
        setSize(400, 200);
        setLocation(850, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ResetData();
    }
}
