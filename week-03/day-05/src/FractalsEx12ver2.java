
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsEx12ver2 {
    public static void mainDraw(Graphics graphics) {


        double inisize = (double) WIDTH;
        double[] coor = new double[3];
        coor[0] = inisize / 2d;
        coor[1] = inisize / 2d;
        coor[2] = inisize;

//        graphics.setColor(Color.orange);

//        graphics.setColor(Color.BLUE);
//        graphics.drawLine(100, 100, 200, 200);

//        int x = WIDTH;
////        int y = WIDTH;

        drawHash(graphics, coor);

        drawSingleHash(graphics, coor);
    }

    public static void drawHash(Graphics gra, double[] coor) {
        drawSingleHash(gra, coor);

        if (coor[2] >= 5) {
            double[] coor1 = new double[3];
            coor1[2] = coor[2] / 3d;
            coor1[0] = coor[0];
            coor1[1] = coor[1] - coor[2];
            drawSingleHash(gra, coor1);
            drawHash(gra, coor1);

//            inisize = (double) WIDTH;
//            coor[2] = inisize;
//            coor[0] = inisize / 2d;
//            coor[1] = inisize / 2d;


            double[] coor2 = new double[3];
            coor2[2] = coor[2] / 3d;
            coor2[0] = coor[0];
            coor2[1] = coor[1] + coor[2];
            drawSingleHash(gra, coor2);
            drawHash(gra, coor2);

//            inisize = (double) WIDTH;
//            coor[0] = inisize / 2d;
//            coor[1] = inisize / 2d;
//            coor[2] = inisize;

            double[] coor3 = new double[3];
            coor3[2] = coor[2] / 3d;
            coor3[0] = coor[0] - coor[2];
            coor3[1] = coor[1];
            drawSingleHash(gra, coor3);
            drawHash(gra, coor3);

//            inisize = (double) WIDTH;
//            coor[0] = inisize / 2d;
//            coor[1] = inisize / 2d;
//            coor[2] = inisize;

            double[] coor4 = new double[3];
            coor4[2] = coor[2] / 3d;
            coor4[0] = coor[0] + coor[2];
            coor4[1] = coor[1];
            drawSingleHash(gra, coor4);
            drawHash(gra, coor4);

//            inisize = (double) WIDTH;
//            coor[0] = inisize / 2d;
//            coor[1] = inisize / 2d;
//            coor[2] = inisize;

        } else if (coor[2] >= 5) {
            return;
        } else {
            return;
        }
    }

    public static void drawSingleHash(Graphics gra, double[] coor) {

//        double inisize = (double) WIDTH;
//        double xin = inisize / 2d;
//        double yin = inisize / 2d;


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






//    public static void drawSingleHash(Graphics gra, double[] coor) {
//
////        double inisize = (double) WIDTH;
////        double xin = inisize / 2d;
////        double yin = inisize / 2d;
//
//
//        gra.drawLine((int) (coor[0] - coor[2] / 6d), (int) (coor[1] - coor[2] / 2d), (int) (coor[0] - coor[2] / 6d), (int) (coor[1] + coor[2] / 2d));
//        gra.drawLine((int) (coor[0] + coor[2] / 6d), (int) (coor[1] - coor[2] / 2d), (int) (coor[0] + coor[2] / 6d), (int) (coor[1] + coor[2] / 2d));
//        gra.drawLine((int) (coor[0] - coor[2] / 2d), (int) (coor[1] - coor[2] / 6d), (int) (coor[0] + coor[2] / 2d), (int) (coor[1] - coor[2] / 6d));
//        gra.drawLine((int) (coor[0] - coor[2] / 2d), (int) (coor[1] + coor[2] / 6d), (int) (coor[0] + coor[2] / 2d), (int) (coor[1] + coor[2] / 6d));
//
//    }


//    public static double[] drawHash(Graphics gra, double[] coor) {
//
//        if (coor[2] == 5) {
//            return null;
//        } else if (coor[2] >= 5) {
//            coor[2] = coor[2] / 3d;
//            coor[0] = coor[0];
//            coor[1] = coor[1] - coor[2];
//            drawSingleHash(gra, coor);
//            return drawHash(gra, coor);
//        } else if (coor[2] >= 5) {
//            coor[2] = coor[2] / 3d;
//            coor[0] = coor[0];
//            coor[1] = coor[1] + coor[2];
//            drawSingleHash(gra, coor);
//            return drawHash(gra, coor);
//        } else if (coor[2] >= 5) {
//            coor[2] = coor[2] / 3d;
//            coor[0] = coor[0] - coor[2];
//            coor[1] = coor[1];
//            drawSingleHash(gra, coor);
//            return drawHash(gra, coor);
//        } else {
//            coor[2] = coor[2] / 3d;
//            coor[0] = coor[0] + coor[2];
//            coor[1] = coor[1];
//            drawSingleHash(gra, coor);
//            drawHash(gra, coor);
//        }


//    public static double[] repeatFourHashes(Graphics gra, double[] coor) {
//
//
//        if (coor[2] == 5) {
//            return null;
//        } else {
//            coor[0] = coor[0];
//            coor[1] = coor[1] - coor[2] / 6d;
//            drawHash(gra, coor);
//
//
//            coor[1] = coor[2] / 2d + coor[2] * 2d / 6d;
//            drawHash(gra, coor);
//
//
//            coor[0] = coor[0] - coor[2] / 6d;
//            coor[1] = coor[1] + coor[2] / 6d;
//            drawHash(gra, coor);
//
//            coor[0] = coor[0] + coor[2] * 2d/ 6d;
//            coor[1] = coor[1];
//            drawHash(gra, coor);
//
//            coor[2] = coor[2] / 3d;
//            return repeatFourHashes(gra, coor);
//        }
//
//    }
//
//

////        repeatFourHashes(graphics, coor);
//
////        int increment = 70;
////        int increment2 = 10;
////
////        paraboleBottomLeft(graphics, increment);
////        paraboleTopRight(graphics, increment2);
////    }
////
////    public static void paraboleBottomLeft(Graphics gra, int increment) {
////
////        for (int i = 0; i < (320 / increment); i++) {
////            gra.setColor(new Color(27, 0, 220));
////            gra.drawLine(0, i * increment, i * increment, 320);
////        }
////    }
////
////    public static void paraboleTopRight(Graphics gra, int increment) {
////
////        for (int i = 0; i < (320 / increment); i++) {
////            gra.setColor(new Color(255, 0, 0));
////            gra.drawLine(i * increment, 0, 320, i * increment);
////        }
//
////
//
//
//    }
//
////   public static void recursiveFourLinesHash(Graphics gra){
////
////            if () {
////                break;
////            } else {
////                gra.drawLine(x / 3, );
////            }
////
////        }
//
//
////    public static double[] repeatFourHashes(Graphics gra, double[] coor) {
////
////
////        if (coor[2] == 5) {
////            return null;
////        } else {
////            coor[0] = coor[0];
////            coor[1] = coor[1] - coor[2] / 6d;
////            drawHash(gra, coor);
////
////
////            coor[1] = coor[2] / 2d + coor[2] * 2d / 6d;
////            drawHash(gra, coor);
////
////
////            coor[0] = coor[0] - coor[2] / 6d;
////            coor[1] = coor[1] + coor[2] / 6d;
////            drawHash(gra, coor);
////
////            coor[0] = coor[0] + coor[2] * 2d/ 6d;
////            coor[1] = coor[1];
////            drawHash(gra, coor);
////
////            coor[2] = coor[2] / 3d;
////            return repeatFourHashes(gra, coor);
////        }
////
////