package cognitive_aprenticeship;

import java.util.Scanner;


public class MinesweeperGame {

    public static final int SIZE = 10;
    public static final int NUMBEROfMINES = 10;


    public static int X;
    public static int Y;

    public static int[][] boardValue = new int[SIZE][SIZE];
    //mine -> 9
    //number of neighbouring fields containing mines -> 0 - 8

    public static boolean[][] visitedField = new boolean[SIZE][SIZE];
    //show X for !visited and boardValue for visited


    public static void main(String[] args) {

        int numberOfGuesses = 0;
        //Board board = new Board();

        generateMinesInBoard();
        setAllFieldsAsNonVisited();
        drawUnveiledBoard();
        generateMinesNeighbourCounts();
        drawUnveiledBoard();

        while (true) {
            int testy;
            int testx;
            System.out.println("Give me coordinates y\\x you want to explore.");
            Scanner scanner = new Scanner(System.in);
            String testedCoordinates = scanner.nextLine();
            testy = (Integer.parseInt(testedCoordinates.substring(0, 1)));
            testx = (Integer.parseInt(testedCoordinates.substring(2)));
            System.out.println("Tested coordinates y\\x are: " + testy + "\\" + testx);
            numberOfGuesses++;

            visitField(testy, testx);

            if (numberOfGuesses == (SIZE * SIZE - NUMBEROfMINES - 1)) {
                drawUnveiledBoard();
                System.out.println("You successfully located all mines. Congratulations!");
                break;
            }

            if (boardValue[testy][testx] == 9) {
                drawUnveiledBoard();
                drawBoard();
                System.out.println("Booooooooooom! Game is over.");
                break;
            }
            revealNeighboursOfZeroFields(testy, testx);
            drawBoard();
        }


    }


    public static void drawUnveiledBoard() {
        System.out.print("  y\\x");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print("  " + i + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + boardValue[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void drawBoard() {
        System.out.print("  y\\x");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print("  " + i + "  ");
            for (int j = 0; j < SIZE; j++) {
                if (!visitedField[i][j]) {
                    System.out.print(" " + "X" + " ");
                }
                if (visitedField[i][j]) {
                    System.out.print(" " + boardValue[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    public static void generateMinesInBoard() {
        int count0 = 0;
        int mineCount = 0;
        //mine presence encoded as int[i][j]=9

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                boardValue[i][j] = 0;
                count0++;
                System.out.print(" 0:" + count0);
            }
        }
        System.out.println();

        while (mineCount < NUMBEROfMINES) {
            generateRandomXY();
            if (boardValue[Y][X] != 9) {
                boardValue[Y][X] = 9;
                System.out.print(" M:" + mineCount);
                mineCount++;
            }
        }
        System.out.println();
    }


    public static void generateMinesNeighbourCounts() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (boardValue[i][j] != 9) {
                    if (i > 0 && j > 0 && boardValue[i - 1][j - 1] == 9) {
                        boardValue[i][j]++;
                    }
                    if (i > 0 && boardValue[i - 1][j] == 9) {
                        boardValue[i][j]++;
                    }
                    if (i > 0 && j < (SIZE - 1) && boardValue[i - 1][j + 1] == 9) {
                        boardValue[i][j]++;
                    }
                    if (j > 0 && boardValue[i][j - 1] == 9) {
                        boardValue[i][j]++;
                    }
                    if (j < (SIZE - 1) && boardValue[i][j + 1] == 9) {
                        boardValue[i][j]++;
                    }
                    if (i < (SIZE - 1) && j > 0 && boardValue[i + 1][j - 1] == 9) {
                        boardValue[i][j]++;
                    }
                    if (i < (SIZE - 1) && boardValue[i + 1][j] == 9) {
                        boardValue[i][j]++;
                    }
                    if (i < (SIZE - 1) && j < (SIZE - 1) && boardValue[i + 1][j + 1] == 9) {
                        boardValue[i][j]++;
                    }
                }
            }
        }
    }

    public static int revealNeighboursOfZeroFields(int y, int x) {

        if (boardValue[y][x] == 0) {

            if (y > 0 && x > 0) {
                visitField(y - 1, x - 1);
//                if (y - 1 > 0 && x - 1 > 0 && boardValue[y - 1][x - 1] == 0) {
//                    return revealNeighboursOfZeroFields(y - 1, x - 1);
//                }
            }
            if (y > 0) {
                visitField(y - 1, x);
//                if (boardValue[y - 1][x] == 0) {
//                    return revealNeighboursOfZeroFields(y - 1, x);
//                }
            }
            if (y > 0 && x < (SIZE - 1)) {
                visitField(y - 1, x + 1);
//                if (boardValue[y - 1][x + 1] == 0) {
//                    return revealNeighboursOfZeroFields(y - 1, x + 1);
//                }
            }
            if (x > 0) {
                visitField(y, x - 1);
//                if (boardValue[y][x - 1] == 0) {
//                    return revealNeighboursOfZeroFields(y, x - 1);
//                }
            }
            if (x < (SIZE - 1)) {
                visitField(y, x + 1);
//                if (boardValue[y][x + 1] == 0) {
//                    return revealNeighboursOfZeroFields(y, x + 1);
//                }
            }
            if (y < (SIZE - 1) && x > 0) {
                visitField(y + 1, x - 1);
//                if (boardValue[y + 1][x - 1] == 0) {
//                    return revealNeighboursOfZeroFields(y + 1, x - 1);
//                }
            }
            if (y < (SIZE - 1)) {
                visitField(y + 1, x);
//                if (boardValue[y + 1][x] == 0) {
//                    return revealNeighboursOfZeroFields(y + 1, x);
//                }
            }
            if (y < (SIZE - 1) && x < (SIZE - 1)) {
                visitField(y + 1, x + 1);
//                if (y + 1 < (SIZE - 1) && x + 1 < (SIZE - 1) && boardValue[y + 1][x + 1] == 0) {
//                    return revealNeighboursOfZeroFields(y + 1, x + 1);
//                }
            }
        }
        return 1;
    }


    public static void setAllFieldsAsNonVisited() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                visitedField[i][j] = false;
            }
        }
        System.out.println("All fields set as visitedField[i][j] = false ");
    }

//    public static Object showBoardField(int y, int x) {
//        if (visitedField[y][x]) {
//            return boardValue[y][x];
//        } else {
//            return 'X';
//        }
//    }

    public static void visitField(int y, int x) {
//        if (visitedField[y][x]) {
//            System.out.println("You have already visited this field.");
//        }
        if (!visitedField[y][x]) {
            visitedField[y][x] = true;
            System.out.println("Field now visited: " + y + "," + x);
        }
    }

    public static void generateRandomXY() {
        Y = (int) (Math.random() * 10);
        X = (int) (Math.random() * 10);
        System.out.print(" " + Y + "," + X);
    }


}


//--------------
//    public static void generateMines() {
//        System.out.print("      ");
//        for (int i = 0; i < 9; i++) {
//            System.out.println("X");
//            for (int j = 0; j < 9; j++) {
//                System.out.print("X");
//            }
//
//        }
//    }