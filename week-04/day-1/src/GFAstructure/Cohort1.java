package GFAstructure;

import java.util.ArrayList;

public class Cohort1 {

    String name; // the name of the cohort

    ArrayList students; // a list of Students
    ArrayList mentors;//a list of Mentors

    public Cohort1() {
    }

    public Cohort1(String name) {
        this.name = name;
        this.mentors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addStudent(Student1 name) {
        students.add(this.name);
    }

    public void addMentor(Mentor1 name) {
        mentors.add(this.name);
    }

    //    : adds the given Student to students list
//        addMentor(Mentor): adds the given Mentor to mentors list
//        info(): prints out "The name cohort has students.size() students and mentors.size() mentors."

    public void info() {
        System.out.println("The " + this.name + " cohort has " + students.size() +
                " students and " + mentors.size() + " mentors.");
    }


}


//
//    Create a Cohort class that has the following
//
//        fields:
//        name: the name of the cohort
//        students: a list of Students
//        mentors: a list of Mentors
//        methods:
//        addStudent(Student): adds the given Student to students list
//        addMentor(Mentor): adds the given Mentor to mentors list
//        info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
//        The Cohort class has the following constructors:
//
//        Cohort(name): beside the given parameter, it sets students and mentors as empty lists