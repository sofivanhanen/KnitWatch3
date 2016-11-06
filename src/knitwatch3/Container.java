/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package knitwatch3;

import java.util.ArrayList;

public class Container {

    protected ArrayList<Item> list;
    protected Item myItem;

    public Container() {
        list = new ArrayList<Item>();
        createMyItem();
    }
    
    protected void createMyItem() {
        System.out.println("ERROR: ItemContainer must overwrite CreateMyItem() !!!");
    }

    public void print() {
        System.out.println(list);
    }

    public int getNumberOfItems() {
        return list.size();
    }

    public Object get(int item, int attribute) {
        if (list.size() > item && myItem.numberOfAttributes > attribute) {
            return list.get(item).getAttribute(attribute);
        } else {
            System.out.println("Error in Container: table too big?");
            System.out.println(item + " " + attribute);
            return null;
        }
    }

    public ArrayList<Item> getList() {
        return list;
    }

    public void removeThese(ArrayList<Integer> list2) {
        for (int i = list2.size() - 1; i >= 0; i--) {
            list.remove(list.get(list2.get(i))); //list.remove(int) doesn't work for some reason??
        }
    }

}
