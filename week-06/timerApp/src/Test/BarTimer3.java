package Test;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class BarTimer3 {

    public static void mainDraw(Graphics graphics) {

        int[] colorGreen = {0, 153, 0};
        int[] colorBlue = {51, 153, 255};
        int[] colorOrange = {255, 153, 0};
        int[] colorRed = {255, 51, 51};

        shrinkingBar(graphics, colorGreen, 0, 0);

    }

    public static void shrinkingBar(Graphics graphics, int[] color, int posX, int posY) {
        graphics.setColor(new Color(color[0], color[1], color[2]));
//        double height = 1005;
//        double decrement = height / 60.0;

        double y = 0;

        graphics.fillRect(posX, posY, 480, (int) 900.0 - (int) y);
        //graphics.fillRect(posX, posY, 20, (int) (height - i * decrement));
        //shrinkingBar(graphics, color, i + 1, posX, posY);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        BarTimer3.ImagePanel panel = new BarTimer3.ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();

        //int sec = 60;

        //while (sec != 0) {
        //  sec--;
//        panel.repaint();
//        try {
//            //60 * 1000 milliseconds = 1 second
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //}

    }

    static class ImagePanel extends JPanel implements ActionListener {

        //        static double height = 1005;
//        double decrement = height / 60.0;
//        double x = 0;
        double y = 0;
        int[] colorGreen = {0, 153, 0};
        int[] colorBlue = {51, 153, 255};
        int[] colorOrange = {255, 153, 0};
        int[] colorRed = {255, 51, 51};

        Timer t = new Timer(1000, this);



        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            t.start();


            //graphics.fillRect(0, (int) 0, 480, 1005 - (int) y);
            //graphics.fillRect((int) x, (int) y, 20, 180 - (int) y);

        }

        public void actionPerformed(ActionEvent e) {
            //while (y <= height) {
            y += 1000.0 / 60.0;
            repaint();
            // }
        }
    }


}

