/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package actionListeners;

import gui.Dialogs.AddDialogBase;
import gui.Dialogs.AddYarnDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import knitwatch3.Run;

/**
 *
 * @author Default User
 */
public class AddYarn implements ActionListener {
    
    private Run run;
    
    public AddYarn(Run run) {
        this.run = run;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AddYarnDialog d = new AddYarnDialog(run);
        d.play();
    }
    
}
