package GardenApp;

public class Tree extends Plant {

//    cannot be here!!! If it is there, water status stays 0.0 even after watering
//    String color;
//    double waterStatus;

    public Tree() {
        super();
    }

    public Tree(String color, double waterStatus) {
        super(color, waterStatus);
//        this.color = color;
//        this.waterStatus = waterStatus;
    }

    public boolean needsWater() {
        if (this.waterStatus < 10d) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        //System.out.println();
        return (this.needsWater() ? "The " + this.color + " Tree needs water." :
                "The " + this.color + " Tree doesn't need water.");
    }

}
