package keyListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JDialog;

public class EscKeyListener implements KeyListener {
    
    private JDialog dialog;
    
    public EscKeyListener(JDialog dialog) {
        this.dialog = dialog;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dialog.dispose();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
