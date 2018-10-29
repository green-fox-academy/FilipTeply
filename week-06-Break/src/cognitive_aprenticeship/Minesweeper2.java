package cognitive_aprenticeship;

public class Minesweeper2 {

    int[][] hraciPlocha = new int[10][10];
    int[][] odhalenaPlocha = new int[10][10];

    public void okryj(int x, int y) {
        if (hraciPlocha[x][y] == 9) {
        } else {
            reveal(x, y);
        }
    }
    public void reveal(int x, int y) {
        if (x > 0 && x < 10 && y > 0 && y < 10 && hraciPlocha[x][y] == 0) {
            odhalenaPlocha[x][y] = 0;
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    reveal(x + i, y + j);
                }
            }
        } else {
            return; // odkryvame neexistujici policko
        }
    }
}


