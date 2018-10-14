package TeacherStudent;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name) {
        super(name);
    }

    public void teachStudent(Student student) {
        student.learn();
    }

    public void answer() {
        System.out.println("Teacher " +  this.name + " answers: This is a great question!");
    }


}


/////Create Student and Teacher classes
//Student
//learn()
//question(teacher) -> calls the teachers answer method
//Teacher
//teach(student) -> calls the students learn method
//answer()