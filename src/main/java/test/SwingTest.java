package test;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("A Frame");
        JButton jButton = new JButton("A Button");
//原来的写法
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pressed");
            }
        });

//λ 写法
        jButton.addActionListener(e -> System.out.println("Pressed"));


        jframe.add(jButton);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("");
    }
}
