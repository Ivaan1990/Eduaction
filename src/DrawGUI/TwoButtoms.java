package DrawGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtoms {

    JFrame frame;
    JLabel label;

    class Labellistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Changed");
        }
    }

    class Colorlistener implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    public void go () {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Programm#2 ");

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new Labellistener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new Colorlistener());

        label = new JLabel("I'm a label");
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.NORTH, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);

        Dimension dimension = new Dimension(frame.getHeight(), frame.getWidth());
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLocation(0, 0);

    }

}
