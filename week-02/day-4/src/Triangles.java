import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {


        double s = 20;
        // s = side length of an equilateral triangle
        int x = 100;
        int y = 0;
        // position of the top vertex of the top triangle x, y

        for (int i = 0; i< 10; i++) {


            for (int j = 0; j < i+1; j++) {
                drawTriangle(graphics, x+, y, s);
            }

        }


        //graphics.drawLine(100, 100, 100+(int)(s/2), 100 + (int)(s/2));
        //graphics.drawLine(0,0, (int)(s*Math.sqrt((3.0/4))), (int)(s*Math.sqrt(3.0/4)));
    }

    public static void drawTriangle(Graphics gra, int x, int y, double s) {
// position of the top vertex of the top triangle x, y

        gra.drawLine(x, y,x+(int)(s/2), y+(int)(Math.sqrt(3.0/4)*s));
        gra.drawLine(x+(int)(s/2), y+(int)(Math.sqrt(3.0/4)*s),x-(int)(s/2), y+(int)(Math.sqrt(3.0/4)*s) );
        gra.drawLine(x-(int)(s/2), y+(int)(Math.sqrt(3.0/4)*s) ,100, 0);
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