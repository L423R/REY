package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import ru.maxon.project.Controller.RaspController;
import ru.maxon.project.Model.slovModels.GroupModel;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelDisc;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelGroup;
import ru.maxon.project.Util.Queries;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 23.01.2017.
 */
public class GroupSlov  extends JFrame{
    public static void main(String[] args) {
        GroupSlov groupSlov = new GroupSlov(null);
        groupSlov.setVisible(true);
    }
    public GroupSlov(RaspController controller) throws HeadlessException {
        setBounds(500,0,750,600);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Введите/отредактируйте дисциплины обучения");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        ArrayList<GroupModel> beans = Queries.getGroupArray();
        TableModel tableModel = new TableModelGroup(beans);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(700,400));
        contentPane.add(scrollPane);
    }
}
