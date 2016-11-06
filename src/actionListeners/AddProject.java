/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package actionListeners;

import gui.Dialogs.AddProjectDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import knitwatch3.Run;

public class AddProject implements ActionListener {
    
    private Run run;
    
    public AddProject(Run run) {
        this.run = run;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AddProjectDialog apd = new AddProjectDialog(run);
        apd.play();
    }
    
}
