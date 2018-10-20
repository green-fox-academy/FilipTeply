package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    //Electric Guitar (6 strings, "Twang")
    //String sound;


    public ElectricGuitar() {
        this(6);
        //why not?
        // super(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }

//    @Override
//    public void play() {
//        System.out.println(this.name + ", a " + /*this.numberOfStrings +*/ "-stringed instrument. that goes " + this.sound() +".");
//    }

//    @Override
//    public String toString() {
//        return this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound;
//    }


}
