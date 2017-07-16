package DrawGUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleAnimation extends JFrame implements ActionListener {

    class DrawPanel extends JPanel {

        public void paintComponent (Graphics g) {

            g.setColor(Color.GRAY);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.YELLOW);
            g.fillOval(x, y, 40, 40);

        }
    }

    JFrame frame = new JFrame();
    JButton button = new JButton("Start!");

    int x = 70;
    int y = 70;
    String line = "changed";

    @Override
    public void actionPerformed(ActionEvent e) {
        // запилить метод equals который будет сравнивать то что изменила кнопка ("changed".equals(line)) и после
        // и это будет тригером к началу работы цикла для движения шарика
    }

    void go() {

        frame.setTitle("Animation");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setVisible(true);

        DrawPanel panel = new DrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(panel);

        int i;
            for (i = 0; i < 30; i++) {

                x++;
                y++;
                panel.repaint();


                try {
                    Thread.sleep(10);
                } catch (Exception ex) {}
            }
        if (true) {
            for (int j = 0; j < 130; j++) {

                x--;
                y--;

                try {
                    Thread.sleep(10);
                } catch (Exception exc) {}
            }
        }
    }
}