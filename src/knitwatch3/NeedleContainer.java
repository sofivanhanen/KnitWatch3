/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package knitwatch3;

public class NeedleContainer extends Container{
    
    public NeedleContainer() {
        super();
    }
    
    @Override
    protected void createMyItem() {
        myItem = new Needle("a", "b", 0.0, "a;b;0");
    }
    
    public void addNew(String line) {
        String[] items = line.split(";");
        double size = Double.parseDouble(items[2].trim());
        list.add(new Needle(items[0].trim(), items[1].trim(), size, line));
    }
    
}
