//*created by Filip 6.10.2018*//

//Create an Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                when creating a new animal object these values are created with the default 50 value
//        Every animal can eat() which decreases their hunger by one
//        Every animal can drink() which decreases their thirst by one
//        Every animal can play() which increases both by one

import java.sql.Array;

public class Animal {

    int hunger;
    int thirst;
    String name;



    public Animal() {
        hunger = 50;
        thirst = 50;
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public Animal(String name, int hunger, int thirst) {
        //this(); /*is redundant here*/
        this();
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        //this(); /*is mistake at this place*/
    }

    public int eat() {
        System.out.println("Eating...");
        this.hunger--;
        return this.hunger;
        // ? System.out.println( /*this.animal +*/ "\"I have just eaten and my new hunger value is: " + this.hunger + "\"");
    }

    public int eatPortions(int portions) {
        for (int i = 0; i < portions; i++) {
            this.eat();
                    }
        System.out.println("I have just eaten " + portions + " portions. \nHunger status: " + this.hunger + ".\nYamy, yam!");
        return this.hunger;
    }

//    public String toString(){
//        return (eatPortions() ? "I have just eaten " /*+ portions */ + " portions. Current hunger status: " + this.hunger + "Yamy, yam!" : "" /*+ this.name*/);
//
//    }

    public int drink() {

        System.out.println("Drinking...");
        //System.out.println(name.thirst());
        this.thirst--;
        return this.thirst;
    }

    public int[] play() {
        int[] arrHungerThirst = new int[2];
        System.out.println("Playing...");
        this.hunger++;
        this.thirst++;
        arrHungerThirst[0] = this.hunger;
        arrHungerThirst[1] = this.thirst;
        return arrHungerThirst;


    }

    public static void main(String[] args) {

        Animal monkey = new Animal();
        monkey.name = "Shakespeare Monk";

        Animal guineaPig = new Animal("Gunnie");
        Animal wolf = new Animal("Wolfie", 30, 30);
        wolf.name = "Howling wolf";

        //? why error?  Animal wolf = new Animal("Howling wolf",30,30);

        System.out.println(monkey.name);


//        monkey.eat();
//        monkey.eat();

        monkey.eatPortions(10);
        System.out.println(monkey.hunger);

        System.out.println(wolf.name);
        wolf.play();
        System.out.println(wolf.hunger);
        System.out.println(wolf.thirst);
        wolf.eat();
        System.out.println(wolf.hunger);
        wolf.drink();
        System.out.println(wolf.thirst);


        //System.out.println(monkey.hunger);

        //System.out.println(guineaPig.name);

    }


}

