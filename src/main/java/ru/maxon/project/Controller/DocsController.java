package ru.maxon.project.Controller;



import ru.maxon.project.Model.slovModels.GvpModel;
import ru.maxon.project.Model.slovModels.NrpModel;
import ru.maxon.project.Model.slovModels.StavkiModel;
import ru.maxon.project.Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Maxon on 22.01.2017.
 */
public class DocsController {
    GvpModel gvpModel;
    private static DBConnector connector = new DBConnector();

    public ArrayList<GvpModel> getGvpArray() {
        ArrayList<GvpModel> list = new ArrayList<>();
        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from nagr_rab");

            while (resultSet.next())
            {
                int kod = resultSet.getInt(1);
                String name = resultSet.getString(2);

                GvpModel gvpModel = new GvpModel(kod,name);
                list.add(gvpModel);
            }
            statement.close();
            connector.putConnection(connection);
            return list ;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<NrpModel> getNrpArray() {
        ArrayList<NrpModel> list = new ArrayList<>();
        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from npr");

            while (resultSet.next())
            {
                int kod = resultSet.getInt(1);
                String name = resultSet.getString(2);

                NrpModel nrpModel = new NrpModel(kod,name);
                list.add(nrpModel);
            }
            statement.close();
            connector.putConnection(connection);
            return list ;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<StavkiModel> getSazArray(int num)
    {
        ArrayList<StavkiModel> list = new ArrayList<>();

        try{
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT stavki.КодСтав, stavki.НаимСтав, stavki.ЕдИзм, stavki.КодВида, npr.НаимНПР, stavki.КодНПР, stavki.Ставка_Спец, stavki.Ставка_Маг, stavki.Примеч FROM stavki INNER JOIN npr ON stavki.КодНПР = npr.КодНПР WHERE stavki.КодВида="+num+";");
            while (resultSet.next())
            {
                String nameStav = resultSet.getString(2);
                String izm = resultSet.getString(3);
                String npr = resultSet.getString(5);
                int stavkaSpec = resultSet.getInt(7);
                int stavkaMag = resultSet.getInt(8);
                String prim = resultSet.getString(9);

                StavkiModel stavkiModel = new StavkiModel(nameStav,izm,npr,stavkaSpec,stavkaMag,prim);
                list.add(stavkiModel);
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
