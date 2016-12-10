package actionListeners;

import gui.Dialogs.*;
import java.awt.event.*;
import knitwatch3.Run;

/**
 *
 * @author Sofia Vanhanen
 */
public class RemoveProject implements ActionListener {
    
    private Run run;
    
    public RemoveProject(Run run) {
        this.run = run;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RemoveProjectDialog rpd = new RemoveProjectDialog(run);
        rpd.play();
    }
    
}
