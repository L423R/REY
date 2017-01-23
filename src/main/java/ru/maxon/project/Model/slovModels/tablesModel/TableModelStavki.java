package ru.maxon.project.Model.slovModels.tablesModel;

import ru.maxon.project.Model.slovModels.StavkiModel;

import java.util.List;

/**
 * Created by Maxon on 23.01.2017.
 */
public class TableModelStavki extends TableModelAbstr {

    public TableModelStavki(List<?> beans) {
        super(beans);
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                return "Наименование вида работы";
            case 1:
                return "ЕдИзм";
            case 2:
                return "НаимНПР";
            case 3:
                return "СтавСпец";
            case 4:
                return "СтавМаг";
            case 5:
                return "Примечание";

        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkiModel bean = (StavkiModel) beans.get(rowIndex);
        switch (columnIndex){
            case 0:
                return bean.getNameStav();
            case 1:
                return bean.getIzm();
            case 2:
                return bean.getNpr();
            case 3:
                return bean.getStavkaSpec();
            case 4:
                return bean.getStavkaMag();
            case 5:
                return bean.getPrim();
        }

        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
}
