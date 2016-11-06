/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package actionListeners;

import gui.Dialogs.RemoveNeedleDialog;
import java.awt.event.*;
import knitwatch3.Run;

/**
 *
 * @author Default User
 */
public class RemoveNeedle implements ActionListener {
    
    private Run run;
    
    public RemoveNeedle(Run run) {
        this.run = run;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RemoveNeedleDialog rnd = new RemoveNeedleDialog(run);
        rnd.play();
    }
    
}
