package Thing;//You have the Thing class
//You have the Fleet class
//You have the FleetOfThings class with a main method
//        Download those, use those
//        In the main method create a fleet
//        Achieve this output:
//        1. [ ] Get milk
//        2. [ ] Remove the obstacles
//        3. [x] Stand up
//        4. [x] Eat lunch



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet1 = new Fleet();

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");

        List<Thing> things = new ArrayList<Thing>();

        things.add(milk);
        things.add(obstacles);
        things.add(standUp);
        things.add(eatLunch);

        fleet1.add(milk);
        fleet1.add(obstacles);
        fleet1.add(standUp);
        fleet1.add(eatLunch);

        standUp.complete();
        eatLunch.complete();
        // the following cannot undo complete eatLunch.complete();
        // it seems to be an irreversible completion

        System.out.println(fleet1);
        System.out.println();

       Collections.sort(things);
       System.out.println(things);

    }
}

