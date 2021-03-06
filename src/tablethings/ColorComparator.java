package tablethings;

import java.awt.Color;
import java.util.Comparator;

public class ColorComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1.getClass().equals(Color.class)) {
            Color a = (Color) o1;
            Color b = (Color) o2;
            int valueA = a.getBlue() + a.getGreen() + a.getRed();
            int valueB = b.getBlue() + b.getGreen() + b.getRed();
            return valueB - valueA;
        }
        System.out.println("ColorComparator.java got something else than color.");
        return 0;
    }
}
