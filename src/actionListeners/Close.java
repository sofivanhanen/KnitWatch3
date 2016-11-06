
package actionListeners;

import java.awt.event.*;
import javax.swing.JDialog;

public class Close implements ActionListener {
    
    private JDialog dialog;
    
    public Close(JDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.dispose();
    }
    
}
