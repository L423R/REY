package ru.maxon.project;

import ru.maxon.project.Model.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Maxon on 11.01.2017.
 */
public class Queries {

    private static DBConnector connector = new DBConnector();
    public static String[] getNameSem()
    {
        ArrayList<String> list = new ArrayList<>();
        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from sem_date");

            while (resultSet.next())
            {
                String string = resultSet.getString(2);
                list.add(string);
            }
            String[] mas = new String[list.size()];
            mas = list.toArray(mas);
            statement.close();
            connector.putConnection(connection);
            return mas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return null;
    }

    public static void fillAll(Model model,String sem)
    {

        try {
            Connection connection = connector.getConnection();
            Statement statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from sem_date where name_sem='"+sem+"'");
           // System.out.println(sem);
            while (resultSet.next())
            {
                model.setId(resultSet.getInt(1));
                model.setSem(resultSet.getString(2));
                model.setStartSem(resultSet.getDate(3));
                model.setEndSem(resultSet.getDate(4));
                model.setYear(resultSet.getString(5));
                model.setSemNumber(resultSet.getInt(6));
            }
            System.out.println(model);
            statement.close();
            connector.putConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
