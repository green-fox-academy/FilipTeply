//package cognitive_aprenticeship;
//
//public class Board {
//
////    public static final int SIZE = 10;
////    public static final int NUMBEROfMINES = 10;
////
////
////    public static int X = 6;
////    public static int Y = 6;
////
////    public static int[][] boardValue = new int[SIZE][SIZE];
////    //mine -> 9
////    //number of neighbouring fields containing mines -> 0 - 8
////
////    public static boolean[][] visitedField = new boolean[SIZE][SIZE];
////    //show X for !visited and boardValue for visited
//
////
////    public Board() {
////        generateMinesInBoard();
////        //generateMinesNeighbourCounts();
////        //setAllFieldsAsNonVisited();
////
////    }
//
////    public void generateMinesInBoard() {
////        int count0 = 0;
////        int mineCount = 0;
////        //mine presence encoded as int[i][j]=9
////
////        for (int i = 0; i < SIZE; i++) {
////            for (int j = 0; j < SIZE; j++) {
////                boardValue[i][j] = 0;
////                count0++;
////                System.out.print(" 0:" + count0);
////            }
////        }
////        System.out.println();
////
////        while (mineCount < NUMBEROfMINES) {
////            generateRandomXY();
////            boardValue[X][Y] = 9;
////            mineCount++;
////            System.out.print(" M:" + mineCount);
////        }
////        System.out.println();
////    }
////
////
////    public void generateMinesNeighbourCounts() {
////    }
////
////    public void setAllFieldsAsNonVisited() {
////        for (int i = 0; i < SIZE; i++) {
////            for (int j = 0; j < SIZE; j++) {
////                visitedField[i][j] = false;
////            }
////        }
////    }
////
////    public static Object showBoardField(int x, int y) {
////        for (int i = 0; i < SIZE; i++) {
////            for (int j = 0; j < SIZE; j++) {
////                if (x == i && y == j && visitedField[x][y]) {
////                    return boardValue[x][y];
////                }
////            }
////        }
////        return 'X';
////    }
////
////    public void visitField(int x, int y) {
////        if (visitedField[x][y]) {
////            System.out.println("You have already visited this field.");
////        } else if (!visitedField[x][y]) {
////            visitedField[x][y] = true;
////        }
////    }
////
////    public static void generateRandomXY() {
////        X = (int) Math.random() * 11;
////        Y = (int) Math.random() * 11;
////    }
//
//
//}
//
//
//
