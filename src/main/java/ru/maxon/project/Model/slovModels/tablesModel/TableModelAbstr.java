package ru.maxon.project.Model.slovModels.tablesModel;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Maxon on 18.01.2017.
 */
public abstract class TableModelAbstr implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<>();

    protected List<?> beans;

    public TableModelAbstr(List<?> beans) {
        this.beans = beans;
    }

    @Override
    public int getRowCount() {
        return beans.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }


    @Override
    public void addTableModelListener(TableModelListener l) {
        listeners.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listeners.remove(l);
    }
}
