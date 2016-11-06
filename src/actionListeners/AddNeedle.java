/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package actionListeners;

import gui.Dialogs.AddNeedleDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import knitwatch3.Run;

/**
 *
 * @author Default User
 */
public class AddNeedle implements ActionListener {
    
    private Run run;
    
    public AddNeedle(Run run) {
        this.run = run;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AddNeedleDialog addnd = new AddNeedleDialog(run);
        addnd.play();
    }
    
}
