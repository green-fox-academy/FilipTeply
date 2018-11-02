//
//import javax.swing.*;
//        import java.awt.*;
//        import java.awt.event.*;
//
//public class GradualChangingColor {
//
//    public static void main(String args[]) {
//        final JFrame frame = new JFrame();
//        frame.setBounds(100, 100, 300, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // set some random initial color
//        final Component comp = frame.getContentPane();
//        comp.setBackground(new Color(
//                (float) Math.random(),
//                (float) Math.random(),
//                (float) Math.random()));
//
//        frame.setVisible(true);
//
//        final BarTimer timer = new BarTimer(50, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent evt) {
//                final Color targetColor = new Color(30,40,50);
//                final int changingSpeed = 5;
//
//                final Color currentColor = comp.getBackground();
//
//                // step 1
//                int r = currentColor.getRed();
//                int g = currentColor.getGreen();
//                int b = currentColor.getBlue();
//
//                // step 2
//                double dr = targetColor.getRed() - r;
//                double dg = targetColor.getGreen() - g;
//                double db = targetColor.getBlue() - b;
//
//                // step 3
//                double norm = Math.sqrt(dr*dr+dg*dg+db*db);
//                if (norm < .001) {
//                    ((BarTimer)(evt.getSource())).stop();
//                    return;
//                }
//                dr /= norm;
//                dg /= norm;
//                db /= norm;
//
//                // step 4
//                dr *= Math.min(changingSpeed, norm);
//                dg *= Math.min(changingSpeed, norm);
//                db *= Math.min(changingSpeed, norm);
//
//                // step 5
//                r += dr;
//                g += dg;
//                b += db;
//                comp.setBackground(new Color(r,g,b));
//
//                frame.repaint();
//            }
//        });
//        timer.start();
//    }
//}