package ru.maxon.project.View.mainFrame;

import ru.maxon.project.View.MainFrame;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Maxon on 12.01.2017.
 */
public class InfoPanel extends JPanel {

    public InfoPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        setBorder(new TitledBorder(new LineBorder(Color.BLUE),"Инфо"));
       // Font font = new Font("Verdana", Font.BOLD, 8);

        JLabel label1 = new JLabel("Текущий семестр:");
        label1.setForeground(Color.RED);
        JLabel label2 = new JLabel(MainFrame.controller.getModelYear());
        JLabel label3 = new JLabel("уч.год");
        label3.setForeground(Color.blue);
        JLabel label4 = new JLabel(MainFrame.controller.getModelSemNumber());
        JLabel label5 = new JLabel("полугодие");
        label5.setForeground(Color.blue);
        JLabel label6 = new JLabel("с");
        label6.setForeground(Color.GREEN);
        JLabel label7 = new JLabel(MainFrame.controller.getModelSemStart());
        JLabel label8 = new JLabel("по");
        label8.setForeground(Color.GREEN);
        JLabel label9 = new JLabel(MainFrame.controller.getModelSemEnd());

        JLabel label10 = new JLabel("Рабочий интервал:");
        label10.setForeground(Color.RED);
        JLabel label11 = new JLabel("с");
        label11.setForeground(Color.GREEN);
        JLabel label12 = new JLabel(MainFrame.controller.getModelStartDateOfWork());
        JLabel label13 = new JLabel("по");
        label13.setForeground(Color.GREEN);
        JLabel label14 = new JLabel(MainFrame.controller.getModelEndDateOfWork());

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(label11);
        add(label12);
        add(label13);
        add(label14);

    }
}
