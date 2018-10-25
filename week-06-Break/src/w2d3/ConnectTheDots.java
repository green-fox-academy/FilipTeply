package w2d3;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] polygon1 = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] polygon2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};


        graphics.drawPolygon(getArrOfXCoord(polygon1), getArrOfYCoord(polygon1), polygon1.length);
        graphics.drawPolygon(getArrOfXCoord(polygon2), getArrOfYCoord(polygon2), polygon2.length);

    }

    public static int[] getArrOfXCoord(int[][] polygonXY) {
        int[] arrX = new int[polygonXY.length];
        for (int i = 0; i < polygonXY.length; i++) {
            arrX[i] = polygonXY[i][0];
        }
        return arrX;
    }

    public static int[] getArrOfYCoord(int[][] polygonXY) {
        int[] arrY = new int[polygonXY.length];
        for (int i = 0; i < polygonXY.length; i++) {
            arrY[i] = polygonXY[i][1];
        }
        return arrY;
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}