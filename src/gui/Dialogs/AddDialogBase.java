package gui.Dialogs;

import actionListeners.*;
import gui.Build;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import knitwatch3.Run;

public class AddDialogBase extends JDialog {
    
    private JTextField textField;
    protected Run run;
    
    public AddDialogBase(Run run) {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setPreferredSize(new Dimension(450,200));
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
        page.setLayout(new GridBagLayout());
        page.setBackground(new Color(250,250,250));
        
        JLabel label = createHeader();
        label.setFont(new Font("Helvetica", Font.PLAIN, 13));
        GridBagConstraints c3 = new GridBagConstraints();
        c3.gridx = 0;
        c3.gridy = 0;
        c3.gridwidth = 2;
        c3.weightx = 0;
        page.add(label, c3);

        textField = new JTextField();
        textField.addActionListener(getAddAL());
        textField.setText(getTextFieldText());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        page.add(textField, c);

        JButton add = Build.getSmallJButton("Add");
        GridBagConstraints c2 = new GridBagConstraints();
        add.addActionListener(getAddAL());
        c2.gridy = 2;
        c2.gridx = 0;
        c2.weightx = 1;
        c2.weighty = 0.5;
        page.add(add, c2);

        JButton cancel = Build.getSmallJButton("Cancel");
        cancel.addActionListener(new Close(this));
        c2.gridx = 1;
        page.add(cancel, c2);

        this.add(page);
    }
    
    public String getTextFieldText() {
        System.out.println("Dialog class must overwrite .getTextFieldText() !!!");
        return "some text";
    }
    
    public ActionListener getAddAL() {
        System.out.println("Dialog class must overwrite .getAddAL() !!!");
        return null;
    }
    
    public String getTextFieldNewText() {
        return textField.getText();
    }
}
