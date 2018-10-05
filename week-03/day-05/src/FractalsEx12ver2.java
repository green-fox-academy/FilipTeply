
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsEx12ver2 {
    public static void mainDraw(Graphics graphics) {


        double inisize = (double) WIDTH;
        double[] coor = new double[2];
        coor[0] = inisize/ 2d;
        coor[1] = inisize / 2d;

//        graphics.setColor(Color.orange);

//        graphics.setColor(Color.BLUE);
//        graphics.drawLine(100, 100, 200, 200);

//        int x = WIDTH;
////        int y = WIDTH;

        drawHash(graphics, coor, inisize);
        //repeatHashes(graphics, );

//        int increment = 70;
//        int increment2 = 10;
//
//        paraboleBottomLeft(graphics, increment);
//        paraboleTopRight(graphics, increment2);
//    }
//
//    public static void paraboleBottomLeft(Graphics gra, int increment) {
//
//        for (int i = 0; i < (320 / increment); i++) {
//            gra.setColor(new Color(27, 0, 220));
//            gra.drawLine(0, i * increment, i * increment, 320);
//        }
//    }
//
//    public static void paraboleTopRight(Graphics gra, int increment) {
//
//        for (int i = 0; i < (320 / increment); i++) {
//            gra.setColor(new Color(255, 0, 0));
//            gra.drawLine(i * increment, 0, 320, i * increment);
//        }

//


    }

    //   public static void recursiveFourLinesHash(Graphics gra){
//
//            if () {
//                break;
//            } else {
//                gra.drawLine(x / 3, );
//            }
//
//        }

//    public static void repeatHashes(Graphics gra) {
//
//        if (){}
//
//        else {
//            drawHash(gra, xin, yin, s);
//        }
//
//    }




             public static double[] drawHash(Graphics gra, double[] coor, double s) {

//        double inisize = (double) WIDTH;
//        double xin = inisize / 2d;
//        double yin = inisize / 2d;


        gra.drawLine((int) (coor[0] - s / 6d), (int) (coor[1] - s / 2d), (int) (coor[0] - s / 6d), (int) (coor[1] + s / 2d));
        gra.drawLine((int) (coor[0] + s / 6d), (int) (coor[1] - s / 2d), (int) (coor[0] + s / 6d), (int) (coor[1] + s / 2d));
        gra.drawLine((int) (coor[0] - s / 2d), (int) (coor[1] - s / 6d), (int) (coor[0] + s / 2d), (int) (coor[1] - s / 6d));
        gra.drawLine((int) (coor[0] - s / 2d), (int) (coor[1] + s / 6d), (int) (coor[0] + s / 2d), (int) (coor[1] + s / 6d));
        return coor;
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