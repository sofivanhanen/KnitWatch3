package tablethings;

import javax.swing.table.*;
import knitwatch3.Container;

public class MyTableModel extends AbstractTableModel implements TableModel{
    
    protected String[] columnNames;
    protected Container container;
    
    public MyTableModel(Container container) {
        this.container = container;
    }

    @Override
    public int getRowCount() {
        return container.getNumberOfItems();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return container.get(rowIndex, columnIndex);
    }
    
    @Override
    public Class getColumnClass(int col) {
        System.out.println("TableModel must overwrite getColumnClass !!!");
        return null;
    }
    
}
