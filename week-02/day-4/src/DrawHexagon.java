

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawHexagon {
    public static void mainDraw(Graphics graphics) {


        double s = 60.0;
        // s = side length of a hexagon
        //offsets x and y of the TOP hexagon (left vertex)
        double ofsx = 700.0;
        double ofsy = 100.0;

        int columnMaxHeight = 7;
// the longest vertical column of a hexagon drawn (having columnMaxHeight hexagons, 0th column)
        int columnHeight = columnMaxHeight;
        //columnHeight will be the actual number of hexagons in a column in the for loops


//loop1 drawing 0th, 2nd column
        for (int j = 0; j < (columnMaxHeight / 2 - 1); j++) {

            for (int i = 0; i < columnHeight - j; i++) {

                double y1 = 2 * Math.sqrt(3.0 / 4) * s;
                double x1 = 3 * s;
                int xpoints[] = {(int) (ofsx - j * x1), (int) (ofsx + s / 2 - j * x1), (int) (ofsx + s * 3.0 / 2 - j * x1), (int) (ofsx + 2 * s - j * x1), (int) (ofsx + s * 3.0 / 2 - j * x1), (int) (ofsx + s / 2 - j * x1), (int) (ofsx - j * x1)};
                int ypoints[] = {(int) (ofsy + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1)};
                int npoints = 6;
                graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
                graphics.fillPolygon(xpoints, ypoints, npoints);
            }
            columnHeight--;
        }

//loop2 drawing 0th and -2nd column
        columnHeight = columnMaxHeight;
        for (int j = 0; j < (columnMaxHeight / 2 - 1); j++) {

            for (int i = 0; i < columnHeight - j; i++) {

                double y1 = 2 * Math.sqrt(3.0 / 4) * s;
                double x1 = 3 * s;
                int xpoints[] = {(int) (ofsx + j * x1), (int) (ofsx + s / 2 + j * x1), (int) (ofsx + s * 3.0 / 2 + j * x1), (int) (ofsx + 2 * s + j * x1), (int) (ofsx + s * 3.0 / 2 + j * x1), (int) (ofsx + s / 2 + j * x1), (int) (ofsx + j * x1)};
                int ypoints[] = {(int) (ofsy + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1)};
                int npoints = 6;
                graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
                graphics.fillPolygon(xpoints, ypoints, npoints);
            }
            columnHeight--;
        }

        //loop3 drawing 1st, 3rd column
        columnHeight = columnMaxHeight - 1;
        ofsx = ofsx + 3.0 / 2 * s;
        ofsy = ofsy + Math.sqrt(3.0 / 4) * s;

        for (int j = 0; j < (columnMaxHeight / 2 - 1); j++) {

            double y1 = 2 * Math.sqrt(3.0 / 4) * s;
            double x1 = 3 * s;
            for (int i = 0; i < columnHeight - j; i++) {

                int xpoints[] = {(int) (ofsx + j * x1), (int) (ofsx + s / 2 + j * x1), (int) (ofsx + s * 3.0 / 2 + j * x1), (int) (ofsx + 2 * s + j * x1), (int) (ofsx + s * 3.0 / 2 + j * x1), (int) (ofsx + s / 2 + j * x1), (int) (ofsx + j * x1)};
                int ypoints[] = {(int) (ofsy + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1)};
                int npoints = 6;
                graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
                graphics.fillPolygon(xpoints, ypoints, npoints);
            }
            columnHeight--;
        }
        ///loop4 drawing -1st, -3rd column
        columnHeight = columnMaxHeight - 1;

        ofsx = ofsx - 3.0 * s;

        for (int j = 0; j < (columnMaxHeight / 2 - 1); j++) {

            for (int i = 0; i < columnHeight - j; i++) {

                double y1 = (2 * Math.sqrt(3.0 / 4) * s);
                double x1 = 3 * s;
                int xpoints[] = {(int) (ofsx - j * x1), (int) (ofsx + s / 2 - j * x1), (int) (ofsx + s * 3.0 / 2 - j * x1), (int) (ofsx + 2 * s - j * x1), (int) (ofsx + s * 3.0 / 2 - j * x1), (int) (ofsx + s / 2 - j * x1), (int) (ofsx - j * x1)};
                int ypoints[] = {(int) (ofsy + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy - Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + Math.sqrt(3.0 / 4) * s + i * y1 + j * y1), (int) (ofsy + i * y1 + j * y1)};
                int npoints = 6;
                graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
                graphics.fillPolygon(xpoints, ypoints, npoints);
            }
            columnHeight--;
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