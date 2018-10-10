package main.java.music;

public abstract class Instrument {

    protected String name;//name of the instrument


    public Instrument(String name) {
        this.name = name;
    }

    public abstract void play();

//    it reserves (e.g. protected) the
//    it should provide a play() method.

}
