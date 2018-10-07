import java.util.ArrayList;

public class PersonExerciseCombined {

    public static class Person {

        String name = "Jane Doe";
        int age = 30;
        String gender = "female"; //male or female

        public Person() {
            //this("Jane Doe", 30, "female");
            //or the following: this.name = "Jane Doe";
            //this.age = 30;
            //this.gender = female;
        }

        public Person(String name, int age, String gender) {
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

    public static class Student {

        String name = "Jane Doe";
        int age = 30;
        String gender = "female"; //male or female

        String previousOrganization = "The School of Life"; //previous company / school
        int skippedDays = 0;

        public Student() {
            //this();
            //this("Jane Doe", 30, "female");
            //or the following: this.name = "Jane Doe";
            //this.age = 30;
            //this.gender = female;
        }

        // does the following constructor make any difference?
        public Student(String name, int age, String gender) {
            //this("Jane Doe", 30, "female");
        }

        public Student(String name, int age, String gender, String previousOrganization) {
            //?? why not the following??
            // this();
            this.name = name;
            this.age = age;
            this.gender = gender;

            this.previousOrganization = previousOrganization;

        }

        // why this is not possible here?: public Student(){}

        // BTW: class Person has the following methods:
// public void introduce() {
//        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
//    }
//
//    public void getGoal() {
//        System.out.println("My goal is: Live for the moment!");
//    }

        public void getGoal() {
            System.out.println("My goal is: Be a junior software developer.");
        }

        public void introduce() {
            System.out.println("Hi, I'm " + name + ", a " + age + " year old " +
                    gender + " from " + previousOrganization + " who skipped " +
                    skippedDays + " days from the course already.");
        }

        public int skipDays(int numberOfDays) {
            return skippedDays += numberOfDays;

        }

    }

    public static class Mentor {

//    String name ;
//    int age;
//    String gender; //male or female

        String name = "Jane Doe";
        int age = 30;
        String gender = "female"; //male or female

        String level = "intermediate"; //level = junior/intermediate/senior;

        public Mentor() {
            // here or in the field definition?
//        this.name = "Jane Doe";
//        this.age = 30;
//        this.gender = "female";
        }

        public Mentor(String name, int age, String gender, String level) {

            this.name = name;
            this.age = age;
            this.gender = gender;
            this.level = level;
        }

// why the following cannot be here
//public void introduce() {
//    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " +
// this.gender);
//}
//
//    public void getGoal() {
//        System.out.println("My goal is: Live for the moment!");
//    }

        public void getGoal() {
            System.out.println("My goal is: Educate brilliant junior software developers.");
        }

        public void introduce() {
            System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " +
                    this.gender + " " + this.level + " mentor.");
//                "Hi, I'm name, a age year old gender level mentor."
        }

    }

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

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Mentor> mentors = new ArrayList<>();
        ArrayList<Sponsor> sponsors = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
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

        for (Person per : people) {
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
