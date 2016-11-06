/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package keyListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Default User
 */
public class MyKeyListener implements KeyListener {
    
    private ActionListener al;
    
    public MyKeyListener(ActionListener al) {
        this.al = al;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped always gives VK_UNDEFINED for e.getKetCode(). How stupid is that??
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
