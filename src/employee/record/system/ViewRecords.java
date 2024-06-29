package employee.record.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewRecords extends JFrame {

//    JTable table;
//    Choice cemployeeId;
//    JButton search, print, update;
    ViewRecords() {
        setLayout(null);
        setTitle("View EMPLOYEE");

        JLabel title = new JLabel("Choose a Department");
        title.setBounds(560, 30, 500, 40);
        title.setFont(new Font("Raleway", Font.BOLD, 30));
//        title.setForeground(Color.RED);
        add(title);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ray.jpg"));
        Image i2 = i1.getImage().getScaledInstance(560, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 300, 630);
        add(image);
        // image vitra ko image.
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/view logo.png"));
        Image i5 = i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(45, 40, 200, 200);
        image.add(image2);

        //left pannel ko side ko:
        JLabel hello = new JLabel("View ");
        hello.setBounds(100, 220, 200, 40);
        hello.setFont(new Font("Raleway", Font.BOLD, 30));
        image.add(hello);

        JLabel admin = new JLabel("Records");
        admin.setBounds(85, 260, 200, 40);
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

        // Manager Department
        ImageIcon addimg = new ImageIcon(ClassLoader.getSystemResource("icons/management.png"));
        Image addimg2 = addimg.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT);
        ImageIcon addimg3 = new ImageIcon(addimg2);
        JButton add = new JButton(addimg3);
        add.setBounds(480, 150, 150, 100);
        add(add);
        JLabel addtxt = new JLabel("Manager Department");
        addtxt.setBounds(480, 220, 150, 100);
        addtxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(addtxt);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Manager_Department_record().setVisible(true);
            }
        });

        //  // Designer Department
        ImageIcon viewimg = new ImageIcon(ClassLoader.getSystemResource("icons/designer.png"));
        Image viewimg2 = viewimg.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon viewimg3 = new ImageIcon(viewimg2);
        JButton view = new JButton(viewimg3);
        view.setBounds(750, 150, 150, 100);
        add(view);
        JLabel viewtxt = new JLabel("Designer Department");
        viewtxt.setBounds(750, 220, 180, 100);
        viewtxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(viewtxt);

        view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Disigner_Department_System().setVisible(true);
            }
        });

        // // Craft Department
        ImageIcon removeimg = new ImageIcon(ClassLoader.getSystemResource("icons/craft.png"));
        Image removeimg2 = removeimg.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon removeimg3 = new ImageIcon(removeimg2);
        JButton remove = new JButton(removeimg3);
        remove.setBounds(480, 350, 150, 100);
        add(remove);
        JLabel removetxt = new JLabel("Craft Department");
        removetxt.setBounds(490, 420, 150, 100);
        removetxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(removetxt);

        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Craft_Depaartment_records().setVisible(true);
            }
        });

        // // Knitter Department
        ImageIcon attendenceimg = new ImageIcon(ClassLoader.getSystemResource("icons/knitting.png"));
        Image attendenceimg2 = attendenceimg.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon attendenceimg3 = new ImageIcon(attendenceimg2);
        JButton attendence = new JButton(attendenceimg3);
        attendence.setBounds(750, 350, 150, 100);
        add(attendence);
        JLabel attendencetxt = new JLabel("Knitting Department");
        attendencetxt.setBounds(755, 420, 150, 100);
        attendencetxt.setFont(new Font("Raleway", Font.BOLD, 15));
        add(attendencetxt);
        attendence.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                setVisible(false);
                new Knitter_Department_System().setVisible(true);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1120, 630);
        setLocation(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewRecords();
    }
}
