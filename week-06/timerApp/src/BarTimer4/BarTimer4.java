package BarTimer4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class BarTimer4 {

    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("BarTimer4");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel implements ActionListener {

        double x = 0;
        double y = 0;
        double offsetX = 480.0;
        double width = offsetX;
        double height = 1005.0;

        Timer t = new Timer(100, this);

        protected void paintComponent(Graphics graphics) {

            super.paintComponent(graphics);
            t.start();

            int[] colorGreen = {0, 153, 0};

            graphics.setColor(new Color(colorGreen[0], colorGreen[1], colorGreen[2]));

            graphics.fillRect((int) x, (int) y, (int) width, (int) (height - y));

            int[] colorBlue = {51, 153, 255};

            graphics.setColor(new Color(colorBlue[0], colorBlue[1], colorBlue[2]));

            graphics.fillRect((int) (x + offsetX), (int) (-height + y), (int) width, (int) (2 * height - y));

            int[] colorOrange = {255, 153, 0};

            graphics.setColor(new Color(colorOrange[0], colorOrange[1], colorOrange[2]));
            graphics.fillRect((int) (x + offsetX * 2), (int) (-2 * height + y), (int) width, (int) (3 * height - y));

            int[] colorRed = {255, 51, 51};

            graphics.setColor(new Color(colorRed[0], colorRed[1], colorRed[2]));
            graphics.fillRect((int) (x + offsetX * 3), (int) (-3 * height + y), (int) width, (int) (4 * height - y));
        }

        public void actionPerformed(ActionEvent e) {
            y += height / (60000. / 100.);
            this.repaint();
        }
    }
}


