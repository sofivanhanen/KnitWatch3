package keyListener;

import java.awt.event.*;

public class EnterKeyListener implements KeyListener {
    
    private ActionListener al;
    
    public EnterKeyListener(ActionListener al) {
        this.al = al;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            al.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
