package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import ru.maxon.project.Model.slovModels.DiscModel;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelDisc;
import ru.maxon.project.Util.Queries;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 19.01.2017.
 */
public class DiscSlov extends JFrame {

   /* public static void main(String[] args) {
        DiscSlov discSlov = new DiscSlov();
        discSlov.setVisible(true);
    }*/

    public DiscSlov() throws HeadlessException {
       // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,0,750,600);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Введите/отредактируйте дисциплины обучения");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        ArrayList<DiscModel> beans = Queries.getDiscArray();

        TableModel tableModel = new TableModelDisc(beans);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(700,400));
        contentPane.add(scrollPane);
        JTextField textField1 = new JTextField(3);
        JTextField textField2 = new JTextField(20);
        JTextField textField3 = new JTextField(20);
        JTextField textField4 = new JTextField(3);
        contentPane.add(textField1);
        contentPane.add(textField2);
        contentPane.add(textField3);
        contentPane.add(textField4);
        EditButtons editButtons = new EditButtons();
        contentPane.add(editButtons);
    }
}
