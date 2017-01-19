package ru.maxon.project.View.mainFrame.tabbedPanels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maxon on 19.01.2017.
 */
public class OtchetPanel extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        frame.add(new OtchetPanel());
        frame.setVisible(true);
    }
    public OtchetPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Dimension dimension = new Dimension(400,30);
        JButton button1 = new JButton("Журнал учета заработной платы преподавателей");
        JButton button2 = new JButton("расписание по группам");
        JButton button3 = new JButton("РЕЕСТРЫ(внешние,внутренние, по УМП)");
        JButton button4 = new JButton("Долги преподавателям ФДО(ДС не оформленные на интервале)");
        JButton button5 = new JButton("Заработная плата на интервале(ВСЕ за текущий месяц)");
        JButton button6 = new JButton("Преподаватели без ставки");
        button1.setPreferredSize(dimension);
        button2.setPreferredSize(dimension);
        button3.setPreferredSize(dimension);
        button4.setPreferredSize(dimension);
        button5.setPreferredSize(dimension);
        button6.setPreferredSize(dimension);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
    }
}
