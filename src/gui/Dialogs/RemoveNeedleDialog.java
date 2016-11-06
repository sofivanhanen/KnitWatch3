package gui.Dialogs;

import actionListeners.FinalRemoveNeedle;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
import knitwatch3.Run;
import tablethings.*;

public class RemoveNeedleDialog extends RemoveDialogBase {
    
    private JTable table;
    
    public RemoveNeedleDialog(Run run) {
        super(run);
        buildJTable();
    }
    
    private void buildJTable() {
        table = new JTable(new NeedleTableModel(run.getNeedleContainer()));
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(10);
        TableRowSorter<TableModel> sorter = new TableRowSorter(table.getModel());
        sorter.setComparator(2, new DoubleComparator());
        table.setRowSorter(sorter);
    }
    
    @Override
    public JLabel createHeader() {
        this.setTitle("Remove needles");
        return new JLabel("Choose the needles you wish to discard");
    }
    
    @Override
    public JTable getJTable() {
        return table;
    }
    
    @Override
    public ActionListener getRemoveAL() {
        return new FinalRemoveNeedle(run, this);
    }
    
}
