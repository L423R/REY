package ru.maxon.project.Model.slovModels.tablesModel;

import ru.maxon.project.Model.slovModels.GvpModel;

import java.util.List;

/**
 * Created by Maxon on 22.01.2017.
 */
public class TableModelGvp extends TableModelAbstr {
    public TableModelGvp(List<?> beans) {
        super(beans);
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "код";
            case 1:
                return "Наим";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GvpModel bean = (GvpModel) beans.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                return bean.getKod();
            case 1:
                return bean.getName();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
}
