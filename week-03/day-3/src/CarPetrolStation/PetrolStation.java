package CarPetrolStation;

public class PetrolStation {

    String brandname;
    double gasAmount;

    public PetrolStation() {
        brandname = "genericName";
    }

    public PetrolStation(String brandname) {
        this.brandname = brandname;
    }

    public double refill(Car car) {

        car.gasAmount = car.capacity;
        this.gasAmount = this.gasAmount - car.capacity;
        System.out.println(this.brandname + " petrol station has just refilled "
                + car.name + " and its gas amount is " + car.gasAmount+ ".");
        return this.gasAmount;
    }



}

//Create Station and Car classes
//Station
//gasAmount
//refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount