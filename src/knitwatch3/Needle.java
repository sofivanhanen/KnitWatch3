/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package knitwatch3;

/**
 *
 * @author Default User
 */
public class Needle extends Item{
    
    private String type;
    private String material;
    private Double size;
    
    public Needle(String type, String material, Double size, String line) {
        this.numberOfAttributes = 3;
        
        this.type = type;
        this.material = material;
        this.size = size;
        this.line = line;
    }
    
    @Override
    public String toString() {
        return material + " " + type + " (size " + size + ")";
    }
    
    @Override
    public Object getAttribute(int num) {
        if (num == 0) {
            return type;
        } else if (num == 1) {
            return material;
        }else if (num == 2) {
            return size;
        } else {
            System.out.println("ERROR in Needle.Java: Not that many attributes");
            return null;
        }
    }
    
}
