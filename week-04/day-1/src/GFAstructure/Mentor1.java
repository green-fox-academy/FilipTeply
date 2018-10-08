package GFAstructure;

public class Mentor1 extends Person1 {

    String level; //level = junior/intermediate/senior;

    public Mentor1() {
        this("Jane Doe", 30, "female", "intermediate");
    }

    public Mentor1(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }


    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " +
                this.gender + " " + this.level + " mentor.");
    }

}