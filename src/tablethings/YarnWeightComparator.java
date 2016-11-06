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
public class YarnWeightComparator implements Comparator {

    // this doesn't compare the g weights of yarn but the thickness calculated by needle size
    
    public YarnWeightComparator() {

    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1.getClass().equals(String.class)) {
            String a = (String) o1;
            String b = (String) o2;
            char c1 = a.charAt(a.length() - 4);
            char c12 = b.charAt(b.length() - 4);
            if (c1 - c12 != 0) { // i.e. 1,5 and 2,5
                return c1 - c12;
            } else {
                char c2 = a.charAt(a.length() - 2);
                char c22 = b.charAt(b.length() - 2);
                return c2 - c22;
            }
        }
        System.out.println("YarnWeightComparator got something else than weight of yarn");
        return 0;
    }
}
