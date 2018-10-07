public class PersonExerciseCombined {


    public class Person {

        String name;
        int age;
        String gender; //male or female

        public Person() {
            this("Jane Doe", 30, "female");
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
            System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
        }

        public void getGoal() {
            System.out.println("My goal is: Live for the moment!");
        }
    }

    public class Student {

        String name;
        int age;
        String gender; //male or female

        String previousOrganization; //previous company / school
        int skippedDays;

        public Student() {
            this("Jane Doe", 30, "female");
            //or the following: this.name = "Jane Doe";
            //this.age = 30;
            //this.gender = female;
        }

        public Student(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public Student(String name, int age, String gender, String previousOrganization) {
            this();
            this.previousOrganization = previousOrganization;
            this.skippedDays = 0;
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
            System.out.println("Be a junior software developer.");
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

    public class Mentor {

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
            System.out.println("Educate brilliant junior software developers.");
        }

        public void introduce() {
            System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " +
                    this.gender + " " + this.level + " mentor.");
//                "Hi, I'm name, a age year old gender level mentor."
        }

    }

    public class Sponsor {

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
            this.hiredStudents = 10;
        }

        public Sponsor(String name, int age, String gender, String company) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.company = company;
            this.hiredStudents = 3;
        }

        public void introduce() {
            System.out.println("Hi, I'm " + this.name + ", a " + this.age +
                    " year old " + this.gender + " who represents " + this.company +
                    " and hired " + this.hiredStudents + " students so far.");
        }

        public void getGoal() {
            System.out.println("Hire brilliant junior software developers.");
        }

        public int hire() {
            return hiredStudents++;
        }
    }

    public static void main(String[] args) {

        
    }
//
}
