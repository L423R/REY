package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import ru.maxon.project.Model.slovModels.ProgModel;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelProg;
import ru.maxon.project.Util.Queries;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 18.01.2017.
 */
public class ProgSlov extends JFrame {

    public static void main(String[] args) {
        ProgSlov progSlov = new ProgSlov();
        progSlov.setVisible(true);
    }
    public ProgSlov() throws HeadlessException {

       // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,0,850,600);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Введите/отредактируйте программы обучения");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        ArrayList<ProgModel> beans = Queries.getProgArray();

        TableModel tableModel = new TableModelProg(beans);
        JTable table = new JTable(tableModel);
       // table.setPreferredSize(new Dimension(500,600));
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(800,400));
        contentPane.add(pane);
        JTextField textField1 = new JTextField(3);
        JTextField textField2 = new JTextField(3);
        JTextField textField3 = new JTextField(10);
        JTextField textField4 = new JTextField(15);
        JTextField textField5 = new JTextField(10);
        JTextField textField6 = new JTextField(10);
        JTextField textField7 = new JTextField(3);
        JTextField textField8 = new JTextField(10);

        contentPane.add(textField1);
        contentPane.add(textField2);
        contentPane.add(textField3);
        contentPane.add(textField4);
        contentPane.add(textField5);
        contentPane.add(textField6);
        contentPane.add(textField7);
        contentPane.add(textField8);
        contentPane.add(new EditButtons());
    }
}
