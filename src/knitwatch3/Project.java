/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package knitwatch3;

/**
 *
 * @author Default User
 */
public class Project extends Item {
    
    private String name;
    private String yarn;
    private int diff;
    private String patternLocation;
    private int priority;
    
    public Project(String name, String yarn, int diff, String patternLocation, int priority, String line) {
        numberOfAttributes = 5;
        this.name = name;
        this.yarn = yarn;
        this.diff = diff;
        this.patternLocation = patternLocation;
        this.priority = priority;
        this.line = line;
    }
    
    @Override
    public String toString() {
        return name + " out of " + yarn + ", diff " + diff;
    }
    
    @Override
    public Object getAttribute(int num) {
        switch (num) {
            case 0:
                return name;
            case 1:
                return yarn;
            case 2:
                return diff;
            case 3:
                return patternLocation;
            case 4:
                return priority;
            default:
                return null;
        }
    }
    
}
