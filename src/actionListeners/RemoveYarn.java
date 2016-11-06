package actionListeners;

import gui.Dialogs.RemoveYarnDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import knitwatch3.Run;

public class RemoveYarn implements ActionListener{
    
    private Run run;
    
    public RemoveYarn(Run run) {
        this.run = run;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RemoveYarnDialog ryd = new RemoveYarnDialog(run);
        ryd.play();
    }
}
