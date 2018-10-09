package Gnirts;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

    String string;


    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}


//Check out the CharSequence interface
//Create a Gnirts class implementing this interface
//It should have one String field that can be set via the constructor
//Implementing the interfaces methods always think of the field as backwards, so at the second position of "this example" there is a 'p'
//In a main method try out all the methods
//Create a Shifter class implementing this interface
//This charsequence can be set up with a string (that is to be shifted) and a number (which will tell how many to shift)
//Implement the methods so the returned results of them will be shifted