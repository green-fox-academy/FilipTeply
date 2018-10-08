package GFAstructure;

public class Person1 {

    String name;
    int age;
    String gender; //male or female

    public Person1() {
        this("Jane Doe", 30, "female");
    }

    public Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old "
                + this.gender + ".");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment.");
    }
}