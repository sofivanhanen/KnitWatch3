package tablethings;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class ColorRenderer extends JLabel implements TableCellRenderer {

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
