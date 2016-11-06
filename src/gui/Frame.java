/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Frame extends JFrame {
    
    public Frame() {
    }
    
    public void build(JComponent front, JComponent yarn, JComponent needle, JComponent project) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("KnitWatch 2.0");
        this.setPreferredSize(new Dimension(1000, 600));
        this.setResizable(false);
        this.add(makeTabbedPanes(front, yarn, needle, project));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public JTabbedPane makeTabbedPanes(JComponent front, JComponent yarn, JComponent needle, JComponent project) {
        JTabbedPane tabbedPane = new JTabbedPane();
        UIManager.put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
        tabbedPane.addTab("Front", front);
        tabbedPane.addTab("Yarns", yarn);
        tabbedPane.addTab("Needles", needle);
        tabbedPane.addTab("Projects", project);
        tabbedPane.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void installDefaults() {
                super.installDefaults();
                highlight = Color.black;
                lightHighlight = Color.white;
                shadow = Color.black;
                darkShadow = Color.black;
                focus = Color.black;
            }
        });
        tabbedPane.setBackground(new Color(255,255,255));
        tabbedPane.setForeground(new Color(0,0,0));
        tabbedPane.setFont(new Font("Helvetica", Font.PLAIN, 11));
        return tabbedPane;
    }
    
}
