package GardenApp;

public class Tree extends Plant {

    String color;
    double waterStatus;

    public Tree() {
        super();
    }

    public Tree(String color, double waterStatus) {
        this.color = color;
        this.waterStatus = waterStatus;
    }

    public boolean needsWater() {
        if (this.waterStatus < 10) {
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
