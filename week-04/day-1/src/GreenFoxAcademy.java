import GFAstructure.Person1;

import java.util.ArrayList;

public class GreenFoxAcademy {









    public static class Sponsor {

        String name;
        int age;
        String gender; //male or female

        String company; // name of the company
        int hiredStudents = 0; // number of students hired

        //constructors
//        Sponsor(name, age, gender, company):
// beside the given parameters, it sets hiredStudents to 0
//        Sponsor(): sets name to Jane Doe, age to 30, gender to female,
// company to Google and hiredStudents to 0


        public Sponsor() {
            this("Jane Doe", 30, "female", "Google");
//          ??  this.hiredStudents = 0;
        }

        public Sponsor(String name, int age, String gender, String company) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.company = company;

        }

        public void introduce() {
            System.out.println("Hi, I'm " + this.name + ", a " + this.age +
                    " year old " + this.gender + " who represents " + this.company +
                    " and hired " + this.hiredStudents + " students so far.");
        }

        public void getGoal() {
            System.out.println("My goal is: Hire brilliant junior software developers.");
        }

        public int hire() {
            return hiredStudents++;
        }
    }

    public static void main(String[] args) {

        ArrayList<Person1> people = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Mentor> mentors = new ArrayList<>();
        ArrayList<Sponsor> sponsors = new ArrayList<>();

        Person1 mark = new Person1("Mark", 46, "male");
        people.add(mark);
        Person1 jane = new Person1();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        students.add(john);
        Student student = new Student();
        students.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        mentors.add(gandhi);
        Mentor mentor = new Mentor();
        mentors.add(mentor);
        Sponsor sponsor = new Sponsor();
        sponsors.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        sponsors.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for (Person1 per : people) {
            per.introduce();
            per.getGoal();
        }

        for (Student person : students) {
            person.introduce();
            person.getGoal();
        }

        for (Mentor person : mentors) {
            person.introduce();
            person.getGoal();
        }

        for (Sponsor person : sponsors) {
            person.introduce();
            person.getGoal();
        }

    }
//
}
