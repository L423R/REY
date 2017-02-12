package ru.maxon.project.Controller;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import ru.maxon.project.Model.slovModels.DiscModel;
import ru.maxon.project.Model.slovModels.RaspModel;
import ru.maxon.project.Util.DBConnector;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Maxon on 19.01.2017.
 */
public class RaspController {

    private DiscModel discModel;
    private static DBConnector connector = new DBConnector();

    public String[] getCorrectGroups(String one,String two)
    {
        ArrayList<String> list = new ArrayList<>();
        String query1 = "SELECT groups.КодГр, groups.РасшПрог, rasp.Семестр, groups.СокрНГ, groups.ПрофПрог, groups.ДатаОткр, groups.ДатаЗакр\n" +
                "FROM rasp INNER JOIN groups ON rasp.КодГруп = groups.КодГр\n" +
                "WHERE rasp.ДатаЗан Between '"+one+"' And '"+two+"'\n" +
                "GROUP BY groups.КодГр, groups.РасшПрог, rasp.Семестр, groups.СокрНГ, groups.ПрофПрог, groups.ДатаОткр, groups.ДатаЗакр\n"+
                "HAVING groups.ДатаЗакр Is Null\n" +
                "ORDER BY groups.РасшПрог;";
        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query1);

            while (resultSet.next())
            {
                int kodGr = resultSet.getInt(1);
                String rashProg = resultSet.getString(2);
                int semestr = resultSet.getInt(3);
                String ng = resultSet.getString(4);
                String prof = resultSet.getString(5);
                if (prof==null) prof="";
                Date dateOp = resultSet.getDate(6);

                String name = rashProg+semestr+ng+prof;
                String name1 = rashProg+" "+semestr+" "+ng+" "+prof+" "+dateOp+"--"+name+"--"+kodGr;

                list.add(name1);
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

    public ArrayList<RaspModel> getRaspArray(String one,String two,int kodgr)
    {
        ArrayList<RaspModel> list = new ArrayList<>();
        String query ="SELECT rasp.КодРаспис, rasp.ДатаЗан, rasp.НачЗан, rasp.КолЧас, rasp.ТипЗан, rasp.ТипСтуд, rasp.День, disc.НаимДисц,  rasp.Ставка, rasp.ПрОпл, preps.Фамилия, preps.Имя, preps.Отчество, rasp.Примеч, concat(preps.Фамилия,' ', LEFT(preps.Имя,1),'.', LEFT(preps.Отчество,1),'.') AS IO\n" +
                "FROM (rasp INNER JOIN disc ON rasp.КодДисц = disc.КодДисц) LEFT JOIN preps ON rasp.КодПреп = preps.КодПреп\n" +
                "WHERE rasp.ДатаЗан Between '"+one+"' And '"+two+"' AND rasp.КодГруп="+kodgr+"\n" +
                "ORDER BY rasp.ДатаЗан;";
        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                Calendar calendar = Calendar.getInstance();
                int kod = resultSet.getInt(1);
                Date dateZ = resultSet.getDate(2);
                Timestamp timestamp = resultSet.getTimestamp(3);
                int kolCh = resultSet.getInt(4);
                String tipZ = resultSet.getString(5);
                String tipSt = resultSet.getString(6);
                String day = resultSet.getString(7);
                String nameDisc = resultSet.getString(8);
                float stavka = resultSet.getFloat(9);
                byte prOpl = resultSet.getByte(10);
                String prim = resultSet.getString(14);
                String fio = resultSet.getString(15);
                DateTime dateTime = new DateTime(timestamp.getTime(), DateTimeZone.UTC);
                String x = dateTime.getHourOfDay() + ":" + dateTime.getMinuteOfHour();
                RaspModel model = new RaspModel(kod,dateZ,x,kolCh,tipZ,tipSt,day,nameDisc,stavka,prOpl,fio,prim);
                list.add(model);

            }
            statement.close();
            connector.putConnection(connection);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
