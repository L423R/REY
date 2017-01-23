package ru.maxon.project.View.mainFrame.tabbedPanels.docsElems;

import ru.maxon.project.Controller.DocsController;
import ru.maxon.project.Model.slovModels.NrpModel;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelGvp;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelNpr;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 22.01.2017.
 */
public class NrpSlov extends JFrame{
    public static void main(String[] args) {
        NrpSlov nrpSlov = new NrpSlov(new DocsController());
        nrpSlov.setVisible(true);
    }
    public NrpSlov(DocsController docsController) throws HeadlessException {
        setBounds(500,0,500,600);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel label1 = new JLabel("Введите/отредактируйте наименования кафедры");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        ArrayList<NrpModel> list = docsController.getNrpArray();

        TableModel model = new TableModelNpr(list);
        JTable table = new JTable(model);
        //setColumnsWidth(table);




        JScrollPane scrollPane = new JScrollPane(table);
        double width = scrollPane.getPreferredSize().getWidth();

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(40);
        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth((int) (width-43));
        contentPane.add(scrollPane);
        JTextField textField1 = new JTextField(5);
        JTextField textField2 = new JTextField(35);
        contentPane.add(textField1);
        contentPane.add(textField2);
    }
}
