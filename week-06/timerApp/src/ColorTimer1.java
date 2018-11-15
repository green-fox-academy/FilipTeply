//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//
//
//public class ColorTimer1 {
//
//    static int WIDTH = 320;
//    static int HEIGHT = 343;
//
//    private static final float HUE_MIN = 4f/6;
//    private static final float HUE_MAX = 5f/6;
//
//    public static void main(String[] args) {
//        JFrame jFrame = new JFrame("ColorTimer1");
//        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        ColorTimer1.ImagePanel panel = new ColorTimer1.ImagePanel();
//        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        jFrame.add(panel);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.setVisible(true);
//        jFrame.pack();
//    }
//
//    static class ImagePanel extends JPanel implements ActionListener {
//
//        double x = 0;
//        double y = 0;
//        double offsetX = 480.0;
//        double width = offsetX;
//        double height = 1005.0;
//
//        public final static int SIXTY_SECONDs = 60000;
//
//        Timer timer1 = new Timer(100, this);
//
//
//
//
//        protected void paintComponent(Graphics graphics) {
//
//            super.paintComponent(graphics);
//
//
//
//
//            graphics.setColor(new Color(colorGreen[0], colorGreen[1], colorGreen[2]));
//
//            linear-gradient(to right, #6be585, #dd3e54)
//
//            int[] colorGreen = {0, 153, 0};
//
//
//
//
//            if (height - y <= 0) {
//                graphics.fillRect((int) x, (int) y, (int) width, (int) (height - y));
//            }
//            else
//
//                timer2.setInitialDelay(SIXTY_SECONDs);
//            timer2.start();
//
//            int[] colorBlue = {51, 153, 255};
//
//            graphics.setColor(new Color(colorBlue[0], colorBlue[1], colorBlue[2]));
//
//            graphics.fillRect((int) (x + offsetX), (int) y, (int) width, (int) (height - y));
//            if (height - y <= 0) {
//                timer2.stop();
//            }
//
//            timer3.setInitialDelay(2*SIXTY_SECONDs);
//            timer3.start();
//
//            int[] colorOrange = {255, 153, 0};
//
//            graphics.setColor(new Color(colorOrange[0], colorOrange[1], colorOrange[2]));
//            graphics.fillRect((int) (x + offsetX * 2), (int) y, (int) width, (int) (height - y));
//
//            timer4.setInitialDelay(3*SIXTY_SECONDs);
//            timer4.start();
//
//            int[] colorRed = {255, 51, 51};
//
//            graphics.setColor(new Color(colorRed[0], colorRed[1], colorRed[2]));
//            graphics.fillRect((int) (x + offsetX * 3), (int) y, (int) width, (int) (height - y));
//        }
//
//        public void actionPerformed(ActionEvent e) {
//
//
//                hue += delta;
//                if (hue > HUE_MAX) {
//                    hue = HUE_MAX;
//                    delta = -delta;
//                }
//                if (hue < HUE_MIN) {
//                    hue = HUE_MIN;
//                    delta = -delta;
//                }
//                color1 = Color.getHSBColor(hue, 1, 1);
//                color2 = Color.getHSBColor(hue, 3f/4 + delta, 3f/4 + delta);
//                repaint();
//            }
//
//
//        }
//    }
//}