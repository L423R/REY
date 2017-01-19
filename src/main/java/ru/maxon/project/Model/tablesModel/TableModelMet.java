package ru.maxon.project.Model.tablesModel;

import ru.maxon.project.Model.KafModel;
import ru.maxon.project.Model.MetModel;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Maxon on 18.01.2017.
 */
public class TableModelMet implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<MetModel> beans;

    public TableModelMet(List<MetModel> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 5;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "код";
            case 1:
                return "Фамилия";
            case 2:
                return "Имя";
            case 3:
                return "Отчество";
            case 4:
                return "Контакты";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        MetModel bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKod();
            case 1:
                return bean.getlName();
            case 2:
                return bean.getfName();
            case 3:
                return bean.gettName();
            case 4:
                return bean.getNumber();
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