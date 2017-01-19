package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxon on 16.01.2017.
 */
public class Slovar extends JFrame {
    public static void main(String[] args) {
        Slovar slovar = new Slovar();
        slovar.setVisible(true);
    }

    public Slovar() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,0,550,600);
        setMaximumSize(new Dimension(550,600));
        Container contentPane  = getContentPane();
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        contentPane.setLayout(gbl);

        JLabel label1 = new JLabel("Факультет дистанционного обучения");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        addComponent(contentPane,label1,0,0,GridBagConstraints.REMAINDER,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(0,0,40,0),1.0,0.0);
        JLabel label2 = new JLabel("kod");
        addComponent(contentPane,label2,0,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(0,0,0,0),0.0,0.0);
        JLabel label3 = new JLabel("name");
        addComponent(contentPane,label3,1,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(0,0,0,0),1.0,0.0);
        JLabel label4 = new JLabel("rang");
        addComponent(contentPane,label4,2,1,1,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(0,0,0,0),1.0,0.0);
       String[] mas = new String[100];

        for (int i = 0; i < 30; i++) {
            mas[i] = "2 123 213123";
        }
        final JList<String> list = new JList<>(mas);
        JScrollPane scrollPane = new JScrollPane(list);
       // scrollPane.setViewportView(list);

        /*
        for (int i = 0; i < 30; i++) {
            mas[i] = "namenamenamenamenamenamename";
        }
        final JList<String> list1 = new JList<>(mas);
        JScrollPane scrollPane1 = new JScrollPane(list1);


        for (int i = 0; i < 30; i++) {
            mas[i] = "99";
        }
        final JList<String> list2 = new JList<>(mas);
        JScrollPane scrollPane2 = new JScrollPane(list2);

        JScrollBar jsb = scrollPane.getVerticalScrollBar();
        JScrollBar jsb1 = scrollPane1.getVerticalScrollBar();
        JScrollBar jsb2 = scrollPane2.getVerticalScrollBar();


        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jsb.setStartModel(jsb2.getStartModel());
        jsb1.setStartModel(jsb.getStartModel());
      //  scrollPane1.setViewportView(list1);
      //  scrollPane2.setViewportView(list2);
        addComponent(contentPane,scrollPane,0,2,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,new Insets(0,0,0,0),1.0,1.0);

        addComponent(contentPane,scrollPane1,1,2,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,new Insets(0,0,0,0),1.0,1.0);

        addComponent(contentPane,scrollPane2,2,2,1,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,new Insets(0,0,0,0),1.0,1.0);




        */
       /*JScrollPane scrollPane = new JScrollPane();
       JPanel panel = new JPanel(new FlowLayout());
        for (int i = 0; i < 15; i++) {
            JTextField field1 = new JTextField(30);
            JTextField field2 = new JTextField(100);
            JTextField field3 = new JTextField(30);
            panel.add(field1);
            panel.add(field2);
            panel.add(field3);
        }*/
       // scrollPane.setViewportView(panel);
        addComponent(contentPane,scrollPane,0,2,3,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0.0,1.0);

        final JTextField field1 = new JTextField(30);
        final JTextField field2 = new JTextField(100);
        final JTextField field3 = new JTextField(30);
        addComponent(contentPane,field1,0,3,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0.0,0.0);
        addComponent(contentPane,field2,1,3,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),1.0,0.0);
        addComponent(contentPane,field3,2,3,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),1.0,0.0);

        JButton button1 = new JButton("Edit");
        JButton button2 = new JButton("remove");
        JButton button3 = new JButton("Update and save");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] selectedValues = list.getSelectedValue().split(" ");
                System.out.println(selectedValues.length);
                field1.setText(selectedValues[0]);
                field2.setText(selectedValues[1]);
                field3.setText(selectedValues[2]);
                //field1.setText(selectedValue.split("")[0]);
            }
        });

        addComponent(contentPane,button1,0,4,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0.0,0.0);
        addComponent(contentPane,button2,1,4,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),1.0,0.0);
        addComponent(contentPane,button3,2,4,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),1.0,0.0);







    }
    private static void addComponent(Container container, Component component, int gridx, int gridy,
                                     int gridwidth, int gridheight, int anchor, int fill, Insets insets,double weightx,double weighty) {
        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty,
                anchor, fill, insets, 0, 0);
        container.add(component, gbc);
    }
}
