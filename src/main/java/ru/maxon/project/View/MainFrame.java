package ru.maxon.project.View;

import ru.maxon.project.Controller.Controller;
import ru.maxon.project.View.mainFrame.InfoPanel;
import ru.maxon.project.View.mainFrame.tabbedPanels.DocsPanel;
import ru.maxon.project.View.mainFrame.tabbedPanels.OtchetPanel;
import ru.maxon.project.View.mainFrame.tabbedPanels.PrepodPanel;
import ru.maxon.project.View.mainFrame.tabbedPanels.RaspPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxon on 12.01.2017.
 */
public class MainFrame extends JFrame {

    public static Controller controller;
    /*public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame(null);
        mainFrame.setVisible(true);
    }*/

    public MainFrame(Controller controller) throws HeadlessException {
        MainFrame.controller = controller;
        setBounds(500,0,580,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Факультет дистанционного обучения");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);



        JTabbedPane tabbedPane = new JTabbedPane();
        Font font = new Font("Verdana", Font.BOLD, 15);
        tabbedPane.setFont(font);
        JPanel pane2 = new JPanel(new BorderLayout());
        tabbedPane.addTab("Расписание",new RaspPanel(new FlowLayout(FlowLayout.CENTER,150,10)));
        tabbedPane.addTab("Преподаватели",new PrepodPanel());
        tabbedPane.addTab("Документы",new DocsPanel());
        tabbedPane.addTab("Сводки и отчеты",new OtchetPanel());
        tabbedPane.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton button1 = new JButton("Выход из приложения");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        InfoPanel infoPanel = new InfoPanel();
        infoPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        //infoPanel.setPreferredSize(new Dimension(50,50));

        container.add(label1);
        container.add(infoPanel);
        container.add(tabbedPane);
        container.add(button1);
    }
}
