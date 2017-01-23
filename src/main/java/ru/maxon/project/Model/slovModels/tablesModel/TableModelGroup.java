package ru.maxon.project.Model.slovModels.tablesModel;

import ru.maxon.project.Model.slovModels.GroupModel;

import java.util.List;

/**
 * Created by Maxon on 23.01.2017.
 */
public class TableModelGroup extends TableModelAbstr {
    public TableModelGroup(List<?> beans) {
        super(beans);
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                return "";
            case 1:
                return "НГ";
            case 2:
                return "ДатаОтк";
            case 3:
                return "Программа";
            case 4:
                return "Напр";
            case 5:
                return "Проф";
            case 6:
                return "Методист";
            case 7:
                return "ДатаЗакр";
            case 8:
                return "Х-Експ";
            case 9:
                return "Примичание";
        }

        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GroupModel bean = (GroupModel) beans.get(rowIndex);
        switch (columnIndex){
            case 0:
                return bean.getNameGr();
            case 1:
                return bean.getNg();
            case 2:
                return bean.getDateOp();
            case 3:
                return bean.getNameProg();
            case 4:
                return bean.getNapr();
            case 5:
                return bean.getProf();
            case 6:
                return bean.getMetName();
            case 7:
                return bean.getDateCl();
            case 8:
                return bean.getxEcsp();
            case 9:
                return bean.getPrim();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
}
