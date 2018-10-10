package GardenApp;

public class Plant {

    String color;
    double waterStatus;

    public Plant() {
        this.color = "default color";
        this.waterStatus = 0.0;
    }

    public Plant(String color, double waterStatus) {
        this.color = color;
        this.waterStatus = waterStatus;


    }

    public boolean needsWater() {
        return false;
    }
}
