package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import ru.maxon.project.Model.NaprModel;
import ru.maxon.project.Model.tablesModel.TableModelNapr;
import ru.maxon.project.Util.Queries;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 18.01.2017.
 */
public class NaprSlov extends JFrame{
    public static void main(String[] args) {
        NaprSlov naprSlov = new NaprSlov();
        naprSlov.setVisible(true);
    }

    public NaprSlov() throws HeadlessException {

       // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,0,550,600);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Введите/отредактируйте наименования кафедры");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        ArrayList<NaprModel> beans = Queries.getNaprArray();

        TableModel tableModel = new TableModelNapr(beans);
        JTable table = new JTable(tableModel);
        contentPane.add(new JScrollPane(table));
    }
}
