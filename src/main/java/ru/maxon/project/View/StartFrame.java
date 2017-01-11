package ru.maxon.project.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dracula on 10.01.2017.
 */
public class StartFrame extends JFrame {

    private JLabel label = new JLabel("Выберите текущий семестр");
    private JComboBox comboBox = new JComboBox();
    private JButton button = new JButton("OK");

    public StartFrame() throws HeadlessException {
        super("StartThis");
        setBounds(500,300,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String[] items = {
                "2016/2017 1",
                "2016/2017 2",
                "2017/2018 1",
        };

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));


        container.add(label);


        comboBox.setModel(new DefaultComboBoxModel(items));
        comboBox.addActionListener(actionListener);
        container.add(comboBox);


        button.addActionListener(actionListener2);
        container.add(button);



    }

    private ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JComboBox box = (JComboBox) e.getSource();
            label.setText((String) box.getSelectedItem());
        }
    };

    private ActionListener actionListener2 = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (!label.getText().equals("Выберите текущий семестр")) {
                RabIntervalFrame rabIntervalFrame = new RabIntervalFrame(label.getText());
                StartFrame.this.setVisible(false);
                rabIntervalFrame.setVisible(true);
            }else
            {
                JOptionPane.showMessageDialog(StartFrame.this,"Выберите семестр");
            }
        }
    };
}
