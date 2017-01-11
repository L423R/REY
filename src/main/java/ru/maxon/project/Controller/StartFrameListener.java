package ru.maxon.project.Controller;

import ru.maxon.project.Model.Model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

/**
 * Created by Maxon on 11.01.2017.
 */
public class StartFrameListener {

    private Model model;
    public StartFrameListener() {

    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JComboBox box = (JComboBox) e.getSource();
            model.setSemestr((String) box.getSelectedItem());
            model.getFrame().label.setText(model.getSemestr());
        }
    };

    public ActionListener actionListener2 = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (!(model.getSemestr() ==null))
            {

                try
                {
                    String[] mas = model.getFrame().getTextField1().getText().split("\\.");
                    int day= Integer.parseInt(mas[0]);
                    int month= Integer.parseInt(mas[1]);
                    int year= Integer.parseInt(mas[2]);
                    model.setStartDate(new Date(year-1900,month,day));
                    String [] mas1 = model.getFrame().getTextField2().getText().split("\\.");
                    day= Integer.parseInt(mas1[0]);
                    month= Integer.parseInt(mas1[1]);
                    year= Integer.parseInt(mas1[2]);
                    model.setEndDate(new Date(year-1900,month,day));
                    model.getFrame().setVisible(false);
                }catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(model.getFrame(),"Не верно введены даты работы");
                }
            }else
            {
                JOptionPane.showMessageDialog(model.getFrame(),"Выберите семестр");
            }
        }
    };
}
