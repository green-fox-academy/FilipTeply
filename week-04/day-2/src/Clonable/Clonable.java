package Clonable;

public interface Clonable {
}


//Check out what the Cloneable (java) or ICloneable (.aspx) interface is
//Get your Student class from the Greenfox Organization Exercise
//Make the Student implement the Cloneable interface
//Implement the method, so it clones the student
//Instantiate John, a 20 years old male from BME
//Clone him

//public interface Cloneable
//A class implements the Cloneable interface to indicate to the Object.clone() method
// that it is legal for that method to make a field-for-field copy of instances of that
// class.
//Invoking Object's clone method on an instance that does not implement the Cloneable
// interface results in the exception CloneNotSupportedException being thrown.
//
//By convention, classes that implement this interface should override Object.clone
// (which is protected) with a public method. See Object.clone() for details on overriding
// this method.
//
//Note that this interface does not contain the clone method. Therefore, it is not possible to clone an object merely by virtue of the fact that it implements this interface. Even if the clone method is invoked reflectively, there is no guarantee that it will succeed.