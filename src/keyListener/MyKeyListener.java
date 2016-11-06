package keyListener;

import java.awt.event.*;

public class MyKeyListener implements KeyListener {
    
    private ActionListener al;
    
    public MyKeyListener(ActionListener al) {
        this.al = al;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped always gives VK_UNDEFINED for e.getKeyCode(). How stupid is that??
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            al.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //didn't need this :)
    }
    
}
