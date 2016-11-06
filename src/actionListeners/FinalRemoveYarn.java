package actionListeners;

import gui.Dialogs.RemoveYarnDialog;
import java.awt.event.*;
import java.util.ArrayList;
import knitwatch3.Run;

public class FinalRemoveYarn implements ActionListener {
    
    private Run run;
    private RemoveYarnDialog ryd;
    
    public FinalRemoveYarn(Run run, RemoveYarnDialog ryd) {
        this.run = run;
        this.ryd = ryd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //have to seperate "sorted" rows from "actual" rows.
        ArrayList<Integer> hr = ryd.getHighlightedRows();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        for(int a : hr) {
            actual.add(ryd.getJTable().convertRowIndexToModel(a));
        }
        run.getYarnContainer().removeThese(actual);
        run.updateYarnTable();
        run.rewriteYarnFile();
        run.updateYarnAmount();
        ryd.dispose();
    }
    
}
