import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {

        double xc = 800 / 2d;
        double yc = 800 / 2d;
        double size = 800 / 3d;

        drawSquare(graphics, xc, yc, size);

    }

    public static void drawSquare(Graphics gra, double xc, double yc, double s) {

        //draws a central square
        gra.setColor(Color.BLACK);
        gra.fillRect((int) (xc), (int) (yc), (int) (s), (int) (s));

        if (s > 3) {
            s = s / 3d;
            //draws 4 squares in the gasket around the central square

            drawSquare(gra, xc + s, yc - 2d * s, s);
            drawSquare(gra, xc + 4d * s, yc + s, s);
            drawSquare(gra, xc + s, yc + 4d * s, s);
            drawSquare(gra, xc - 2d * s, yc + s, s);

            //draws 4 squares in the gasket around the central square

            drawSquare(gra, xc - 2d * s, yc - 2d * s, s);
            drawSquare(gra, xc + 4d * s, yc - 2d * s, s);
            drawSquare(gra, xc + 4d * s, yc + 4d * s, s);
            drawSquare(gra, xc - 2d * s, yc + 4d * s, s);

        } else {
            return;
        }

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
