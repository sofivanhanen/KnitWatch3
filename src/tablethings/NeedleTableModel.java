package tablethings;

import knitwatch3.Container;

public class NeedleTableModel extends MyTableModel{
    
    public NeedleTableModel(Container container) {
        super(container);
        columnNames = new String[3];
        columnNames[0] = "Type";
        columnNames[1] = "Material";
        columnNames[2] = "Size";
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 2:
                return Double.class;
            default:
                return String.class;
        }
    }
    
}
