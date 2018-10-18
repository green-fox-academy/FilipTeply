package main.java.music;

public abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    //???
    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument, that goes " + this.sound());
    }

//    @Override
//    public String toString(){
//        return  this.name + ", a " + this.numberOfStrings +"-stringed instrument";
//    }

}

//    introduces numberOfStrings and
//    sound() method what's implementation is yet unknown
//    but with the help of the sound() the play() method is fully implementable
