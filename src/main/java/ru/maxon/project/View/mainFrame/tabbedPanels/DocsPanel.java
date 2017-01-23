package ru.maxon.project.View.mainFrame.tabbedPanels;

import ru.maxon.project.Controller.DocsController;
import ru.maxon.project.View.mainFrame.tabbedPanels.docsElems.GvpSlov;
import ru.maxon.project.View.mainFrame.tabbedPanels.docsElems.NrpSlov;
import ru.maxon.project.View.mainFrame.tabbedPanels.docsElems.StavFrame;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxon on 19.01.2017.
 */
public class DocsPanel extends JPanel {
    DocsController docsController = new DocsController();
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

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GvpSlov gvpSlov = new GvpSlov(docsController);
                    gvpSlov.setVisible(true);
                }
            });

            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    NrpSlov nrpSlov = new NrpSlov(docsController);
                    nrpSlov.setVisible(true);
                }
            });

            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    StavFrame stavFrame = new StavFrame(new DocsController());
                    stavFrame.setVisible(true);
                }
            });

            add(button1);
            add(button2);
            add(button3);
            add(button4);
        }
    }
}
