import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {

        double xc = 800 / 2d;
        double yc = 800 / 2d;
        double size = 800 / 3d;

        drawSquare(graphics, xc, yc, size);

    }

    public static void drawSquare(Graphics gra, double xc, double yc, double s) {
        gra.drawRect((int)(xc), (int)(yc), (int)(s), (int)(s));

        if (s > 1) {
            s = s/3d;

            drawSquare(gra, xc + s, yc-2*s, s);
            drawSquare(gra, xc+4*s, yc+s, s);
            drawSquare(gra, xc+s, yc+4*s, s);
            drawSquare(gra, xc-2*s, yc+s, s);


        } else {
            return;
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
