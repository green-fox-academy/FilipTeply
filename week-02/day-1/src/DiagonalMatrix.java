// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class DiagonalMatrix {

    public static void main(String[] args) {
        int x = 5;
        int y = x;
        int[][] twoDmatrix = new int[x][y];



        for (int i = 0; i < twoDmatrix.length; i++) {

            for (int j = 0; j < twoDmatrix.length; j++) {

                if (i != j) {
                    twoDmatrix[i][j] = 0;
                }
                else {
                    twoDmatrix[i][j] = 1;

                }

            }

        }

        printArray(twoDmatrix);

    }



    public static void printArray(int[][] a){


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }


    }

}
