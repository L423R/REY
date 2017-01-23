package ru.maxon.project.View.mainFrame.tabbedPanels.docsElems.stavElems;

import ru.maxon.project.Controller.DocsController;
import ru.maxon.project.Model.slovModels.StavkiModel;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelStavki;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 23.01.2017.
 */
public class StavkiSlov extends JFrame{
    public static void main(String[] args) {
        StavkiSlov stavkiSlov = new StavkiSlov(new DocsController(),"keksov",2);
        stavkiSlov.setVisible(true);
    }

    public StavkiSlov(DocsController controller, String s, int num) throws HeadlessException {
        setBounds(400,0,900,490);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label1 = new JLabel("Введите/отредактируйте ставки группы: "+s);
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        ArrayList<StavkiModel> list = controller.getSazArray(num);

        TableModel tableModel = new TableModelStavki(list);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(800,300));

        double width = scrollPane.getPreferredSize().getWidth();

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int count=0;
        int size;
        for (int i = 1; i < 6 ; i++) {
            if (i==2)
            {
                size=110;
            }else size=70;
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth(size);
            count+=size;
        }
        count+=3;

        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth((int) (width-count));

        contentPane.add(scrollPane);
    }
}
