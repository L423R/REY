package ru.maxon.project.View;

import ru.maxon.project.Controller.Controller;

import javax.swing.*;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;


/**
 * Created by Dracula on 10.01.2017.
 */
public class StartFrame extends JFrame {

    private JLabel label = new JLabel("####/#### #");

    private JFormattedTextField textField1=null;
    private JFormattedTextField textField2 = null;

    public StartFrame(final Controller frameListener) throws HeadlessException {
        super("StartThis");
        //final Controller frameListener1 = frameListener;
        setBounds(500,300,390,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        // устанавливаем Look And Feel
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        JLabel label1 = new JLabel("Выберите текущий семестр:");
        container.add(label1);
        container.add(label);


        JComboBox comboBox = new JComboBox(frameListener.getSemArray());

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                Object selectedItem = box.getSelectedItem();
                label.setText((String) selectedItem);
            }
        });
        container.add(comboBox);


        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sem = label.getText();
                if (!(sem.equals("####/#### #")))
                {

                    try
                    {
                        String[] mas = textField1.getText().split("\\.");
                        int day= Integer.parseInt(mas[0]);
                        int month= Integer.parseInt(mas[1]);
                        int year= Integer.parseInt(mas[2]);
                        Date date1 = new Date(year - 1900, month, day);
                        String [] mas1 =textField2.getText().split("\\.");
                        day= Integer.parseInt(mas1[0]);
                        month= Integer.parseInt(mas1[1]);
                        year= Integer.parseInt(mas1[2]);
                        Date date2 = new Date(year - 1900, month, day);
                        frameListener.setAll(date1,date2,sem);
                        setVisible(false);
                        MainFrame mainFrame = new MainFrame(frameListener);
                        mainFrame.setVisible(true);

                    }catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(StartFrame.this,"Не верно введены даты работы");
                    }
                }else
                {
                    JOptionPane.showMessageDialog(StartFrame.this,"Выберите семестр");
                }
            }
        });

        MaskFormatter mf = null;
        try {
            mf = new MaskFormatter("##.##.####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        mf.setPlaceholderCharacter('_');
        textField1 = new JFormattedTextField(mf);

        textField2 = new JFormattedTextField(mf);

        JLabel label2 = new JLabel("Задайте рабочий интервал дд.мм.гггг например 01.05.2017       ");
        container.add(label2);
        JLabel label4 = new JLabel("c");
        container.add(label4);
        container.add(textField1);
        JLabel label3 = new JLabel("по");
        container.add(label3);
        container.add(textField2);
        container.add(button);

    }

}
