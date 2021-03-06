
import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrixVer2 {

    public static void main(String[] args) {
        // Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
        // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
        // or false if it is not
        //
        // example for symmetric matrix:
        // 1 0 1
        // 0 2 2
        // 1 2 5
        //
        // example for not symmetric matrix
        // 7 7 7
        // 6 5 7
        // 1 2 1

        ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

        symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
        symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 2, 2)));
        symmetricMatrix.add(new ArrayList<Integer>(Arrays.asList(2, 2, 5)));

        System.out.println(isSymmetric(symmetricMatrix)); // should print out true
    }

    public static boolean isSymmetric(ArrayList<ArrayList<Integer>> testMatrix) {
        boolean bool = false;
        int[][] arr = new int[testMatrix.size()][testMatrix.size()];

        for (int i = 0; i < testMatrix.size(); i++) {
            for (int j = 0; j < testMatrix.get(i).size(); j++) {
                arr[i][j] = (testMatrix.get(i).get(j));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    bool = true;
                } else {
                    bool = false;
                }
            }
        }
        return bool;
    }
}


//        for(int i=0;i<arr.length;i++){
//        for(int j=0;j<arr.length;j++){
//        if(arr[i][j]==arr[j][i]){
//        bool=true;
//        }else{
//        bool=false;
//        }
//        }
//        }
//        return bool;


//        if (arr[i][j] == arr[j][i]) {
//        bool = true;
//        } else {
//        bool = false;
//        }

//    public static boolean isSymmetric(ArrayList<ArrayList<Integer>> testMatrix) {
//        boolean bool = false;
//        for (int i = 0; i < testMatrix.size(); i++) {
//            for (int j = 0; j < testMatrix.get(i).size(); j++) {
//                if (testMatrix.get(i).get(j) == testMatrix.get(j).get(i)) {
//                    bool = true;
//                }
//                else if (testMatrix.get(i).get(j) != testMatrix.get(j).get(i)) {
//                    bool = false;
//                }
//            }
//        }
//        return bool;
//    }