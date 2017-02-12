package ru.maxon.project.View.mainFrame.tabbedPanels.raspElems;

import org.jdesktop.swingx.JXDatePicker;
import ru.maxon.project.Controller.RaspController;
import ru.maxon.project.Model.slovModels.RaspModel;
import ru.maxon.project.Model.slovModels.tablesModel.TableModelRasp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Maxon on 02.02.2017.
 */
public class CorrectRasp extends JFrame {

    public static void main(String[] args) {
        CorrectRasp correctRasp = new CorrectRasp(new RaspController());
        correctRasp.setVisible(true);
    }
    String date1;
    String date2;

    public CorrectRasp(final RaspController controller) throws HeadlessException {
        setBounds(400,0,500,150);
        final Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label1 = new JLabel("Просмотр/Коррекция расписаний занятий группы");
        label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        contentPane.add(label1);

        JLabel label2 = new JLabel("     c ");

        final ArrayList<String> list = new ArrayList<>();

        //final JComboBox comboBox = new JComboBox();
        final GroupPanel panel = new GroupPanel(controller);


        final String[] format1 = new String[1];
        final JXDatePicker picker = new JXDatePicker();
       // picker.setDate(Calendar.getInstance().getTime());
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        picker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = picker.getDate();
                format1[0] = simpleDateFormat.format(date);
                System.out.println(format1[0]);

            }
        });

        JLabel label3 = new JLabel(" по ");

        final String[] format2 = new String[1];
        final JXDatePicker picker1 = new JXDatePicker();
        //picker.setDate(Calendar.getInstance().getTime());
        final SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        picker1.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        picker1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = picker1.getDate();
                format2[0] = simpleDateFormat1.format(date);


            }
        });


       // JLabel label4 = new JLabel("      Группы      ");
        final JLabel label5 = new JLabel("      ");


       JButton button1 = new JButton("Получить список групп");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] correctGroups = controller.getCorrectGroups(format1[0], format2[0]);
                date1=format1[0];
                date2=format2[0];
                if (correctGroups.length>0) {
                   panel.UpdateBox(correctGroups);
                   panel.setVisible(true);
                }

            }
        });





        contentPane.add(label2);
        contentPane.add(picker);
        contentPane.add(label3);
        contentPane.add(picker1);
        contentPane.add(button1);
        contentPane.add(panel);
        panel.setVisible(false);


    }



    public class GroupPanel extends JPanel
    {
        String[] mas;
        private JComboBox comboBox = new JComboBox();
        public GroupPanel(final RaspController controller) {
            setLayout(new FlowLayout());
            JLabel label1 = new JLabel("Выберите группу из списка");

            final JLabel label2 = new JLabel();
            final int[] kod = new int[1];

            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JComboBox box = (JComboBox) e.getSource();
                    Object selectedItem = box.getSelectedItem();

                    for (String s:mas)
                    {
                        String[] split = s.split("--");
                        if (split[0].equals((String)selectedItem)) {
                            label2.setText(split[1]);
                            kod[0] =Integer.parseInt(split[2]);
                        }
                    }
                }
            });

            JButton button2 = new JButton("Получить расписание группы");
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    RaspFrame frame = new RaspFrame(controller,date1,date2,kod[0]);
                    frame.setVisible(true);
                }
            });

           // this.add(label1);
            this.add(comboBox);
            this.add(button2);
            this.add(label2);


        }

        public void UpdateBox(String[] mas)
        {
            comboBox.removeAllItems();
            this.mas = mas;
            for (String s:mas)
            {
                comboBox.addItem(s.split("--")[0]);
            }
        }


    }

    public class RaspFrame extends JFrame
    {
        public RaspFrame(RaspController controller,String one,String two,int kod) throws HeadlessException {
            setBounds(300,160,900,400);
            Container contentPane = getContentPane();
            contentPane.setLayout(new FlowLayout());
            JLabel label1 = new JLabel("Расписание занятий группы");
            label1.setFont(new Font("TimesRoman", Font.BOLD, 18));
            ArrayList<RaspModel> list = controller.getRaspArray(date1,date2,kod);
            TableModelRasp tableModel = new TableModelRasp(list);
            JTable table = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setPreferredSize(new Dimension(880,300));


            System.out.println(one+" "+two+" "+kod);
            contentPane.add(label1);
            contentPane.add(scrollPane);
        }
    }
}
