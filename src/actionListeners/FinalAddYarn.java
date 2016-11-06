/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package actionListeners;

import gui.Dialogs.AddYarnDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import knitwatch3.Run;

public class FinalAddYarn implements ActionListener{
    
    private Run run;
    private AddYarnDialog ayd;
    
    public FinalAddYarn(Run run, AddYarnDialog ayd) {
        this.run = run;
        this.ayd = ayd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        run.getYarnContainer().addNew(ayd.getTextFieldNewText());
        run.updateYarnTable();
        run.rewriteYarnFile();
        run.updateYarnAmount();
        ayd.dispose();
    }
    
}
