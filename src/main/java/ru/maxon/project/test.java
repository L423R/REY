package ru.maxon.project;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.sql.*;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by Maxon on 11.01.2017.
 */
public class test {
    public static void main(String[] args) {
       /* Date date = new Date(2016-1900,1,13);
        System.out.println(date);

        java.sql.Date date1 = new java.sql.Date(2016-1900,33,13);
        System.out.println(date1);

        String s="1.5.2017";
        String[] mas = s.split("\\.");
        int day= Integer.parseInt(mas[0]);
        int month= Integer.parseInt(mas[1]);
        int year= Integer.parseInt(mas[2]);
        System.out.println(year+" "+month+" "+day);
        System.out.println(new java.sql.Date(year,month,day));*/


       connect();
       /* try {
            testFrame();
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

    }


    public static void connect()
    {
        String name ="root";
        String password="root";
        String query = "SELECT groups.КодГр, groups.КодПрогр, groups.ДатаОткр, groups.СокрНГ, progs.НаимПрогр," +
                " groups.КодМет, metodists.Фамилия, groups.РасшПрог, groups.ПрофПрог, groups.ДатаЗакр, groups.Примеч, groups.ПрЭксп\n" +
                "FROM (groups LEFT JOIN metodists ON groups.КодМет = metodists.КодМет) LEFT JOIN progs ON groups.КодПрогр = progs.КодПрогр";
               // "ORDER BY groups.КодПрогр, groups.ДатаОткр DESC , groups.СокрНГ";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/diplom_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",name,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {

                int id = resultSet.getInt(1);
                int kodProg = resultSet.getInt(2);
                java.sql.Date dateOp = resultSet.getDate(3);
                String ng = resultSet.getString(4);
                String nameProg = resultSet.getString(5);
                String nameMet = resultSet.getString(7);
                String raschProg = resultSet.getString(8);
                String profProg = resultSet.getString(9);
                java.sql.Date dateCl = resultSet.getDate(10);
                String prim = resultSet.getString(11);
                byte xEcsp = resultSet.getByte(12);
                System.out.println(id+" "+kodProg+" "+dateOp+" "+ng+" "+nameProg+" "+nameMet+" "+raschProg+" "+profProg+" "+dateCl+" "+prim+" "+xEcsp);
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testFrame() throws ParseException {
        JFrame frame = new JFrame();

        MaskFormatter mf = new MaskFormatter("##.##.####");
        mf.setPlaceholderCharacter('_');
        JFormattedTextField ftf = new JFormattedTextField(mf);

        frame.add(ftf);
        frame.pack();
        frame.setVisible(true);
        System.out.println(ftf.getText());
    }
}
