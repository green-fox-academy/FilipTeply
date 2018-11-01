import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    static double ANGLE = 137.5;

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

    public static void mainDraw(Graphics graphics) {

        drawShape(WIDTH/4, HEIGHT/4, 400, 1, graphics);
        drawShape(3*WIDTH/4, HEIGHT/4, 400, 1, graphics);
        drawShape(WIDTH/4, 3*HEIGHT/4, 400, 1, graphics);
        drawShape(3*WIDTH/4, 3*HEIGHT/4, 400, 1, graphics);

    }

    public static Color randomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }

    public static int calculateWidth(int i, int n) {
        return 10 + (int)(20*(double)i/n);
    }

    public static void drawShape(int x, int y, int n, int i, Graphics graphics) {
        graphics.setColor(new Color((int)((double)i/n*255), 255 - (int)((double)i/n*255), 0));
        drawDot(x, y, calculateWidth(i, n), graphics);
        if (n > i) {
            double angle = i * ANGLE;
            double r = 7 * Math.sqrt(i);

            x += (r * Math.cos(angle));
            y += (r * Math.sin(angle));
            drawShape(x, y, n, i+1, graphics);
        }
    }

    public static void drawDot(int x, int y, int width, Graphics graphics) {
        graphics.fillOval(x, y, width, width);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
        boolean goingUp = true;
        while (true) {
            if (goingUp) {
                if (ANGLE > 137.7) {
                    goingUp = false;
                }
                ANGLE += 0.001;
            } else {
                if (ANGLE < 137.3) {
                    goingUp = true;
                }
                ANGLE -= 0.001;
            }
            panel.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}