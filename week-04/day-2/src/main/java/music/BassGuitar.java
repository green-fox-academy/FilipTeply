package main.java.music;

public class BassGuitar extends StringedInstrument {


    //Bass Guitar (4 strings, "Duum-duum-duum")


    public BassGuitar() {
        this(4);
        //why not?
        // super(4);
    }

    public BassGuitar(int numberOfStrings) {
        super("Bass Guitar", numberOfStrings);

    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}


