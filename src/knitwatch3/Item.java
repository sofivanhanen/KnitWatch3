/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package knitwatch3;

/**
 *
 * @author Default User
 */
public class Item {
    
    public int numberOfAttributes;
    public String line;
    
    public Object getAttribute(int num) {
        System.out.println("Class extending Item must overwrite getAttribute !!!");
        return null;
    }
    
}
