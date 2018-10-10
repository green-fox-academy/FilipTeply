//The Garden
//        is able to hold unlimited amount of flowers or trees
//        when watering it should only water those what needs water with equally divided amount amongst them
//        eg. watering with 40 and 4 of them need water then each gets watered with 10

//        The Flower
//        needs water if its current water amount is less then 5
//        when watering it the flower can only absorb the 75% of the water
//        eg. watering with 10 the flower's amount of water should only increase with 7.5

//        The Tree
//        needs water if its current water amount is less then 10
//        when watering it the tree can only absorb the 40% of the water
//        eg. watering with 10 the tree's amount of water should only increase with 4

package GardenApp;

import java.util.ArrayList;

public class Garden {


    ArrayList<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }


    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void waterGarden(int waterAmount) {

        double waterShare;
        waterShare = (double)(waterAmount) / (double)(plants.size());

        for (Plant item : plants) {

            if (item instanceof Flower) {
                item.waterStatus += 0.75 * waterShare;
            }
            if (item instanceof Tree) {
                item.waterStatus += 0.40 * waterShare;
            }
        }
    }

    public void info() {
        //System.out.println();
        System.out.println(plants.toString());
    }

//    @Override
//    public void needWater() {
//
//        for (Plant item : plants) {
//            System.out.println(plants.toString());
//        }
//    }


}


