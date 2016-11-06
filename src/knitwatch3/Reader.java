package knitwatch3;

import java.io.File;
import java.util.Scanner;

public class Reader {

    public static YarnContainer buildYarnContainer(String fileName) {
        YarnContainer yarnC = new YarnContainer();
        try {
            File yarnFile = new File(fileName);
            Scanner scanner = new Scanner(yarnFile);
            while (scanner.hasNextLine()) {
                yarnC.addNew(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Problem in Reader.java method buildYarnContainer (file not found)");
            System.out.println(e.getStackTrace());
        }
        return yarnC;
    }

    public static NeedleContainer buildNeedleContainer(String fileName) {
        NeedleContainer needleC = new NeedleContainer();
        try {
            File needleFile = new File(fileName);
            Scanner scanner = new Scanner(needleFile);
            while (scanner.hasNextLine()) {
                needleC.addNew(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Problem in Reader.java method buildNeedleContainer (file not found)");
            System.out.println(e.getStackTrace());
        }
        return needleC;
    }

    public static ProjectContainer buildProjectContainer(String fileName) {
        ProjectContainer projectC = new ProjectContainer();
        try {
            File projectFile = new File(fileName);
            Scanner scanner = new Scanner(projectFile);
            while(scanner.hasNextLine()) {
                projectC.addNew(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Problem in Reader.java method buildProjectContainer (file not found)");
        }
        return projectC;
    }

}
