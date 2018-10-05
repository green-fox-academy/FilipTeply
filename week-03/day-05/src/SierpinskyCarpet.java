
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {


        double xc = WIDTH / 2d;
        double yc = WIDTH / 2d;
        double size = WIDTH / 3d;


        drawSquare(graphics, xc, yc, size);


    }

    public static void drawSquare(Graphics gra, double xc, double yc, double size) {
        gra.drawRect((int)(xc), (int)(yc), (int)(size), (int)(size));

        if (size > 1) {
            size = size/3d;

            drawSquare(gra, (xc), (yc-3d*size), (size));
            drawSquare(gra, (xc-3d*size), (yc), (size));
            drawSquare(gra, (xc), (yc+3d*size),(size));
            drawSquare(gra, (xc+3d*size), (yc), (size));



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
