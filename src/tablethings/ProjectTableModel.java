package tablethings;

import knitwatch3.Container;

public class ProjectTableModel extends MyTableModel {
    
    public ProjectTableModel(Container container) {
        super(container);
        columnNames = new String[5];
        columnNames[0] = "Project name";
        columnNames[1] = "Preferred yarn";
        columnNames[2] = "Difficulty";
        columnNames[3] = "Pattern location";
        columnNames[4] = "Priority";
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 2:
                return Integer.class;
            case 4:
                return Integer.class;
            default:
                return String.class;
        }
    }
    
}
