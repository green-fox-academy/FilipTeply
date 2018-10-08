package GFAstructure;

import GFAstructure.Person1;

public class Sponsor1 extends Person1 {


    String company; // name of the company
    int hiredStudents; // number of students hired

    //constructors
//        Sponsor(name, age, gender, company):
// beside the given parameters, it sets hiredStudents to 0
//        Sponsor(): sets name to Jane Doe, age to 30, gender to female,
// company to Google and hiredStudents to 0


    public Sponsor1() {
        this("Jane Doe", 30, "female", "Google");
    }

    public Sponsor1(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age +
                " year old " + this.gender + " who represents " + this.company +
                " and hired " + this.hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public int hire() {
        return hiredStudents++;
    }

}
