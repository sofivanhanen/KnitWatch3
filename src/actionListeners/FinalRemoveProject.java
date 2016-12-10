package actionListeners;

import gui.Dialogs.RemoveProjectDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import knitwatch3.Run;

public class FinalRemoveProject implements ActionListener {
    
    private Run run;
    private RemoveProjectDialog rpd;
    
    public FinalRemoveProject(Run run, RemoveProjectDialog rpd) {
        this.run = run;
        this.rpd = rpd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Integer> hr = rpd.getHighlightedRows();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        for(int a : hr) {
            actual.add(rpd.getJTable().convertRowIndexToModel(a));
        }
        run.getProjectContainer().removeThese(actual);
        run.updateProjectTable();
        run.rewriteProjectFile();
        rpd.dispose();
    }
    
}
