package GFAstructure;

import GFAstructure.Cohort1;

import java.util.ArrayList;

public class GFAmain {

    public static void main(String[] args) {

        ArrayList<Person1> people = new ArrayList<>();

        Person1 mark = new Person1("Mark", 46, "male");
        people.add(mark);
        Person1 jane = new Person1();
        people.add(jane);
        Student1 john = new Student1("John Doe", 20, "male", "BME");
        people.add(john);
        Student1 student = new Student1();
        people.add(student);
        Mentor1 gandhi = new Mentor1("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor1 mentor = new Mentor1();
        people.add(mentor);
        Sponsor1 sponsor = new Sponsor1();
        people.add(sponsor);
        Sponsor1 elon = new Sponsor1("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        Student1 student3 = new Student1("John", 20, "male", "BME");
        Student1 cloned = student3.clone();


//        John, a 20 years old male from BME

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person1 person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort1 awesome = new Cohort1("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.addStudent(student3);
        awesome.info();
        cloned.introduce();

    }
}
