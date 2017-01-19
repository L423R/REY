package ru.maxon.project.View.mainFrame.tabbedPanels;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Maxon on 19.01.2017.
 */
public class DocsPanel extends JPanel {
    public DocsPanel() {
        setLayout(new FlowLayout());
        add(new Acts());
        add(new Norms());
    }

    public class Acts extends JPanel
    {
        public Acts() {
            setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
            setBorder(new TitledBorder(new LineBorder(Color.RED),"Формарование дополнительных соглашений и актов"));
            setPreferredSize(new Dimension(450,140));
            JButton button1 = new JButton("Учебно-метадическое сопровождение аудиторных занятий");
            JButton button2 = new JButton("Проведение учебно-методических работ");
            JButton button3 = new JButton("Закрепление курсовых работ за преподавателями");
            add(button1);
            add(button2);
            add(button3);
        }
    }

    public class Norms extends JPanel
    {
        public Norms() {
            setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
            setBorder(new TitledBorder(new LineBorder(Color.GREEN),"Нормативы"));
            setPreferredSize(new Dimension(450,140));
            JButton button1 = new JButton("Группы видов преднагрузки/Работ");
            JButton button2 = new JButton("Квалификация НПР");
            JButton button3 = new JButton("СТАВКИ");
            JButton button4 = new JButton("Реквизиты работодателя");
            add(button1);
            add(button2);
            add(button3);
            add(button4);
        }
    }
}
