package ru.maxon.project.View.mainFrame.tabbedPanels;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Maxon on 18.01.2017.
 */
public class PrepodPanel extends JPanel {

    public PrepodPanel() {
        setLayout(new FlowLayout());
        add(new PrPanel());
    }

    public class PrPanel extends JPanel
    {
        public PrPanel() {
            setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
            setBorder(new TitledBorder(new LineBorder(Color.RED),"Преподаватели"));
            setPreferredSize(new Dimension(450,340));

            JButton button1 = new JButton("Ввод первичных данных");
            JButton button2 = new JButton("<html>Ввод/коррекция показателей<p>" +
                    " закрепление дисцеплин обучения<p>" +
                    " сведения о нагрузке<p>" +
                    " Печать документов оплаты услуг</html>");
            button2.setPreferredSize(new Dimension(300,200));
            JButton button3 = new JButton("Работа с АРХИВОМ");

            add(button1);
            add(button2);
            add(button3);
        }
    }

}
