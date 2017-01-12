package ru.maxon.project.View.mainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxon on 12.01.2017.
 */
public class RaspPanel extends JPanel {
    public RaspPanel(LayoutManager layout) {
        super(layout);
        Font font = new Font("Verdana", Font.BOLD, 12);
        setPreferredSize(new Dimension(500,300));
        Dimension dimension = new Dimension(350,40);
        JButton button1 = new JButton("Формарование расписания в Группах");
        JButton button2 = new JButton("Коррекция расписаний Групп");
        JButton button3 = new JButton("Тиражирование расписания Группы");
        JButton button4 = new JButton("Тиражирование расписания Дисциплины");

        button1.setFont(font);
        button1.setPreferredSize(dimension);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        button2.setFont(font);
        button2.setPreferredSize(dimension);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        button3.setFont(font);
        button3.setPreferredSize(dimension);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button4.setFont(font);
        button4.setPreferredSize(dimension);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        JPanel panel = new SlovPanel();

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(panel);

    }
}
