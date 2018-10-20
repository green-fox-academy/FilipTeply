package main.java.music;

public abstract class Instrument {

    protected String name;
    //name of the instrument


    public Instrument(String name) {
        this.name = name;
    }

    // public
    abstract void play();


//    @Override
//    public String toString(){
//        return  this.name + ", a instrument.";
//    }

    //Electric Guitar, a 6-stringed instrument that goes Twang

//    it reserves (e.g. protected) the
//    it should provide a play() method.

}
