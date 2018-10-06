//*created by Filip 6.10.2018*//

//Create an Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                when creating a new animal object these values are created with the default 50 value
//        Every animal can eat() which decreases their hunger by one
//        Every animal can drink() which decreases their thirst by one
//        Every animal can play() which increases both by one

public class Animal {

    int hunger = 50;
    int thirst = 50;
    String name;

    public Animal() {
        //? this(hunger = 50, thirst = 50);
    }

    public Animal(String name) {
        this(); //??
        this.name = name;
    }

    public Animal(int hunger, int thirst) {
        this(); //??
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat() {
        this.hunger--;
        System.out.println("Eating...");
        // ? System.out.println( /*this.animal +*/ "\"I have just eaten and my new hunger value is: " + this.hunger + "\"");
    }

    public boolean eatPortions(int portions) {
        for (int i = 0; i < portions; i++) {
            this.eat();
        }
        System.out.println("I have just eaten " + portions + " portions. \nHunger status: " + this.hunger + ".\nYamy, yam!");
        return true;
    }

//    public String toString(){
//        return (eatPortions() ? "I have just eaten " /*+ portions */ + " portions. Current hunger status: " + this.hunger + "Yamy, yam!" : "" /*+ this.name*/);
//
//    }

    public void drink() {
        this.thirst--;
        System.out.println("Drinking...");
        //System.out.println(name.thirst());
    }

    public void play() {
        this.hunger++;
        this.thirst++;
        System.out.println("Playing...");
    }

    public static void main(String[] args) {

        Animal monkey = new Animal();
        monkey.name = "Shakespeare Monk";

        Animal guineaPig = new Animal("Gunnie");
        Animal wolf = new Animal(30, 30);
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
