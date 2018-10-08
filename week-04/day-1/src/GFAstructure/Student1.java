package GFAstructure;

import GFAstructure.Person1;

public class Student1 extends Person1 {

    String previousOrganization; //previous company / school
    int skippedDays;


    public Student1() {
        this("Jane Doe", 30, "female", "The School of Life");
        //super.name = "Jane Doe";
        //super.age = 30;
        //super.gender = female;
    }


    public Student1(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " +
                gender + " from " + previousOrganization + " who skipped " +
                skippedDays + " days from the course already.");
    }

    public int skipDays(int numberOfDays) {
        return skippedDays += numberOfDays;

    }

}