package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxon on 19.01.2017.
 */
public class EditButtons extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        frame.add(new EditButtons());
        frame.setVisible(true);
    }
    public EditButtons() {
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(400,100));
        JButton button1 = new JButton("Изменить");
        JButton button2 = new JButton("Добавить");
        JButton button3 = new JButton("Удалить");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(button1);
        add(button2);
        add(button3);
    }
}
