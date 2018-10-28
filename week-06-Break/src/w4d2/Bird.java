package w4d2;

import w3d3.Animal;

public class Bird extends Animal implements Flyable {

    //String name;

    public Bird() {
        super("Birds name", 5, 5);

        System.out.println("Constructor of Bird has been called");
        //super("Lora", 3, 3);
    }

//    public Bird(String name) {
//        this();
//        this.name = name;
//    }

//    public Bird(){
//
//    }

    public void hop() {
        System.out.println("I am hopping!");
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {
        System.out.println("Frrrrrnnnkkk");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public String toString() {
        return "Bird{}";
    }

    public static void main(String[] args) {

       // Animal bird1 = new Bird("Eaglie");
        //((Bird) bird1).hop();
        //((Bird) bird1).fly();

        //Bird bird2 = new Bird("Hawkie");
        //bird2.fly();
        //System.out.println(bird1.

        //System.out.println(bird.name);
        //System.out.println(bird1.);
        //System.out.println(bird1.toString());
        //System.out.println(bird1.toString());

    }


}
