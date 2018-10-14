package TeacherStudent;

public class Student extends Person {

    public Student() {
    }

    public Student(String name) {
        super(name);
    }

    public void learn() {
        System.out.println("My name is" + this.name + "and I am learning.");
    }

    public void question(String question, Teacher teacher) {
        System.out.println(this.name +" is asking: " + question);
        teacher.answer();
    }
}

//Student
//learn()
//question(teacher) -> calls the teachers answer method