package ru.maxon.project.View.mainFrame.tabbedPanels.docsElems;

import ru.maxon.project.Controller.DocsController;
import ru.maxon.project.View.mainFrame.tabbedPanels.docsElems.stavElems.StavkiSlov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxon on 22.01.2017.
 */
public class StavFrame extends JFrame {

    public static void main(String[] args) {
        StavFrame stavFrame = new StavFrame(new DocsController());
        stavFrame.setVisible(true);
    }
    public StavFrame(final DocsController docsController) throws HeadlessException {
        setBounds(500,0,500,290);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label1 = new JLabel("Введите/отредактируйте наименования кафедры");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);
        Dimension dimension = new Dimension(400,30);
        final JButton button1 = new JButton("Учебно-методическое сопровождение аудиторных занятий");
        final JButton button2 = new JButton("Сопровождение курса в СДО");
        final JButton button3 = new JButton("Online лекции, видеоконференции, семинары");
        final JButton button4 = new JButton("Разработка учебно-методических материалов");
        final JButton button5 = new JButton("Руководство работами (курсовые, дипломные), программами");
        button1.setPreferredSize(dimension);
        button2.setPreferredSize(dimension);
        button3.setPreferredSize(dimension);
        button4.setPreferredSize(dimension);
        button5.setPreferredSize(dimension);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StavkiSlov stavkiSlov = new StavkiSlov(docsController,button1.getText(),1);
                stavkiSlov.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StavkiSlov stavkiSlov = new StavkiSlov(docsController,button2.getText(),2);
                stavkiSlov.setVisible(true);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StavkiSlov stavkiSlov = new StavkiSlov(docsController,button3.getText(),3);
                stavkiSlov.setVisible(true);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StavkiSlov stavkiSlov = new StavkiSlov(docsController,button4.getText(),4);
                stavkiSlov.setVisible(true);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StavkiSlov stavkiSlov = new StavkiSlov(docsController,button5.getText(),5);
                stavkiSlov.setVisible(true);
            }
        });
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);


    }
}
