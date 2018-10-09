package Test1;

public class Main2 extends Car implements Moveable {

    public static void main(String... args) {
        Car c = new Car();
        System.out.println(c.distanceTaken);
        c.move(100);
        System.out.println(c.distanceTaken);

        Moveable something = new Car();
        System.out.println(((Car) something).distanceTaken);
        something.move(200);
        System.out.println(((Car) something).distanceTaken);
    }

}
