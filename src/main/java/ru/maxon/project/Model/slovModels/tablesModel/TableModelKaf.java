package ru.maxon.project.Model.slovModels.tablesModel;

import ru.maxon.project.Model.slovModels.KafModel;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Maxon on 18.01.2017.
 */
public class TableModelKaf implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<KafModel> beans;

    public TableModelKaf(List<KafModel> beans) {
        this.beans = beans;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "kod";
            case 1:
                return "name";
            case 2:
                return "rang";
        }
        return "";
    }

    public int getRowCount() {
        return beans.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        KafModel bean = beans.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getKod();
            case 1:
                return bean.getName();
            case 2:
                return bean.getRang();
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