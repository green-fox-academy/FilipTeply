//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//public class BarTimer4 {
//
//    static int sec = 60;
//    // Don't touch the code below
//    static int WIDTH = 320;
//    static int HEIGHT = 343;
//
//    public static void main(String[] args) {
//        JFrame jFrame = new JFrame("BarTimer4");
//        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        ImagePanel panel = new ImagePanel();
//        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        jFrame.add(panel);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.setVisible(true);
//        jFrame.pack();
//
//
//    }
//
//    static class ImagePanel extends JPanel implements ActionListener {
//
//        Timer t = new Timer(100, this);
//        double x = 0;
//        double y = 0;
//
//
//        protected void paintComponent(Graphics graphics) {
//            super.paintComponent(graphics);
//
//            t.start();
//
//            int[] colorGreen = {0, 153, 0};
//            int[] colorBlue = {51, 153, 255};
//            int[] colorOrange = {255, 153, 0};
//            int[] colorRed = {255, 51, 51};
//
//
//
//
//            graphics.setColor(new Color(colorGreen[0], colorGreen[1], colorGreen[2]));
//            graphics.fillRect((int) x, (int) y, 480, (int) (1005.0 - y));
//
//            graphics.setColor(new Color(colorBlue[0], colorBlue[1], colorBlue[2]));
//            graphics.fillRect((int) x + 480, (int) (-1005 + y), 480, (int) (2010.0 - y));
//
//            graphics.setColor(new Color(colorOrange[0], colorOrange[1], colorOrange[2]));
//            graphics.fillRect((int) x + 960, (int) (-2010 + y), 480, (int) (3015.0 - y));
//
//            graphics.setColor(new Color(colorRed[0], colorRed[1], colorRed[2]));
//            graphics.fillRect((int) x + 1440, (int) (-3015 + y), 480, (int) (4020.0 - y));
//        }
//
//        public void actionPerformed(ActionEvent e) {
//            y += 1005.0 / 600.0;
//            this.repaint();
//        }
//    }
//
//
//}
//
//
