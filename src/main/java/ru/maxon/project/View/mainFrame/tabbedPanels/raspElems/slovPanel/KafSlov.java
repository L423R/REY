package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems.slovPanel;

import ru.maxon.project.Model.KafModel;
import ru.maxon.project.Model.tablesModel.TableModelKaf;
import ru.maxon.project.Util.Queries;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Maxon on 18.01.2017.
 */
public class KafSlov extends JFrame {
    public static void main(String[] args) {
        KafSlov kafSlov = new KafSlov();
        kafSlov.setVisible(true);
    }

    public KafSlov() throws HeadlessException {
      //  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,0,700,400);
        setMaximumSize(new Dimension(550,600));


        ArrayList<KafModel> beans = Queries.getKafArray();

       // for (int i = 0; i < 30; i++) {
       //     beans.add(new KafModel("kod " + i, "name " + i, "rang " + i));
       // }

        final TableModel model = new TableModelKaf(beans);
        final JTable table = new JTable(model);

        Container contentPane  = getContentPane();
        GridBagLayout gbl = new GridBagLayout();
        contentPane.setLayout(gbl);

        JLabel label1 = new JLabel("Введите/отредактируйте наименования кафедры");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        addComponent(contentPane,label1,0,0,GridBagConstraints.REMAINDER,1,GridBagConstraints.NORTH,GridBagConstraints.NONE,new Insets(0,0,40,0),1.0,0.0);
        addComponent(contentPane,new JScrollPane(table),0,1,3,1,GridBagConstraints.NORTH,GridBagConstraints.BOTH,new Insets(0,0,10,0),0.0,1.0);

        final JTextField field1 = new JTextField(30);
        final JTextField field2 = new JTextField(100);
        final JTextField field3 = new JTextField(30);
        addComponent(contentPane,field1,0,2,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),1.0,0.0);
        addComponent(contentPane,field2,1,2,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),1.0,0.0);
        addComponent(contentPane,field3,2,2,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),1.0,0.0);

        ListSelectionModel selModel = table.getSelectionModel();

        selModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = table.getSelectedRow();
                Object mKod = model.getValueAt(selectedRow, 0);
                Object mName = model.getValueAt(selectedRow, 1);
                Object mRang = model.getValueAt(selectedRow, 2);
                field1.setText((String) mKod);
                field2.setText((String) mName);
                field3.setText((String) mRang);
            }
        });



        JButton button1 = new JButton("Add");
        JButton button2 = new JButton("remove");
        JButton button3 = new JButton("Update and save");

       /* button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] selectedValues = list.getSelectedValue().split(" ");
                System.out.println(selectedValues.length);
                field1.setText(selectedValues[0]);
                field2.setText(selectedValues[1]);
                field3.setText(selectedValues[2]);
                //field1.setText(selectedValue.split("")[0]);
            }
        });*/

        //addComponent(contentPane,button1,0,3,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(10,0,0,0),1.0,0.0);
       // addComponent(contentPane,button2,1,3,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(10,0,0,0),1.0,0.0);
       // addComponent(contentPane,button3,2,3,1,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(10,0,0,0),1.0,0.0);
        EditButtons buttons = new EditButtons();
        addComponent(contentPane,buttons,0,3,3,1,GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,new Insets(10,0,0,0),1.0,0.0);

    }

    private static void addComponent(Container container, Component component, int gridx, int gridy,
                                     int gridwidth, int gridheight, int anchor, int fill, Insets insets,double weightx,double weighty) {
        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty,
                anchor, fill, insets, 0, 0);
        container.add(component, gbc);
    }
}
