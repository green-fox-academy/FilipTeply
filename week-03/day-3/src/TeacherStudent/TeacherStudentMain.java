package TeacherStudent;

public class TeacherStudentMain {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("J.A.Komensky");
        Student student1 = new Student("John Student");

        System.out.println(teacher1.name);

        student1.question("What is the result of task1?", teacher1);

    }

}
