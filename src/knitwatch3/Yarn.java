package knitwatch3;

import java.awt.Color;

public class Yarn extends Item {

    private String name;
    private double needleSize;
    private String weight;
    private String material;
    private int amount;
    private Color color;

    public Yarn(String name, double needleSize, String material, int amount, Color color, String line) {
        this.name = name;
        this.needleSize = needleSize;
        calculateWeight();
        this.material = material;
        this.amount = amount;
        this.color = color;
        this.numberOfAttributes = 5;
        this.line = line;
    }

    private void calculateWeight() {
        if (needleSize < 0) {
            weight = "Unknown";
        } else if (needleSize < 2.25) {
            weight = "Lace";
        } else if (needleSize < 3.25) {
            weight = "Super fine";
        } else if (needleSize < 3.75) {
            weight = "Fine";
        } else if (needleSize < 4.5) {
            weight = "Light";
        } else if (needleSize < 5.5) {
            weight = "Medium";
        } else if (needleSize < 8) {
            weight = "Bulky";
        } else if (needleSize < 12.75) {
            weight = "Super bulky";
        } else {
            weight = "Jumbo";
        }
    }

    @Override
    public String toString() {
        return name + ", " + amount + " grams";
    }
    
    @Override
    public Object getAttribute(int num) {
        switch (num) {
            case 0:
                return name;
            case 1:
                return weight + " (size " + needleSize + ")";
            case 2:
                return material;
            case 3:
                return amount;
            case 4:
                return color;
            default:
                return null;
        }
    }
}
