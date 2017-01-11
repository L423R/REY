package ru.maxon.project.View;

import ru.maxon.project.Controller.StartFrameListener;
import ru.maxon.project.Queries;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;


/**
 * Created by Dracula on 10.01.2017.
 */
public class StartFrame extends JFrame {

    private JLabel label1=new JLabel("Выберите текущий семестр:");
    public JLabel label = new JLabel("####/#### #");
    private JComboBox comboBox = new JComboBox();
    private JButton button = new JButton("OK");
    private StartFrameListener frameListener;

    private JLabel label4 = new JLabel("c");
    private JLabel label2= new JLabel("Задайте рабочий интервал дд.мм.гггг например 01.05.2017       ");
    private JLabel label3 = new JLabel("по");

    private JFormattedTextField textField1=null;
    private JFormattedTextField textField2 = null;

    public StartFrame(StartFrameListener frameListener) throws HeadlessException {
        super("StartThis");
        this.frameListener = frameListener;
        setBounds(500,300,390,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        container.add(label1);
        container.add(label);


        comboBox.setModel(new DefaultComboBoxModel(frameListener.getSemArray()));
        comboBox.addActionListener(frameListener.actionListener);
        container.add(comboBox);


        button.addActionListener(frameListener.actionListener2);

        MaskFormatter mf = null;
        try {
            mf = new MaskFormatter("##.##.####");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        mf.setPlaceholderCharacter('_');
        textField1 = new JFormattedTextField(mf);

        textField2 = new JFormattedTextField(mf);

        container.add(label2);
        container.add(label4);
        container.add(textField1);
        container.add(label3);
        container.add(textField2);
        container.add(button);

    }

    public JFormattedTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JFormattedTextField textField1) {
        this.textField1 = textField1;
    }

    public JFormattedTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JFormattedTextField textField2) {
        this.textField2 = textField2;
    }
}
