package ru.maxon.project.Model.tablesModel;

import ru.maxon.project.Model.MetModel;
import ru.maxon.project.Model.ProgModel;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Maxon on 18.01.2017.
 */
public class TableModelProg implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<ProgModel> beans;

    public TableModelProg(List<ProgModel> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 8;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "код";
            case 1:
                return "КодНапр";
            case 2:
                return "Направление";
            case 3:
                return "Профиль";
            case 4:
                return "Квалифик";
            case 5:
                return "ФормаОбуч";
            case 6:
                return "Срок";
            case 7:
                return "Примеч";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        ProgModel bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKod();
            case 1:
                return bean.getKodNap();
            case 2:
                return bean.getName();
            case 3:
                return bean.getProf();
            case 4:
                return bean.getKval();
            case 5:
                return bean.getFormOby();
            case 6:
                return bean.getSrok();
            case 7:
                return bean.getPrim();
        }
        return "";
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {

    }

}