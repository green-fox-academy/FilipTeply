import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsStars {
    public static void mainDraw(Graphics graphics) {

        double inisize = (double) (WIDTH);
        double[] coor = new double[3];
        coor[0] = inisize / 2d;
        coor[1] = inisize / 2d;
        coor[2] =  inisize;

        drawHash(graphics, coor);

        drawSingleHash(graphics, coor);
    }

    public static void drawHash(Graphics gra, double[] coor) {

        if (coor[2] >= 5) {
            double[] coor1 = new double[3];

            coor1[0] = coor[0];
            coor1[1] = coor[1] - coor[2];
            coor1[2] = coor[2] / 3d;
            drawSingleHash(gra, coor1);
            drawHash(gra, coor1);

            double[] coor2 = new double[3];

            coor2[0] = coor[0];
            coor2[1] = coor[1] + coor[2];
            coor2[2] = coor[2] / 3d;
            drawSingleHash(gra, coor2);
            drawHash(gra, coor2);

            double[] coor3 = new double[3];

            coor3[0] = coor[0] - coor[2];
            coor3[1] = coor[1];
            coor3[2] = coor[2] / 3d;
            drawSingleHash(gra, coor3);
            drawHash(gra, coor3);

            double[] coor4 = new double[3];

            coor4[0] = coor[0] + coor[2];
            coor4[1] = coor[1];
            coor4[2] = coor[2] / 3d;
            drawSingleHash(gra, coor4);
            drawHash(gra, coor4);

        } else if (coor[2] >= 5) {
            return;
        } else {
            return;
        }
    }

    public static void drawSingleHash(Graphics gra, double[] coor) {

        gra.drawLine((int) (coor[0] - coor[2] / 6d), (int) (coor[1] - coor[2] / 2d), (int) (coor[0] - coor[2] / 6d), (int) (coor[1] + coor[2] / 2d));
        gra.drawLine((int) (coor[0] + coor[2] / 6d), (int) (coor[1] - coor[2] / 2d), (int) (coor[0] + coor[2] / 6d), (int) (coor[1] + coor[2] / 2d));
        gra.drawLine((int) (coor[0] - coor[2] / 2d), (int) (coor[1] - coor[2] / 6d), (int) (coor[0] + coor[2] / 2d), (int) (coor[1] - coor[2] / 6d));
        gra.drawLine((int) (coor[0] - coor[2] / 2d), (int) (coor[1] + coor[2] / 6d), (int) (coor[0] + coor[2] / 2d), (int) (coor[1] + coor[2] / 6d));

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}


