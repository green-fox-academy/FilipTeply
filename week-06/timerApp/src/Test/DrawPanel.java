
import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.Random;

        import javax.swing.JFrame;
        import javax.swing.JPanel;
        import javax.swing.Timer;

public class DrawPanel extends JPanel{

    public GridBagLayout gbl;

    //position and dimension
    int x = 0, y = 0, width = 200, height = 200;

    public DrawPanel(){
        repaint();
    }

    public DrawPanel(GridBagLayout gridBagLayout) {
        this.gbl = gridBagLayout;
    }

    public void paintComponent(Graphics g){
        //Overwriting of old picture
        super.paintComponent(g);

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random gen = new Random();

                Color color = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));

                //Draw color disk
                g.setColor(color);
                g.fillArc(x, y, width, height, 0, 360);
            }
        };

        Timer t = new Timer(500, action);
        t.setRepeats(true);
        t.setInitialDelay(0);
        t.start();



        //Draw boundary of circle
        g.setColor(Color.BLACK);
        g.drawArc(x, y, width, height, 0, 360);
    }


    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        frame.setSize(300, 300);
        final DrawPanel panel = new DrawPanel();
        panel.setOpaque(true);
        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

//      ActionListener action = new ActionListener() {
//          @Override
//          public void actionPerformed(ActionEvent e) {
//              Random gen = new Random();
//                  Color color = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
//                  panel.setBackground(color);
//          }
//      };
//
//      BarTimer t = new BarTimer(500, action);
//      t.setRepeats(true);
//      t.setInitialDelay(0);
//      t.start();

    }

}
