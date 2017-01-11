package ru.maxon.project.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Maxon on 11.01.2017.
 */
public class RabIntervalFrame extends JFrame {

    private JLabel label1;
    private JLabel label2= new JLabel("Задайте рабочий интервал д.мм.гггг");
    private JLabel label3 = new JLabel("по");
    private JTextField textField1 = new JTextField(10);
    private JTextField textField2 = new JTextField(10);
    private JButton button = new JButton("OK");
    public RabIntervalFrame(String text) throws HeadlessException {
        super("Interval");
        setBounds(500,300,300,200);
        label1= new JLabel("Текущий семестр "+text);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

        container.add(label1);
        container.add(label2);
        container.add(textField1);
        container.add(label3);
        container.add(textField2);
        container.add(button);

    }


}
