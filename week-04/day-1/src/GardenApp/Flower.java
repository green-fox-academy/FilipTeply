package GardenApp;


import java.util.ArrayList;

public class Flower extends Plant {

    String color;
    double waterStatus;

    public Flower() {
        super();
    }

    public Flower(String color, double waterStatus) {
        this.color = color;
        this.waterStatus = waterStatus;
    }

//    @Override
//    public boolean needsWater() {
//        if (this.waterStatus < 5) {
//            return true;
//
//        } else {
//            return false;
//        }
//    }

    public boolean needsWater() {
        if (this.waterStatus < 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        //System.out.println();
        return (needsWater() ? "The " + this.color + " Flower needs water." :
                "The " + this.color + " Flower doesn't need water.");
    }

//    @Override
//    public String toString() {
//        return (needsWater() ? "The " + this.color + " needs water." :
//                "The " + this.color + " doesn't need water.");
//    }

}
