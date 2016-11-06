package knitwatch3;

public class Item {
    
    public int numberOfAttributes;
    public String line;
    
    public Object getAttribute(int num) {
        System.out.println("Class extending Item must overwrite getAttribute !!!");
        return null;
    }
    
}
