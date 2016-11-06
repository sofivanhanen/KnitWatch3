package actionListeners;

import gui.Dialogs.RemoveNeedleDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import knitwatch3.*;

public class FinalRemoveNeedle implements ActionListener {
    
    private Run run;
    private RemoveNeedleDialog rnd;
    
    public FinalRemoveNeedle(Run run, RemoveNeedleDialog rnd) {
        this.run = run;
        this.rnd = rnd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Integer> hr = rnd.getHighlightedRows();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        for(int a : hr) {
            actual.add(rnd.getJTable().convertRowIndexToModel(a));
        }
        run.getNeedleContainer().removeThese(actual);
        run.updateNeedleTable();
        run.rewriteNeedleFile();
        rnd.dispose();
    }
    
}
