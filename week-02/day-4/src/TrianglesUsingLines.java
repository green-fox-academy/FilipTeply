
import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesUsingLines {
    public static void mainDraw(Graphics graphics) {


        double s = 20.0;
        // s = side length of an equilateral triangle
        int x = 100;
        int y = 0;
        //number of repetitions
        int rep = 10;

        // position of the top vertex of the top triangle x, y
        drawHorizontals(graphics, s, rep);
        drawDescendingLines(graphics, s, rep);

        


        //graphics.drawLine(100, 100, 100+(int)(s/2), 100 + (int)(s/2));
        //graphics.drawLine(0,0, (int)(s*Math.sqrt((3.0/4))), (int)(s*Math.sqrt(3.0/4)));
    }

    public static void drawHorizontals(Graphics gra, double s, int rep) {
// position of the top vertex of the top triangle x, y
        int ofsx = 100;
        int ofsy = 10;

        for (int i = 0; i < rep; i++) {

            gra.drawLine(ofsx - i*(int)(s/2), ofsy + i*(int)(Math.sqrt(3.0/4)*s),ofsx + i*(int)(s/2), ofsy + i*(int)(Math.sqrt(3.0/4)*s));
        }
    }

    public static void drawDescendingLines(Graphics gra, double s, int rep){
        int ofsx = 100;
        int ofsy = 10;
        gra.drawLine(ofsx - i*(int)(s/2), ofsy + i*(int)(Math.sqrt(3.0/4)*s), );
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