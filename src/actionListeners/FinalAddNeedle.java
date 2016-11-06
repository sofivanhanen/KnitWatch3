/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package actionListeners;

import gui.Dialogs.AddNeedleDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import knitwatch3.Run;

public class FinalAddNeedle implements ActionListener {
    
    private Run run;
    private AddNeedleDialog d;
    
    public FinalAddNeedle(Run run, AddNeedleDialog d) {
        this.run = run;
        this.d = d;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        run.getNeedleContainer().addNew(d.getTextFieldNewText());
        run.updateNeedleTable();
        run.rewriteNeedleFile();
        d.dispose();
    }
    
}
