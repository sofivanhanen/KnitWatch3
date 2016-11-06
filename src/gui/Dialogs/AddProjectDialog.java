/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package gui.Dialogs;

import actionListeners.FinalAddProject;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import knitwatch3.Run;

/**
 *
 * @author Default User
 */
public class AddProjectDialog extends AddDialogBase {
    
    public AddProjectDialog(Run run) {
        super(run);
    }
    
    @Override
    public JLabel createHeader() {
        this.setTitle("Add a project");
        return new JLabel("Project name | Preferred yarn | Difficulty | Pattern location | Priority");
    }
    
    @Override
    public String getTextFieldText() {
        return "Example project; My best yarn; 5; Ravelry; 5";
    }
    
    @Override
    public ActionListener getAddAL() {
        return new FinalAddProject(run, this);
    }
    
}
