
import sun.java2d.loops.FillRect;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class BarTimer2 {


    public static void mainDraw(Graphics graphics) {


        //graphics.fillRect(0, 0, 480, 1005);

        // shrinkingBar(graphics, colorGreen, 0, 0, 0);
//        shrinkingBar(graphics, colorBlue, 0, 480, 0);
//        shrinkingBar(graphics, colorOrange, 0, 960, 0);
//        shrinkingBar(graphics, colorRed, 0, 1440, 0);


//        for (int i = 0; i < 60; i++) {
//            graphics.fillRect(20, 20, 30, i * 3);
//        }

        // shrinkingBar(graphics, colorGreen, 0, 0, 0);

    }

    public static void shrinkingBar(Graphics graphics, int[] color, int i, int posX, int posY) {
        graphics.setColor(new Color(color[0], color[1], color[2]));
        double height = 900;
        double decrement = height / 60.0;
        i++;
        if (i >= 60) {
            return;
        } else {
            graphics.fillRect(posX, posY, 480, (int) (height - i * decrement));
            shrinkingBar(graphics, color, i + 1, posX, posY);
        }

    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {


        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        BarTimer2.ImagePanel panel = new BarTimer2.ImagePanel();
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


        Timer t = new Timer(100, this);
        double x = 0;
        double y1 = 0;
        double y2 = 0;
        double y3 = 0;
        double y4 = 0;

        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            t.start();

            int[] colorGreen = {0, 153, 0};
            int[] colorBlue = {51, 153, 255};
            int[] colorOrange = {255, 153, 0};
            int[] colorRed = {255, 51, 51};

            graphics.setColor(new Color(colorGreen[0], colorGreen[1], colorGreen[2]));
            graphics.fillRect((int) x, (int) y1, 480, (int) (1005.0 - y1));

            graphics.setColor(new Color(colorBlue[0], colorBlue[1], colorBlue[2]));
            graphics.fillRect((int) x + 480, (int) (-1005+y2), 480, (int) (2010.0 - y2));

            graphics.setColor(new Color(colorOrange[0], colorOrange[1], colorOrange[2]));
            graphics.fillRect((int) x + 960, (int) (-2010+y3), 480, (int) (3015.0 - y3));

            graphics.setColor(new Color(colorRed[0], colorRed[1], colorRed[2]));
            graphics.fillRect((int) x + 1440, (int)(-3015 + y4), 480, (int) (4020.0 - y4));

        }

        public void actionPerformed(ActionEvent e) {
            y1 += 1005.0 / 600.0;
            y2 += 1005.0 / 600.0;
            y3 += 1005.0 / 600.0;
            y4 += 1005.0 / 600.0;
            repaint();
        }
    }


}

