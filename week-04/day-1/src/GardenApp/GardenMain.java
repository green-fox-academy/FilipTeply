//

//
//The task is to create a garden application, so in your main method you should create a garden
// with flowers and trees. The program should demonstrate an example garden with two flowers
// (yellow and blue) and two trees (purple and orange). In the example after creating them you should
// show the user, how the garden looks like. After that the program should water the garden twice,
// first with the amount of 40 then with 70.
// And after every watering the user should see the state of the garden as you can see in the output.


//The yellow Flower needs water
//        The blue Flower needs water
//        The purple Tree needs water
//        The orange Tree needs water
//
//        Watering with 40
//        The yellow Flower doesnt need water
//        The blue Flower doesnt need water
//        The purple Tree needs water
//        The orange Tree needs water
//
//        Watering with 70
//        The yellow Flower doesnt need water
//        The blue Flower doesnt need water
//        The purple Tree doesnt need water
//        The orange Tree doesnt need water
//
package GardenApp;

import java.util.ArrayList;

public class GardenMain {

    public static void main(String[] args) {

        Garden garden1 = new Garden();
        //Garden plants = new Garden();

        Tree tree1 = new Tree("purple",0);
        Tree tree2 = new Tree("orange",0);

        Flower flower1 = new Flower("yellow",0);
        Flower flower2 = new Flower("blue",0);

//        plants.addPlant(flower1);
//        plants.addPlant(flower2);
//        plants.addPlant(tree1);
//        plants.addPlant(tree2);

        garden1.addPlant(flower1);
        garden1.addPlant(flower2);
        garden1.addPlant(tree1);
        garden1.addPlant(tree2);

        //plants.info();
        garden1.info();

    }

}
