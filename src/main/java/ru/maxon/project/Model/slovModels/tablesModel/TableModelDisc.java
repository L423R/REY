package ru.maxon.project.Model.slovModels.tablesModel;

import ru.maxon.project.Model.slovModels.DiscModel;

import java.util.List;

/**
 * Created by Maxon on 19.01.2017.
 */
public class TableModelDisc extends TableModelAbstr {
    public TableModelDisc(List<?> beans) {
        super(beans);
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "код";
            case 1:
                return "НаимДисц";
            case 2:
                return "НаимКаф";
            case 3:
                return "ранг";
        }

        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DiscModel bean = (DiscModel) beans.get(rowIndex);
        switch (columnIndex){
            case 0:
                return bean.getKod();
            case 1:
                return bean.getNameDisc();
            case 2:
                return bean.getNameKaf();
            case 3:
                return bean.getRang();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
}
