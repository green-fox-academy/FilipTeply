package GFAstructure;

import GFAstructure.Person1;

public class Student1 extends Person1 implements Cloneable {

    String previousOrganization;
    int skippedDays;

    public Student1() {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }


    public Student1(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;

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

    @Override
    public Student1 clone() {

        Student1 clone = new Student1();
        clone.name = this.name;
        clone.age = this.age;
        clone.gender = this.gender;
        clone.previousOrganization = this.previousOrganization;
        clone.skippedDays = this.skippedDays;
        return clone;

//        String previousOrganization; //previous company / school
//        int skippedDays;

    }


}