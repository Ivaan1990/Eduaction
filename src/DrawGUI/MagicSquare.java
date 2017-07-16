package DrawGUI;
import javax.swing.*;
import java.awt.*;

public class MagicSquare {

    class MyDrawP extends JPanel {

        public void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 500, 250);
            g.setColor(Color.BLACK);
            //g.fillRect(x,y, 495-x*2,245-y*2); // сжимающийся квадрат
            g.fillRect(500 - x * 2, 250 - y * 2, x, y);// вырастает квадрает из правого нижнего угла
        }
    }

    private int x = 1, y = 1;

    public void go() {

        JFrame frame = new JFrame("Magic Square");
        JButton button = new JButton("Start");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawP panel = new MyDrawP();
        MyDrawP panel2 = new MyDrawP();
        frame.getContentPane().add(panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500, 270);

        for (int i = 0; i < 124; i ++, x ++, y ++) {
            x++;
            panel.repaint();
            panel2.repaint();
            try {
                Thread.sleep(14);
            } catch (Exception ex) {}
        }
    }
}
