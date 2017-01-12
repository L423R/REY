package ru.maxon.project.View.mainFrame;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxon on 12.01.2017.
 */
public class SlovPanel extends JPanel {

    public SlovPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        setBorder(new TitledBorder(new LineBorder(Color.RED),"Словари"));
        setPreferredSize(new Dimension(450,140));
        Font font = new Font("Verdana", Font.BOLD, 10);
        JButton button1= new JButton("Дисциплины");
        JButton button2= new JButton("Кафедры");
        JButton button3= new JButton("Программа обучения");
        JButton button4= new JButton("Группы");
        JButton button5= new JButton("Направления обучения");
        JButton button6= new JButton("Методисты ФДО");

        Dimension dimension = new Dimension(200, 20);
        button1.setPreferredSize(dimension);
        button1.setFont(font);

        button2.setPreferredSize(dimension);
        button2.setFont(font);

        button3.setPreferredSize(dimension);
        button3.setFont(font);

        button4.setPreferredSize(dimension);
        button4.setFont(font);

        button5.setPreferredSize(dimension);
        button5.setFont(font);

        button6.setPreferredSize(dimension);
        button6.setFont(font);

       /* button1.setAlignmentX(Component.RIGHT_ALIGNMENT);
        button2.setAlignmentX(Component.LEFT_ALIGNMENT);
        button3.setAlignmentX(Component.RIGHT_ALIGNMENT);*/



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

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
    }
}
