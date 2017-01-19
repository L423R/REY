package ru.maxon.project.Util;

import ru.maxon.project.Model.*;

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
            ResultSet resultSet = statement.executeQuery("Select * from date_sem");

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

    public static void fillAll(StartModel startModel, String sem)
    {

        try {
            Connection connection = connector.getConnection();
            Statement statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from date_sem where НаимСем='"+sem+"'");
           // System.out.println(sem);
            while (resultSet.next())
            {
                startModel.setId(resultSet.getInt(1));
                startModel.setSem(resultSet.getString(2));
                startModel.setStartSem(resultSet.getDate(3));
                startModel.setEndSem(resultSet.getDate(4));
                startModel.setYear(resultSet.getString(5));
                startModel.setSemNumber(resultSet.getInt(6));
            }
            System.out.println(startModel);
            statement.close();
            connector.putConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<KafModel> getKafArray()
    {
        ArrayList<KafModel> list = new ArrayList<>();
        try{
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from kaf");
            while (resultSet.next())
            {
                int kod = resultSet.getInt(1);
                String string = resultSet.getString(2);
                int rang = resultSet.getInt(3);
                KafModel kafModel = new KafModel(String.valueOf(kod),string,String.valueOf(rang));
                list.add(kafModel);
            }
            statement.close();
            connector.putConnection(connection);
            return list;

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<MetModel> getMetArray()
    {
        ArrayList<MetModel> list = new ArrayList<>();
        try{
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from metodists");
            while (resultSet.next())
            {
                String kod = String.valueOf(resultSet.getInt(1));
                String fname = resultSet.getString(3) ;
                String lname = resultSet.getString(2) ;
                String tname = resultSet.getString(4) ;
                String number = resultSet.getString(5) ;
                MetModel metModel = new MetModel(kod,fname,lname,tname,number);
                list.add(metModel);
            }
            statement.close();
            connector.putConnection(connection);
            return list;
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<ProgModel> getProgArray()
    {
        ArrayList<ProgModel> list = new ArrayList<>();
        try{
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from progs");

            while (resultSet.next())
            {
                int kod = resultSet.getInt(1);
                int kodNap = resultSet.getInt(2);
                String name = resultSet.getString(3);
                String prof = resultSet.getString(4);
                String kval = resultSet.getString(5);
                String form = resultSet.getString(6);
                String srok = resultSet.getString(7);
                String prim = resultSet.getString(8);
                ProgModel progModel = new ProgModel(kod,kodNap,name,prof,kval,form,srok,prim);
                list.add(progModel);
            }
            statement.close();
            connector.putConnection(connection);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static ArrayList<NaprModel> getNaprArray() {
        ArrayList<NaprModel> list = new ArrayList<>();

        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from napravl");

            while (resultSet.next())
            {
                int kod = resultSet.getInt(1);
                String name = resultSet.getString(2);

                NaprModel naprModel = new NaprModel(kod,name);
                list.add(naprModel);
            }
            statement.close();
            connector.putConnection(connection);
            return list ;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<DiscModel> getDiscArray() {
        ArrayList<DiscModel> list = new ArrayList<>();

        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            Statement statement1 = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from disc");
            while (resultSet.next())
            {
                int kod = resultSet.getInt(1);
                String nameDisc = resultSet.getString(2);
                int kodKaf = resultSet.getInt(3);
                int rangKaf=0;
                String kafName = "";
                ResultSet executeQuery = statement1.executeQuery("select НаимКаф, РангКаф from kaf where КодКаф=" + kodKaf);
                if (executeQuery.next())
                {
                    kafName = executeQuery.getString(1);
                    rangKaf = executeQuery.getInt(2);
                }
                DiscModel discModel = new DiscModel(kod,nameDisc,kafName,rangKaf);
                list.add(discModel);
              //  System.out.println(kod+" "+nameDisc+" "+kodKaf+" "+rangKaf+" "+kafName);
              //  executeQuery.close();
            }
            statement.close();
            statement1.close();
            connector.putConnection(connection);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
