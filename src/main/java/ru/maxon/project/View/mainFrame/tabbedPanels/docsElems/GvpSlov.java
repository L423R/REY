package ru.maxon.project.View.mainFrame.tabbedPanels.docsElems;

import ru.maxon.project.Controller.DocsController;
import ru.maxon.project.Model.slovModels.GvpModel;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelGvp;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 22.01.2017.
 */
public class GvpSlov extends JFrame{
    public static void main(String[] args) {
        GvpSlov gvpSlov = new GvpSlov(new DocsController());
        gvpSlov.setVisible(true);
    }

    public GvpSlov(DocsController docsController) throws HeadlessException {
        setBounds(500,0,500,600);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel label1 = new JLabel("Введите/отредактируйте наименования кафедры");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        ArrayList<GvpModel> list  = docsController.getGvpArray();

        TableModel model = new TableModelGvp(list);
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
    public final static void setColumnsWidth(JTable table) {
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JTableHeader th = table.getTableHeader();
        for (int i = 0; i < table.getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            int prefWidth =
                    Math.round(
                            (float) th.getFontMetrics(
                                    th.getFont()).getStringBounds(th.getTable().getColumnName(i),
                                    th.getGraphics()
                            ).getWidth()
                    );
            column.setPreferredWidth(prefWidth + 10);
        }
    }
}
