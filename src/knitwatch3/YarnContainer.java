package knitwatch3;

import java.awt.Color;

public class YarnContainer extends Container {
     
     public YarnContainer() {
         super();
     }
     
     public void addNew(String line) {;
         String[] attributes = line.split(";");
         
         if(attributes[0].equals("")) {
             attributes[0] = "Unnamed yarn";
         }
         
         if (attributes[1].equals("")) {
             attributes[1] = "0";
         }
         double needleSize = Double.parseDouble(attributes[1].trim());
         
         if (attributes[2].equals("")) {
             attributes[2] = "Unknown";
         }
         
         if (attributes[3].equals("")) {
             attributes[3] = "0";
         }
         int amount = Integer.parseInt(attributes[3].trim());
         
         if (attributes[4].equals("")) {
             attributes[4] = "0 0 0";
         }
         String[] colorNumbers = attributes[4].trim().split(" ");
         int red = Integer.parseInt(colorNumbers[0].trim());
         int green = Integer.parseInt(colorNumbers[1].trim());
         int blue = Integer.parseInt(colorNumbers[2].trim());
         
         list.add(new Yarn(attributes[0].trim(), needleSize, attributes[2].trim(), amount, new Color(red, green, blue), line));
     }
     
     public int getAmountOfYarn() {
         int total = 0;
         for (Item yarn : list) {
             total += (int) yarn.getAttribute(3); // amount is yarn item's 4th attribute
         }
         return total;
     }
     
     @Override
     protected void createMyItem() {
         myItem = new Yarn("r", 0, "s", 4, new Color(0,0,0), "r;0;s;4;0 0 0");
     }
     
}
