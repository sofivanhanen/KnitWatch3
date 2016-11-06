/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package tablethings;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class ColorRenderer extends JLabel implements TableCellRenderer {

    // Custom renderer written by me to render colors in yarn tab
    public ColorRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object obj,
            boolean isSelected, boolean hasFocus, int row, int column) {
        Color newColor = (Color) obj;
        setBackground(newColor);
        setToolTipText("RGB value: " + newColor.getRed() + ", "
                + newColor.getGreen() + ", "
                + newColor.getBlue());
        return this;
    }
}
