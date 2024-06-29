/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.record.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash() {
        setTitle("Jatra Fashion");

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //For Heading label
        JLabel heading = new JLabel("JATRA FASHION");
        heading.setBounds(250, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 80));
        heading.setForeground(Color.RED);
        add(heading);

        //image in front page. 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pic1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        //Button in front page.
//        JButton click = new JButton("CLICK HERE TO CONTINUE");
//        click.setBounds(400, 400, 300, 70);
////        click.setBackground(Color.WHITE); // button ko color ko lagi
////        click.setForeground(Color.BLACK);
//        //image.add helps to add button in accordance the image(image ko agadi lerauxa)
////        click.addActionListener(this);
//        image.add(click);
        setSize(1170, 650);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        try {
            Thread.sleep(3000);
            setVisible(false);
            new Login();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    public void actionPerformed(ActionEvent ae) {
//        setVisible(false);
//        new Login();
//
//    }
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        new Splash();

    }
}
