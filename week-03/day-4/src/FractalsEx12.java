import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalsEx12 {
    public static void mainDraw(Graphics graphics) {

//        graphics.setColor(Color.BLUE);
//        graphics.drawLine(100, 100, 200, 200);

        int x= WIDTH;
        int y = WIDTH;

        drawHash(graphics, x, y);

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

    public static void drawHash(Graphics gra,int x, int y) {

        gra.drawLine((int)(x/3.), 0, (int)(x/3.), y+x);
        gra.drawLine((int) (x*2./3), 0, (int) (x*2./3), y+x);
        gra.drawLine((int) (x/3.), 0, (int) (x*2./3), y+x);
//        gra.drawLine(0, (int) (y*2./3), x, (int) (y*2./3));

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