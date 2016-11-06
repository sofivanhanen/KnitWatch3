/*
 * Let's do some coding!
 * If you get stuck, remember to chill and take a break!
 */
package tablethings;

import java.util.Comparator;

/**
 *
 * @author Default User
 */
public class DoubleComparator implements Comparator {
    
    public DoubleComparator() {

    }

    @Override
    public int compare(Object o1, Object o2) {
        if (true) {
            return (int) (((double) o1 - (double) o2) * 100);
        } else {
            System.out.println("DoubleComparator.java got something other than double");
        }
        return 0;
    }
    
}
