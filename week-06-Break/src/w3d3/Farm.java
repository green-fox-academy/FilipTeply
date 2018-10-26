package w3d3;


import java.util.ArrayList;
import java.util.Arrays;


//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//        it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal

public class Farm {


    String farmName;
    int maxNumberOfSlotsForAnimals;
    ArrayList<Animal> animalList = new ArrayList<>();


    public Farm(String farmName) {
        maxNumberOfSlotsForAnimals = 6;
        this.farmName = farmName;
    }

    public Farm(String farmName, int maxNumberOfSlotsForAnimals) {
        this.farmName = farmName;
        this.maxNumberOfSlotsForAnimals = maxNumberOfSlotsForAnimals;
    }


    public void breed() {
        if (animalList.size() <= maxNumberOfSlotsForAnimals - 1) {
            animalList.add(new Animal("animal" + (animalList.size() + 1)));
            System.out.println("Breeding");
        } else {
            System.out.println("Sorry, breeding not allowed, we cannot accept any more clients.");
        }
    }

    public void slaughter() {
        Animal theLeastHungryAnimal = animalList.get(0);
        int hungerMin = animalList.get(0).hunger;

        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).hunger < hungerMin) {
                hungerMin = animalList.get(i).hunger;
                theLeastHungryAnimal = animalList.get(i);

            }
        }
        theLeastHungryAnimal.alive = false;
        System.out.println("RIP");
        animalList.remove(theLeastHungryAnimal);
    }

    public void farmInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return this.farmName + " farm has " + this.animalList.size() + " animals: " + this.animalList;
    }

    public static void main(String[] args) {

        Farm georgeOrwell = new Farm("Orwell");


//        Animal monkey = new Animal("Shakespeare Monk");
//        Animal guineaPig = new Animal("Gunnie");
//        Animal wolf = new Animal("noNameYet", 30, 30);
//          georgeOrwell.animalList.addAll(Arrays.asList(monkey, guineaPig, wolf));

        georgeOrwell.animalList.addAll(Arrays.asList(
                new Animal("Pig KillMe", 5, 30),
                new Animal("Shakespeare Monk"),
                new Animal("Gunnie", 80, 100),
                new Animal("noNameYet", 30, 30)
        ));
        Animal wolf = new Animal("Wolfie", 13, 1);
        georgeOrwell.animalList.add(wolf);
        georgeOrwell.farmInfo();
        georgeOrwell.breed();
        georgeOrwell.breed();
        georgeOrwell.breed();
        georgeOrwell.farmInfo();

//        System.out.println(georgeOrwell.animalList.size());
//        System.out.println(georgeOrwell.animalList.get(4).name);

        georgeOrwell.slaughter();
        georgeOrwell.farmInfo();
        wolf.eatPortions(5);
        georgeOrwell.farmInfo();
        georgeOrwell.slaughter();
        georgeOrwell.farmInfo();

        wolf.eatPortions(5);

    }


}

