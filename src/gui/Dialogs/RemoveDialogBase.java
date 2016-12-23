package gui.Dialogs;

import actionListeners.Close;
import gui.Build;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import keyListener.EnterKeyListener;
import keyListener.EscKeyListener;
import knitwatch3.Run;

public class RemoveDialogBase extends JDialog{
    
    private JTable table;
    protected Run run;
    
    public RemoveDialogBase(Run run) {
        this.addKeyListener(new EscKeyListener(this));
        this.setFocusable(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setPreferredSize(new Dimension(600,400));
        this.setResizable(false);
        this.setModal(true);
        this.run = run;
    }
    
    public void play() {
        this.createElse();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public JLabel createHeader() {
        System.out.println("Dialog class must overwrite .createHeader() !!!");
        return new JLabel("some header");
    }
    
    public void createElse() {
        JPanel page = new JPanel();
        page.setBackground(new Color(250,250,250));
        page.setLayout(new GridBagLayout());
        
        JLabel label = createHeader();
        label.setFont(new Font("Helvetica", Font.PLAIN, 15));
        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 0;
        c3.gridy = 0;
        c3.gridwidth = 2;
        c3.weightx = 0;
        page.add(label, c3);
        
        table = getJTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(500,270));
        table.addKeyListener(new EnterKeyListener(getRemoveAL()));
        table.addKeyListener(new EscKeyListener(this));
        GridBagConstraints c1 = new GridBagConstraints();
        scrollPane.getViewport().setBackground(new Color(245,245,245));
        c1.gridx = 0;
        c1.gridwidth = 2;
        c1.gridy = 1;
        c1.weighty = 1;
        page.add(scrollPane,c1);
        
        JButton add = Build.getSmallJButton("Remove");
        GridBagConstraints c2 = new GridBagConstraints();
        add.addActionListener(getRemoveAL());
        c2.gridy = 2;
        c2.gridx = 0;
        c2.weightx = 1;
        c2.weighty = 1;
        page.add(add, c2);

        JButton cancel = Build.getSmallJButton("Cancel");
        cancel.addActionListener(new Close(this));
        c2.gridx = 1;
        page.add(cancel, c2);

        this.add(page);
    }
    
    public JTable getJTable() {
        System.out.println("'Remove' dialog class must overwrite .getJTable() !!!");
        return null;
    }
    
    public ActionListener getRemoveAL() {
        System.out.println("'Remove' dialog class must overwrite .getRemoveAL() !!!");
        return null;
    }
    
    public ArrayList<Integer> getHighlightedRows() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int a : table.getSelectedRows()) {
            list.add(a);
        }
        return list;
    }
            
}
