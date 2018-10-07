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


    public static void main(String[] args) {

        Mentor mentor1 = new Mentor();
        Mentor mentor2 = new Mentor("Aze", 32, "male", "senior");

        mentor1.name = "Eliska";
        mentor1.level = "junior";

        mentor1.introduce();
        mentor1.getGoal();
        mentor2.introduce();
        mentor2.getGoal();
    }
}


//--------------

//    Create a Mentor class that has the same fields and methods as the Person class,
// and has the following additional
//
//        fields:
//        level: the level of the mentor (junior / intermediate / senior)
//        methods:
//        getGoal(): prints out "Educate brilliant junior software developers."
//        introduce(): "Hi, I'm name, a age year old gender level mentor."
//        The Mentor class has the following constructors:
//
//        Mentor(name, age, gender, level)
//        Mentor(): sets name to Jane Doe, age to 30, gender to female, level to
// intermediate
//
//public class Mentor extends Person {
//
//    String level = "intermediate"; //level = junior/intermediate/senior;
//
//    public Mentor() {
//
//    }
//
//    public Mentor(String name, int age, String gender, String level) {
////        this.name = name,
////        this.age = age;
////        this.gender = gender;
//        this.level = level;
//    }

//    public static void main(String[] args) {
//
//        Mentor mentor1 = new Mentor;
//        System.out.println(mentor1);
//
//
//    }
//
//
//}




