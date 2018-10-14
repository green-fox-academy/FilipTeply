package CarPetrolStation;

public class Car {

    String name;
    double gasAmount;
    double capacity;

    public Car() {
        name = "vehicle";
        gasAmount = 0;
        capacity = 100;
    }

    public Car(String name) {
        this();
        this.name = name;
    }


}


//Car
//gasAmount
//capacity
//create constructor for Car where:
//initialize gasAmount -> 0
//initialize capacity -> 100