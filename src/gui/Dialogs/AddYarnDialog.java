/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package gui.Dialogs;

import actionListeners.FinalAddYarn;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import knitwatch3.Run;

/**
 *
 * @author Default User
 */
public class AddYarnDialog extends AddDialogBase {

    public AddYarnDialog(Run run) {
        super(run);
    }
    
    @Override
    public JLabel createHeader() {
        this.setTitle("Add yarn");
        return new JLabel("Yarn name | Needle size | Material | (g) owned | RGB");
    }
    
    @Override
    public String getTextFieldText() {
        return "Example yarn; 5; Wool; 50; 255 255 255";
    }
    
    @Override
    public ActionListener getAddAL() {
        return new FinalAddYarn(run, this);
    }
}
