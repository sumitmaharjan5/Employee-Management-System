package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame {

    Home() {
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
        JLabel hello = new JLabel("Welcome");
        hello.setBounds(80, 220, 200, 40);
        hello.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(hello);

        JLabel admin = new JLabel("Admin");
        admin.setBounds(100, 260, 200, 40);
        admin.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(admin);

        JButton Logout = new JButton("Logout");
        Logout.setBounds(70, 500, 150, 40);
        image.add(Logout);

        Logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Login().setVisible(true);
            }
        });

        //
        JLabel heading = new JLabel("JATRA FASHION");
        heading.setBounds(500, 30, 600, 60);
        heading.setFont(new Font("Raleway", Font.BOLD, 50));
//        heading.setForeground(Color.RED);
        add(heading);

//        JLabel secheading = new JLabel("For");
//        secheading.setBounds(800, 55, 400, 40);
//        secheading.setFont(new Font("Raleway", Font.BOLD, 25));
//        add(secheading);
//
//        JLabel thirdheading = new JLabel("Jatra Fashion");
//        thirdheading.setBounds(740, 90, 400, 40);
//        thirdheading.setFont(new Font("Raleway", Font.BOLD, 25));
//        add(thirdheading);
        //add buton
        ImageIcon addimg = new ImageIcon(ClassLoader.getSystemResource("icons/addimg.png"));
        Image addimg2 = addimg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon addimg3 = new ImageIcon(addimg2);
        JButton add = new JButton(addimg3);
        add.setBounds(400, 150, 150, 100);
        add(add);
        JLabel addtxt = new JLabel("Add Employee");
        addtxt.setBounds(425, 220, 150, 100);
        addtxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(addtxt);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new AddEmployee().setVisible(true);
            }
        });

        // view button
        ImageIcon viewimg = new ImageIcon(ClassLoader.getSystemResource("icons/view logo.png"));
        Image viewimg2 = viewimg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon viewimg3 = new ImageIcon(viewimg2);
        JButton view = new JButton(viewimg3);
        view.setBounds(630, 150, 150, 100);
        add(view);
        JLabel viewtxt = new JLabel("View Records");
        viewtxt.setBounds(655, 220, 150, 100);
        viewtxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(viewtxt);

        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new ViewRecords().setVisible(true);
            }
        });

        //Remove button
        ImageIcon removeimg = new ImageIcon(ClassLoader.getSystemResource("icons/remove logo.png"));
        Image removeimg2 = removeimg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon removeimg3 = new ImageIcon(removeimg2);
        JButton remove = new JButton(removeimg3);
        remove.setBounds(850, 150, 150, 100);
        add(remove);
        JLabel removetxt = new JLabel("Remove Employee");
        removetxt.setBounds(860, 220, 150, 100);
        removetxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(removetxt);

        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new RemoveEmployee().setVisible(true);
            }
        });

        //attendence
        ImageIcon attendenceimg = new ImageIcon(ClassLoader.getSystemResource("icons/attendence.png"));
        Image attendenceimg2 = attendenceimg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon attendenceimg3 = new ImageIcon(attendenceimg2);
        JButton attendence = new JButton(attendenceimg3);
        attendence.setBounds(400, 350, 150, 100);
        add(attendence);
        JLabel attendencetxt = new JLabel("Attendence");
        attendencetxt.setBounds(425, 420, 150, 100);
        attendencetxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(attendencetxt);
        attendence.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new ViewAttendence().setVisible(true);
            }
        });

        //leave
        ImageIcon leaveimg = new ImageIcon(ClassLoader.getSystemResource("icons/leave.png"));
        Image leaveimg2 = leaveimg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon leaveimg3 = new ImageIcon(leaveimg2);
        JButton leave = new JButton(leaveimg3);
        leave.setBounds(630, 350, 150, 100);
        add(leave);
        JLabel leavetxt = new JLabel("Leave Record");
        leavetxt.setBounds(655, 420, 150, 100);
        leavetxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(leavetxt);
        leave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Leave().setVisible(true);
            }
        });

        //Setting
        ImageIcon settingimg = new ImageIcon(ClassLoader.getSystemResource("icons/setting.png"));
        Image settingimg2 = settingimg.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon settingimg3 = new ImageIcon(settingimg2);
        JButton setting = new JButton(settingimg3);
        setting.setBounds(850, 350, 150, 100);
        add(setting);
        JLabel settingtxt = new JLabel("Setting");
        settingtxt.setBounds(900, 420, 150, 100);
        settingtxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(settingtxt);
        setting.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
//                setVisible(false);
                new Setting().setVisible(true);
            }
        });

        JLabel footer = new JLabel("Taking Fashion to next Level");
        footer.setBounds(550, 520, 600, 60);
        footer.setFont(new Font("Raleway", Font.BOLD, 20));
//        heading.setForeground(Color.RED);
        add(footer);
        JLabel footer2 = new JLabel("Jatra Fashion");
        footer2.setBounds(650, 540, 600, 60);
        add(footer2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1120, 630);
        setLocation(200, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Home();
    }

}
