package ru.maxon.project.Model.slovModels.tablesModel;

import ru.maxon.project.Model.slovModels.RaspModel;

import java.util.List;

/**
 * Created by Maxon on 09.02.2017.
 */
public class TableModelRasp extends TableModelAbstr {
    public TableModelRasp(List<?> beans) {
        super(beans);
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "КодР";
            case 1:
                return "ДатаЗан";
            case 2:
                return "НачЗан";
            case 3:
                return "КолЧас";
            case 4:
                return "ТипЗан";
            case 5:
                return "ТипСтавки";
            case 6:
                return "День";
            case 7:
                return "НаимДисц";
            case 8:
                return "Ставка";
            case 9:
                return "ПрОпл";
            case 10:
                return "ФИО";
            case 11:
                return "Примечание";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RaspModel bean = (RaspModel) beans.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                return bean.getKod();
            case 1:
                return bean.getDateZ();
            case 2:
                return bean.getNachZ();
            case 3:
                return bean.getKolCh();
            case 4:
                return bean.getTipZ();
            case 5:
                return bean.getTipSt();
            case 6:
                return bean.getDay();
            case 7:
                return bean.getNameDisc();
            case 8:
                return bean.getStavka();
            case 9:
                return bean.getPrOpl();
            case 10:
                return bean.getFio();
            case 11:
                return bean.getPrim();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
}
