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
public class IntComparatorLargestFirst implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1.getClass().equals(o2.getClass()) && o1.getClass().equals(String.class)) {
            int a = Integer.parseInt((String) o1);
            int b = Integer.parseInt((String) o2);
            return b - a;
        } else if (o2.getClass().equals(o1.getClass()) && o2.getClass().equals(Integer.class)) {
            int a = (int) o1;
            int b = (int) o2;
            return b - a;
        }
        System.out.println("IntComparatorLargestFirst.java got something else than int");
        return 0;
    }
}
