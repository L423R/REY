package ru.maxon.project.View;

import ru.maxon.project.Controller.StartFrameListener;

import javax.swing.*;
import java.awt.*;


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
    private JLabel label2= new JLabel("Задайте рабочий интервал д.м.гггг например 1.5.2017");
    private JLabel label3 = new JLabel("по");
    private JTextField textField1 = new JTextField(10);
    private JTextField textField2 = new JTextField(10);

    public StartFrame(StartFrameListener frameListener) throws HeadlessException {
        super("StartThis");
        this.frameListener = frameListener;
        setBounds(500,300,350,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String[] items = {
                "2016/2017 1",
                "2016/2017 2",
                "2017/2018 1",
        };

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        container.add(label1);
        container.add(label);


        comboBox.setModel(new DefaultComboBoxModel(items));
        comboBox.addActionListener(frameListener.actionListener);
        container.add(comboBox);


        button.addActionListener(frameListener.actionListener2);

        container.add(label2);
        container.add(label4);
        container.add(textField1);
        container.add(label3);
        container.add(textField2);
        container.add(button);
        System.out.println("textfield"+ textField1.getText());


    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }
}
