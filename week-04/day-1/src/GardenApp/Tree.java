package GardenApp;

public class Tree extends Plants {

    public Tree() {
    }

    public Tree(String color)
    {
    this.color = color;
    }

    public String treeNeedsWater() {
        if (this.waterStatus < 10) {
            return "The " + this.color + " Tree needs water.";
        } else {
            return "The " + this.color + " Tree doesn't need water.";
        }
    }

    @Override
    public String toString(){
        return (needsWater()? "The " + this.color +  " needs water." :
                "The " + this.color +  " doesn't need water.");
    }

}
