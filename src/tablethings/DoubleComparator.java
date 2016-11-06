package tablethings;

import java.util.Comparator;

public class DoubleComparator implements Comparator {

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
