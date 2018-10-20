package GFAstructure;

import GFAstructure.Cohort1;

import java.util.ArrayList;

public class GFAmain {

    public static void main(String[] args) {

        ArrayList<Person1> people = new ArrayList<>();

        Person1 mark = new Person1("Mark", 46, "male");
        people.add(mark);
        Person1 jane = new Person1();
        people.add(jane);
        Person1 brian = new Person1 ("Brian", 33, "male");
        Student1 john = new Student1("John Doe", 20, "male", "BME");
        people.add(john);
        Student1 student = new Student1();
        people.add(student);
        Mentor1 gandhi = new Mentor1("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor1 mentor = new Mentor1();
        people.add(mentor);
        Sponsor1 sponsor = new Sponsor1();
        people.add(sponsor);
        Sponsor1 elon = new Sponsor1("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        Student1 student3 = new Student1("John", 20, "male", "BME");
        Student1 cloned = student3.clone();


//        John, a 20 years old male from BME

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person1 person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort1 awesome = new Cohort1("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.addStudent(student3);
        awesome.info();
        cloned.introduce();
        brian.introduce();
        brian.getGoal();

    }
}

//ArrayList<Book> shelfName = new ArrayList();


//public static void main(String[] args) {





// create an array of integers and add elements

//        int[][] matrix1 = {{1, 2, 3}, {3, 4, 6}, {5, 2, 5}};
//
//        System.out.println(getAntiDiagonalAvg(matrix1));



//    public double getAntiDiagonalAvg(int[][] matrix) {
//
//
//        for (int i = 0; i < matrix.length; i++) {
//            antiDiagSum += (matrix[i][ matrix.length - 1 - i]);
//        }
//
//        System.out.println(antiDiagSum);
//
//        antiDiagAvg = (double) (antiDiagSum) / (double)(matrix.length);
//        System.out.println();
//
//        return antiDiagAvg;
//    }

///////////////////////

//antiDiagSum += (matrix.get(i + matrix.size() - 1 - i));
//    int[][] arr = new int();
//    int[] arr = Arrays.asList((1, 2, 3),(3, 4, 6),(5, 2, 5));
//    int[][] arr = new int{{1, 2, 3},{3, 4, 6},{5, 2, 5}};
//
//    List list1 = Arrays.asList(a);
//
//
//    arr1 = new Arrays.asList(1, 2, 3);
//
//    arr1 = [1, 2, 3]

//    ArrayList<Integers> matrix1 = new ArrayList<Integers>();


//package EndsWithS;
//
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class EndsWithS {
//
//    /**
//     * Create a method called `endsWithS` that takes a filename as a string
//     * and returns the number of the words, that ends with 's'.
//     * <p>
//     * Example cases:
//     * <p>
//     * the correct output for the 'base.txt' is: 26
//     * hint: Keep in mind that there may punctuation marks at the end of the words
//     */
//
//    public static void main(String[] args) {
//
//        String filename = "C:\\Users\\TeplyF\\greenfox\\prg-vulpes-basic-exam\\src\\EndsWithS\\base.txt";
//        System.out.println(endsWithS(filename));
//
//    }
//
//    public static int endsWithS(String filename) {
//        int count = 0;
//
//        try {
//            Path myPath = Paths.get(filename);
//            List<String> lines = Files.readAllLines(myPath);
//
//
//            for (int i = 0; i < lines.size(); i++) {
//
//                //String line = new String();
//                String lineIinLowerCase = lines.get(i).toLowerCase();
//                //String lineWithoutNonLetterChars = lineIinLowerCase.replaceAll("[^a-z]", "");
//                String[] words = lineIinLowerCase.split(" ");
//
//                for (int j = 0; j < words.length; j++) {
//                    if (words[j].replaceAll("[^a-z]", "").endsWith("s")) {
//                        count++;
//                    }
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return count;
//    }
//
//
//}