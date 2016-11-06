/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package tablethings;

import java.awt.Color;
import knitwatch3.Container;

public class YarnTableModel extends MyTableModel {
    
    public YarnTableModel(Container container) {
        super(container);
        columnNames = new String[5];
        columnNames[0] = "Yarn name";
        columnNames[1] = "Weight";
        columnNames[2] = "Material";
        columnNames[3] = "Amount";
        columnNames[4] = "Color";
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch (col) {
            case 4:
                return Color.class;
            case 3:
                return Integer.class;
            default:
                return String.class;
        }
    }
    
}
