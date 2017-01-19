package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import ru.maxon.project.Model.MetModel;
import ru.maxon.project.Model.tablesModel.TableModelMet;
import ru.maxon.project.Util.Queries;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 18.01.2017.
 */
public class MetodistsSlov extends JFrame{

    public static void main(String[] args) {
        MetodistsSlov metodistsSlov = new MetodistsSlov();
        metodistsSlov.setVisible(true);
    }

    public MetodistsSlov() throws HeadlessException {
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,0,550,600);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Введите/отредактируйте наименования кафедры");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

       /* ArrayList<MetModel> beans = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            beans.add(new MetModel("kod"+i,"ivan"+i,"ivanov"+i,"semenovich"+i,"555 "+i));
        }*/
       ArrayList<MetModel> beans = Queries.getMetArray();

        TableModel tableModel = new TableModelMet(beans);
        JTable table = new JTable(tableModel);
        contentPane.add(new JScrollPane(table));
        JButton button1 = new JButton("same");
        JButton button2 = new JButton("same");
        JButton button3 = new JButton("same");
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
    }
}
