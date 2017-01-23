package ru.maxon.project.Model.slovModels.tablesModel;

import ru.maxon.project.Model.slovModels.NrpModel;

import java.util.List;

/**
 * Created by Maxon on 22.01.2017.
 */
public class TableModelNpr extends TableModelAbstr {
    public TableModelNpr(List<?> beans) {
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
        NrpModel bean = (NrpModel) beans.get(rowIndex);
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
