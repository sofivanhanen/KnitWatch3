/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package gui;

import actionListeners.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import knitwatch3.Run;
import tablethings.*;

public class Build {

    private Run run;
    private Frame frame;
    private JComponent frontTab;
    private JComponent yarnTab;
    private JComponent needleTab;
    private JComponent projectTab;
    private YarnTableModel ytm;
    private NeedleTableModel ntm;
    private ProjectTableModel ptm;
    private JLabel yarn;

    public Build(Run run) {
        this.run = run;
    }

    public void run() {
        buildFrontTab();
        buildYarnTab();
        buildNeedleTab();
        buildProjectTab();
        buildFrame();
    }

    private void buildFrame() {
        frame = new Frame();
        frame.build(frontTab, yarnTab, needleTab, projectTab);
    }

    private void buildFrontTab() {
        frontTab = getBasicPanel();
        GridBagConstraints c = new GridBagConstraints();

        JLabel l = new JLabel("KnitWatch");
        l.setFont(new Font("MingLiu", Font.BOLD, 70));
        l.setForeground(new Color(122, 0, 27));
        c.weighty = 0.2;
        c.gridx = 0;
        c.gridy = 0;
        frontTab.add(l, c);

        JLabel l2 = new JLabel("by Sofi (2016)");
        l2.setFont(new Font("MingLiu", Font.PLAIN, 15));
        l2.setForeground(new Color(214, 0, 46));
        c.gridy = 1;
        c.weighty = 0;
        frontTab.add(l2, c);

        yarn = new JLabel("");
        updateYarnAmount();
        yarn.setFont(new Font("Helvetica", Font.PLAIN, 20));
        yarn.setForeground(new Color(0, 0, 0));
        c.weighty = 1;
        c.gridy = 2;
        frontTab.add(yarn, c);
    }

    private void buildYarnTab() {
        yarnTab = getBasicPanel();
        GridBagConstraints c = new GridBagConstraints();
        ytm = new YarnTableModel(run.getYarnContainer());
        JTable y = new JTable(ytm);
        TableRowSorter<TableModel> sorter = new TableRowSorter(y.getModel());
        sorter.setComparator(4, new ColorComparator());
        sorter.setComparator(3, new IntComparatorLargestFirst());
        sorter.setComparator(1, new YarnWeightComparator());
        y.setRowSorter(sorter);

        y.getTableHeader().setReorderingAllowed(false);
        y.getTableHeader().setResizingAllowed(false);
        y.getColumnModel().getColumn(3).setPreferredWidth(10);
        y.getColumnModel().getColumn(4).setPreferredWidth(10);
        y.setDefaultRenderer(Color.class, new ColorRenderer());

        JLabel l = new JLabel("Yarns");
        l.setFont(new Font("MingLiu", Font.BOLD, 50));
        l.setForeground(new Color(122, 0, 27));
        c.weighty = 0.2;
        c.weightx = 0.5;
        yarnTab.add(l, c);

        GridBagConstraints c2 = new GridBagConstraints();
        c2.weightx = 0;
        c2.gridx = 1;
        c2.gridheight = 5;
        yarnTab.add(getScrollPaneForJTable(y), c2);

        JLabel l2 = new JLabel("<html><div style='text-align: center;'>So this is where all my money went.<html>");
        l2.setFont(new Font("Helvetica", Font.PLAIN, 15));
        l2.setForeground(new Color(0, 0, 0));
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 1;
        yarnTab.add(l2, c);

        c.weighty = 0;
        c.gridy = 2;
        yarnTab.add(getWideJButton("Add yarn"), c);

        c.weighty = 0.75;
        c.gridy = 3;
        yarnTab.add(getWideJButton("Remove yarn"), c);
    }

    private void buildNeedleTab() {
        needleTab = getBasicPanel();
        GridBagConstraints c = new GridBagConstraints();
        ntm = new NeedleTableModel(run.getNeedleContainer());
        JTable n = new JTable(ntm);
        TableRowSorter<TableModel> sorter = new TableRowSorter(n.getModel());
        sorter.setComparator(2, new DoubleComparator());
        n.setRowSorter(sorter);

        n.getTableHeader().setReorderingAllowed(false);
        n.getTableHeader().setResizingAllowed(false);
        n.getColumnModel().getColumn(2).setPreferredWidth(10);

        JLabel l = new JLabel("Needles");
        l.setFont(new Font("MingLiu", Font.BOLD, 50));
        l.setForeground(new Color(122, 0, 27));
        c.weighty = 0.2;
        c.weightx = 0.5;
        needleTab.add(l, c);

        GridBagConstraints ct = new GridBagConstraints();
        c.gridx = 1;
        c.weightx = 0;
        ct.gridheight = 5;
        needleTab.add(getScrollPaneForJTable(n), ct);

        JLabel l2 = new JLabel("<html><div style='text-align: center'>Watch out, you'll get poked.</html>");
        l2.setFont(new Font("Helvetica", Font.PLAIN, 15));
        l2.setForeground(new Color(0, 0, 0));
        c.gridx = 0;
        c.weighty = 1;
        c.gridy = 1;
        needleTab.add(l2, c);

        c.weighty = 0;
        c.gridy = 2;
        needleTab.add(getWideJButton("Add needles"), c);

        c.weighty = 0.75;
        c.gridy = 3;
        needleTab.add(getWideJButton("Remove needles"), c);
    }

    private void buildProjectTab() {
        projectTab = getBasicPanel();
        GridBagConstraints c = new GridBagConstraints();
        ptm = new ProjectTableModel(run.getProjectContainer());
        JTable p = new JTable(ptm);
        TableRowSorter<TableModel> sorter = new TableRowSorter(p.getModel());
        sorter.setComparator(4, new IntComparatorLargestFirst());
        p.setRowSorter(sorter); //Didn't add int comparator (should be in #2 ??)

        p.getTableHeader().setReorderingAllowed(false);
        p.getTableHeader().setResizingAllowed(false);
        p.getColumnModel().getColumn(2).setPreferredWidth(10);
        p.getColumnModel().getColumn(4).setPreferredWidth(10);

        JLabel l = new JLabel("Projects");
        l.setFont(new Font("MingLiu", Font.BOLD, 50));
        l.setForeground(new Color(122, 0, 27));
        c.weighty = 0.2;
        c.weightx = 0.5;
        projectTab.add(l, c);

        GridBagConstraints ct = new GridBagConstraints();
        c.gridx = 1;
        c.weightx = 0;
        ct.gridheight = 5;
        projectTab.add(getScrollPaneForJTable(p), ct);

        JLabel l2 = new JLabel("<html><div style='text-align: center'>As if I'll ever finish these</html>");
        l2.setFont(new Font("Helvetica", Font.PLAIN, 15));
        l2.setForeground(new Color(0, 0, 0));
        c.gridx = 0;
        c.weighty = 1;
        c.gridy = 1;
        projectTab.add(l2, c);

        c.weighty = 0;
        c.gridy = 2;
        projectTab.add(getWideJButton("Add a project"), c);

        c.weighty = 0.75;
        c.gridy = 3;
        projectTab.add(getWideJButton("Remove a project"), c);
    }

    private static JPanel getBasicPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(250, 250, 250));
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        return panel;
    }

    public JButton getWideJButton(String label) {
        JButton button = new JButton(label);
        button.setPreferredSize(new Dimension(300, 50));
        if (label.equals("Add yarn")) {
            button.addActionListener(new AddYarn(run));
        }  else if (label.equals("Add a project")) {
            button.addActionListener(new AddProject(run));
        } else if (label.equals("Add needles")) {
            button.addActionListener(new AddNeedle(run));
        } else if (label.equals("Remove yarn")) {
            button.addActionListener(new RemoveYarn(run));
        } else if (label.equals("Remove needles")) {
            button.addActionListener(new RemoveNeedle(run));
        }
        button.setFont(new Font("Helvetica", Font.PLAIN, 15));
        button.setBackground(new Color(163, 18, 49));
        button.setForeground(Color.WHITE);
        return button;
    }

    public static JButton getSmallJButton(String label) {
        JButton button = new JButton(label);
        button.setPreferredSize(new Dimension(150, 30));
        button.setFont(new Font("Helvetica", Font.PLAIN, 12));
        button.setBackground(new Color(163, 18, 49));
        button.setForeground(Color.WHITE);
        return button;
    }

    public static JScrollPane getScrollPaneForJTable(JTable table) {
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(600, 540));
        scrollPane.getViewport().setBackground(new Color(245, 245, 245));
        return scrollPane;
    }
    
    public void updateYarnTable() {
        ytm.fireTableDataChanged();
    }
    
    public void updateNeedleTable() {
        ntm.fireTableDataChanged();
    }
    
    public void updateProjectTable() {
        ptm.fireTableDataChanged();
    }
    
    public void updateYarnAmount() {
        yarn.setText("Currently there's " + run.getYarnContainer().getAmountOfYarn() + "g of yarn in my stash!");
    }

}
