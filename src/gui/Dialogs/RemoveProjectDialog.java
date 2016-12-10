package gui.Dialogs;

import actionListeners.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
import knitwatch3.Run;
import tablethings.*;

/**
 *
 * @author Sofia Vanhanen
 */
public class RemoveProjectDialog extends RemoveDialogBase {
    
    private JTable table;
    
    public RemoveProjectDialog(Run run) {
        super(run);
        buildJTable();
    }
    
    @Override
    public JLabel createHeader() {
        this.setTitle("Remove projects");
        return new JLabel("Choose the projects you wish to discard");
    }
    
    @Override
    public JTable getJTable() {
        return table;
    }
    
    @Override
    public ActionListener getRemoveAL() {
        return new FinalRemoveProject(run, this);
    }
    
    public void buildJTable() {
        table = new JTable(new ProjectTableModel(run.getProjectContainer()));
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(10);
        table.getColumnModel().getColumn(4).setPreferredWidth(10);
        TableRowSorter<TableModel> sorter = new TableRowSorter(table.getModel());
        sorter.setComparator(4, new IntComparatorLargestFirst());
        table.setRowSorter(sorter);
    }
    
}
