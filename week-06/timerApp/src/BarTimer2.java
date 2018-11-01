
import sun.java2d.loops.FillRect;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class BarTimer2 {


    public static void mainDraw(Graphics graphics) {


        int[] colorGreen = {0, 153, 0};
        int[] colorBlue = {51, 153, 255};
        int[] colorOrange = {255, 153, 0};
        int[] colorRed = {255, 51, 51};

        //graphics.fillRect(0, 0, 480, 1005);

        // shrinkingBar(graphics, colorGreen, 0, 0, 0);
//        shrinkingBar(graphics, colorBlue, 0, 480, 0);
//        shrinkingBar(graphics, colorOrange, 0, 960, 0);
//        shrinkingBar(graphics, colorRed, 0, 1440, 0);


//        for (int i = 0; i < 60; i++) {
//            graphics.fillRect(20, 20, 30, i * 3);
//        }

        shrinkingBar(graphics, colorGreen, 0, 20, 20);

    }

    public static void shrinkingBar(Graphics graphics, int[] color, int i, int posX, int posY) {
        graphics.setColor(new Color(color[0], color[1], color[2]));
        double height = 180;
        double decrement = height / 60.0;
        i++;
        if (i >= 60) {
            return;
        } else {
            graphics.fillRect(posX, posY, 20, (int) (height - i * decrement));
            shrinkingBar(graphics, color, i + 1, posX, posY);
        }

    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {

        //second s = new second();

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
        panel.repaint();
        try {
            //60 * 1000 milliseconds = 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //}

    }

    static class ImagePanel extends JPanel implements ActionListener {

        Timer t = new Timer(1000, this);
        double x = 0, y = 0, velY = 2;


        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            t.start();
           graphics.fillRect((int) x, (int)y, 20, 180-(int)y);
        }

        public void actionPerformed(ActionEvent e){
            y+=velY;
            repaint();
        }
    }


}

