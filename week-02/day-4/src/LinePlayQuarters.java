
//
//    Line play quarters
//        1 XP Divide the canvas into 4/16/64 equal parts and repeat the line play pattern in each quarter

import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int compartments = 4; //Number of square compartments per page
        int increment = 2;
        int increment2 = 2;

        paraboleBottomLeft(graphics, increment, compartments);
        paraboleTopRight(graphics, increment2, compartments);
    }

    public static void paraboleBottomLeft(Graphics gra, int increment, int compartments) {

        int compSize = 320/compartments/2;


        for (int j = 0; j <(320 / compSize); j++) {
            for (int i = 0; i < (compSize / increment); i++) {
                gra.setColor(new Color(27, 255, 20));
                gra.drawLine(j*compSize, (j*compSize) + i * increment, (j*compSize)+i * increment, (j+1)*compSize);
            }
        }
    }

    public static void paraboleTopRight(Graphics gra, int increment, int compartments) {
        int compSize = 320/compartments/2;

        for (int i = 0; i < (compSize / increment); i++) {
            gra.setColor(new Color(255, 0, 0));
            gra.drawLine(i * increment, 0, compSize, i * increment);
        }
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