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


    public static void main(String[] args) {
        Sponsor sponsor1 = new Sponsor("John", 54, "male", "IBM");
        Sponsor sponsor2 = new Sponsor();

        sponsor1.hire();
        sponsor1.introduce();
        sponsor1.getGoal();

        System.out.println();

        sponsor2.introduce();
        sponsor2.hire();
        System.out.println(sponsor2.hiredStudents);
    }

}


/////////////////
//
//Create a Sponsor class that has the same fields and methods as the Person class,
// and has the following additional
//
//        fields:
//        company: name of the company
//        hiredStudents: number of students hired
//        method:
//        introduce(): "Hi, I'm name, a age year old gender who represents company and
// hired hiredStudents students so far."
//        hire(): increase hiredStudents by 1
//        getGoal(): prints out "Hire brilliant junior software developers."
//        The Sponsor class has the following constructors:
//
//        Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
//        Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0