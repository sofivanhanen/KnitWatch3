/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package gui.Dialogs;

import actionListeners.FinalRemoveYarn;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
import knitwatch3.Run;
import tablethings.*;

/**
 *
 * @author Default User
 */
public class RemoveYarnDialog extends RemoveDialogBase {
    
    private JTable table;

    public RemoveYarnDialog(Run run) {
        super(run);
        buildJTable();
    }
    
    @Override
    public JLabel createHeader() {
        this.setTitle("Remove yarn");
        return new JLabel("Choose the yarns you wish to discard");
    }
    
    @Override
    public JTable getJTable() {
        return table;
    }
    
    @Override
    public ActionListener getRemoveAL() {
        return new FinalRemoveYarn(run, this);
    }
    
    public void buildJTable() {
        table = new JTable(new YarnTableModel(run.getYarnContainer()));
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(10);
        table.getColumnModel().getColumn(4).setPreferredWidth(10);
        table.setDefaultRenderer(Color.class, new ColorRenderer());
        TableRowSorter<TableModel> sorter = new TableRowSorter(table.getModel());
        sorter.setComparator(4, new ColorComparator());
        sorter.setComparator(3, new IntComparatorLargestFirst());
        sorter.setComparator(1, new YarnWeightComparator());
        table.setRowSorter(sorter);
    }
    
}
