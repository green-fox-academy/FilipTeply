public class Student implements Cloneable {

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

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.introduce();
        student1.skipDays(5);
        student1.previousOrganization = "MIT";
        student1.introduce();
        student1.getGoal();
        System.out.println(student1.previousOrganization);
        System.out.println(student1.skippedDays);

        //        Person person1 = new Person();
//
//        person1.introduce();
//        person1.getGoal();
    }

}

////////////////////////////////////////////
//    Create a Student class that has the same fields and methods as the Person class,
// and has the following additional
//
//        fields:
//        previousOrganization: the name of the student’s previous company / school
//        skippedDays: the number of days skipped from the course
//        methods:
//        getGoal(): prints out "Be a junior software developer."
//        introduce(): "Hi, I'm name, a age year old gender from previousOrganization
// who skipped skippedDays days from the course already."
//        skipDays(numberOfDays): increases skippedDays by numberOfDays
//        The Student class has the following constructors:
//
//        Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//        Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
//-------------------------------------
// cut
//    public Student() {
//
//    }
//
//    public Student(String name, int age, String gender, String previousOrganization) {
//        this();
//        this.previousOrganization = previousOrganization;
//        this.skippedDays = 0;
//    }
//
//    public void getGoal() {
//        System.out.println("Be a junior software developer.");
//    }
//
//    public void introduce() {
//        System.out.println("Hi, I'm " + name + " , a " + age + " year old " +
//                gender + " from " + previousOrganization + " who skipped " +
//                skippedDays + " days from the course already.");
//    }
//
//    public int skipDays(int numberOfDays) {
//        return skippedDays += numberOfDays;
//
//    }