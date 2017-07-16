package DrawGUI;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {

    class MoveListener {


    }

       public void paintComponent(Graphics g) {

        Graphics2D g2g = (Graphics2D) g;
        // Наш аргумент, словно холст, на нем мы рисуем то, что опишем дальше...
        g2g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g2g.setColor(Color.orange); //выбираю цвет для объекта рисования,
        g2g.fillOval(75, 70, 100, 100);// задаю рисунок для обекта и его координаты

        g2g.setColor(Color.PINK); // выбираю новый цвет, во фрейме появится новый круг
        g2g.fillRect(65,250, 180, 180);// и он будет расположен в другом месте

        GradientPaint gradient = new GradientPaint(0, 0, Color.blue, 400, 400, Color.orange);
        g2g.setPaint(gradient); // этот странный градиент
        g2g.fillOval(100, 100, 270, 250);

       /* Image image = new ImageIcon("myPic.jpg").getImage();
        g2g.drawImage(image, 250, 250, this);*/
   }
}
