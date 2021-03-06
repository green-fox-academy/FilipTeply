import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3dver2 {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

        drawSteps(graphics, 2);

    }

    public static void drawSteps(Graphics gra, int size) {
        int sumOfi = 0;
        for (int i = 0; i < 50; i++) {

            gra.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            gra.fillRect(sumOfi*size, sumOfi*size, i*size, i*size);
            gra.setColor(Color.BLACK);
            gra.drawRect(sumOfi*size, sumOfi*size, i*size, i*size);
            sumOfi+=i;
        }

    }




//    public static void drawSteps(Graphics gra, int size) {
//
//        for (int i = 0; i < 50; i++) {
//
//            gra.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
//            gra.fillRect(i * 2 * size, i * 2 * size, i * (2i) * size, i * 2 * size);
//            gra.setColor(Color.BLACK);
//            gra.drawRect(i * 2 * size, i * 2 * size, i * 2 * size, i * 2 * size);
//        }
//    }


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
