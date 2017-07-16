package DrawGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI2 implements ActionListener {

    JFrame frame;
    JButton button;

    public void go() {

        frame = new JFrame(); // ФРЭЙМ ЭТО ОКНО, НА КОТОРОЕ МОЖНО ДОБАВЛЯТЬ КНОПКИ РИСУНКИ И Т.Д
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        //button.addActionListener(this);

        MyDrawPanel panel = new MyDrawPanel(); //А ЭТОТ ОБЪЕКТ РИСУЕТ ВО ФРЕЙМЕ ТО, ЧТО ОПИСАНО В КЛАССЕ MyDrawPanel

        frame.getContentPane().add(panel); //TODO тут -panel- отрабатывает
        button = new JButton("Change Cilcle");
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        //frame.getContentPane().add(BorderLayout.WEST, panel);

        button = new JButton("Change Square");
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setVisible(true);
    }

    @Override
        public void actionPerformed(ActionEvent e) {
        //button.setText("Changed");
        frame.repaint();

    }
}
