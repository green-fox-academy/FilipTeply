//*created by Filip 6.10.2018*//
package w3d3;

//Create an Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                when creating a new animal object these values are created with the default 50 value
//        Every animal can eat() which decreases their hunger by one
//        Every animal can drink() which decreases their thirst by one
//        Every animal can play() which increases both by one

public class Animal {

    int hunger;
    int thirst;
    String name;
    boolean alive;

    public Animal() {
        hunger = 50;
        thirst = 50;
        alive = true;
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public Animal(String name, int hunger, int thirst) {
        this();
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat() {
        if (alive) {
            this.hunger--;
            System.out.println(this.name+ " is eating...");
            // ? System.out.println( /*this.animal +*/ "\"I have just eaten and my new hunger value is: " + this.hunger + "\"");
        } else {
            System.out.println("Dead cannot drink.");
        }
    }

    public boolean eatPortions(int portions) {
        if (alive) {
            for (int i = 0; i < portions; i++) {
                this.eat();
            }
            System.out.println("I have just eaten " + portions + " portions. \nHunger status: " + this.hunger + ".\nYamy, yam!");
            return true;

        } else {
            System.out.println("Dead cannot eat.");
            return false;
        }
    }

//    public String toString(){
//        return (eatPortions() ? "I have just eaten " /*+ portions */ + " portions. Current hunger status: " + this.hunger + "Yamy, yam!" : "" /*+ this.name*/);
//
//    }

    public void drink() {
        if (alive) {
            this.thirst--;
            System.out.println("Drinking...");
            //System.out.println(name.thirst());
        } else {
            System.out.println("Dead cannot drink.");
        }
    }

    public void play() {
        if (alive) {
            this.hunger++;
            this.thirst++;
            System.out.println("Playing...");
        } else {
            System.out.println("Dead cannot play.");
        }
    }

    @Override
    public String toString() {
        return this.name + " with hunger: " + this.hunger + " and thirst: " + this.thirst;
    }

}
