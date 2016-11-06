package knitwatch3;

import gui.Build;

public class Run {

    private YarnContainer yarnC;
    private NeedleContainer needleC;
    private ProjectContainer projectC;
    private final String yarnFile = "Yarns.txt";
    private final String needleFile = "Needles.txt";
    private final String projectFile = "Projects.txt";
    private Build build;

    public Run() {
        buildContainers();
        build = new Build(this);
    }

    private void buildContainers() {
        yarnC = Reader.buildYarnContainer(yarnFile);
        needleC = Reader.buildNeedleContainer(needleFile);
        projectC = Reader.buildProjectContainer(projectFile);
    }

    public String getYarnFileName() {
        return yarnFile;
    }
    
    public String getNeedleFileName() {
        return needleFile;
    }
    
    public String getProjectFileName() {
        return projectFile;
    }

    public void run() {
        buildContainers();
        build.run();
    }

    public YarnContainer getYarnContainer() {
        return yarnC;
    }

    public NeedleContainer getNeedleContainer() {
        return needleC;
    }
    
    public ProjectContainer getProjectContainer() {
        return projectC;
    }

    public void updateYarnTable() {
        build.updateYarnTable();
    }
    
    public void updateNeedleTable() {
        build.updateNeedleTable();
    }
    
    public void updateProjectTable() {
        build.updateProjectTable();
    }

    public void rewriteYarnFile() {
        Writer.rewriteFile(yarnFile, yarnC);
    }
    
    public void rewriteNeedleFile() {
        Writer.rewriteFile(needleFile, needleC);
    }
    
    public void rewriteProjectFile() {
        Writer.rewriteFile(projectFile, projectC);
    }

    public void updateYarnAmount() {
        build.updateYarnAmount();
    }

}
