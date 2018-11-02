//import javax.swing.*;
//
//import java.awt.*;
//
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//public class BarTimer {
//
//
//    static int sec = 60;
//
//    // Don't touch the code below
//    static int WIDTH = 320;
//    static int HEIGHT = 343;
//
//
//    public static void mainDraw(Graphics graphics) {
//
//
//        int[] colorGreen = {0, 153, 0};
//        int[] colorBlue = {51, 153, 255};
//        int[] colorOrange = {255, 153, 0};
//        int[] colorRed = {255, 51, 51};
//
//        //graphics.fillRect(0, 0, 480, (int) (height - i * decrement));
//
//        shrinkingBar(graphics, colorGreen, 0, 0, 0);
////        shrinkingBar(graphics, colorBlue, 0, 480, 0);
////        shrinkingBar(graphics, colorOrange, 0, 960, 0);
////        shrinkingBar(graphics, colorRed, 0, 1440, 0);
//
//
//    }
//
//    public static void shrinkingBar(Graphics graphics, int[] color, int i, int posX, int posY) {
//        graphics.setColor(new Color(color[0], color[1], color[2]));
//        double height = 1005;
//        double decrement = height / 60.0;
//        graphics.fillRect(posX, posY, 480, (int) (height - i * decrement));
//        if (i >= 60) {
//            return;
//        } else {
//            shrinkingBar(graphics, color, i + 1, posX, posY);
//        }
//
//    }
//
//
////    public static void drawBar(Graphics graphics, int[] color, int posX, int posY) {
////
////        drawBar(graphics, color, posX, posY-i*decrement);
////
////    }
//
//
////    public static void drawSteps(Graphics gra, int size) {
////        int sumOfi = 0;
////        for (int i = 0; i < 50; i++) {
////
////            gra.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
////            gra.fillRect(sumOfi * size, sumOfi * size, i * size, i * size);
////            gra.setColor(Color.BLACK);
////            gra.drawRect(sumOfi * size, sumOfi * size, i * size, i * size);
////            sumOfi += i;
////        }
////
////    }
//
//
//    public static void main(String[] args) {
//
//        JFrame jFrame = new JFrame("Drawing2");
//        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        Main.ImagePanel panel = new Main.ImagePanel();
//        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        jFrame.add(panel);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.setVisible(true);
//        jFrame.pack();
//
//        while (sec != 0) {
//            sec--;
//            panel.repaint();
//            try {
//                //60 * 1000 milliseconds = 1 second
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    static class ImagePanel extends JPanel {
//        @Override
//        protected void paintComponent(Graphics graphics) {
//            super.paintComponent(graphics);
//            mainDraw(graphics);
//        }
//    }
//}