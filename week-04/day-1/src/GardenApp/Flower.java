package GardenApp;


import java.util.ArrayList;

public class Flower extends Plants {


    public Flower() {
    }

    public Flower(String color) {
        this.color = color;
    }

    @Override
    public boolean needsWater() {
        if (this.waterStatus < 5) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return (needsWater() ? "The " + this.color + " needs water." :
                "The " + this.color + " doesn't need water.");
    }
}
