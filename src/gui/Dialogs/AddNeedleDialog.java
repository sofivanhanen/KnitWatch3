package gui.Dialogs;

import actionListeners.*;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import knitwatch3.Run;

public class AddNeedleDialog extends AddDialogBase {
    
    public AddNeedleDialog(Run run) {
        super(run);
    }
    
    @Override
    public JLabel createHeader() {
        this.setTitle("Add needles");
        return new JLabel("Needle type | Material | Size");
    }
    
    @Override
    public String getTextFieldText() {
        return "DPN; Aluminum; 3";
    }
    
    @Override
    public ActionListener getAddAL() {
        return new FinalAddNeedle(run, this);
    }
    
}
