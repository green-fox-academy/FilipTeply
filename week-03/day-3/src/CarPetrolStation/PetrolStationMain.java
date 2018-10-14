package CarPetrolStation;

public class PetrolStationMain {

    public static void main(String[] args) {

        PetrolStation omv = new PetrolStation();
        System.out.println(omv.brandname);

        PetrolStation shell = new PetrolStation("Shell");
        System.out.println(shell.brandname);

        Car bmw = new Car("BMW");
        System.out.println(bmw.name);

        System.out.println(bmw.gasAmount);
        System.out.println(bmw.capacity);

        Car trabant = new Car();
        System.out.println(trabant.name + " " + trabant.gasAmount + " " + trabant.capacity + ".");

        //omv.refill(trabant);
        shell.refill(bmw);
//        shell.refill(bmw);
        System.out.println(shell.refill(bmw));
//        System.out.println(shell.refill(bmw));
//        System.out.println(shell.refill(bmw));

    }
}
