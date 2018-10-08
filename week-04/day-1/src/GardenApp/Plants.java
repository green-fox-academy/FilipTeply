package GardenApp;

import java.util.ArrayList;

public class Plants {


    String color;
    double waterStatus;

    public Plants() {
    }

    public Plants(String color, int waterStatus) {
        this.color = color;
        this.waterStatus = 0.0;
    }

    public boolean needsWater() {
        return false;
    }

}
