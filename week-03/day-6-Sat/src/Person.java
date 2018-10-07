public class Person {

    String name;
    int age;
    String gender;

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
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " old " + this.gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }


    public static void main(String[] args) {
        Person person1 = new Person();
        Person student1 = new Student();

        person1.introduce();
        person1.getGoal();

        //? student1.skipDays(5);
        student1.introduce();

    }

}