import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> numbers;
    //ArrayList<Integer> numbers = new ArrayList<>();
    int sum = 0;

    public Sum() {
    }

    public Sum(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }


    public int getSum(ArrayList<Integer> numbers) {
        for (Integer itemNo : numbers) {
            sum += itemNo;
        }
        return sum;
    }


}
//
//    Create a sum method in your class which has an ArrayList of Integers as parameter
//        It should return the sum of the elements in the list
//        Follow these steps:
//        Add a new test case
//        Instantiate your class
//create a list of integers
//                use the assertEquals to test the result of the created sum method
//                Run them
//                Create different tests where you
//                test your method with an empyt list
//                with a list with one element in it
//                with multiple elements in it
//                with a null
//        Run them
//        Fix your code if needed
