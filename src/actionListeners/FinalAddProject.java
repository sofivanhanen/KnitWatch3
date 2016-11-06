/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package actionListeners;

import gui.Dialogs.AddProjectDialog;
import java.awt.event.*;
import knitwatch3.Run;

/**
 *
 * @author Default User
 */
public class FinalAddProject implements ActionListener {
    
    private Run run;
    private AddProjectDialog apd;
    
    public FinalAddProject(Run run, AddProjectDialog apd) {
        this.run = run;
        this.apd = apd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        run.getProjectContainer().addNew(apd.getTextFieldNewText());
        run.updateProjectTable();
        run.rewriteProjectFile();
        apd.dispose();
    }
    
}
