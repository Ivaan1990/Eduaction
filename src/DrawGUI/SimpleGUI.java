package DrawGUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SimpleGUI implements ActionListener {

    JButton button;

    void go () {

        JFrame frame = new JFrame();
        button = new JButton("Нажми меня");

        button.addActionListener(this); //добавляем нашу "заинтересованность используя this" к кнопке,
        //то есть, привязываем к ней событие, чтобы что то происходило когда на кнопку нажимают


        frame.getContentPane().add(button); // добавляет кнопку во фрейм
        frame.setSize (300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed (ActionEvent e) {
        //метод обработки события, то есть, нажатия на кнопку, он привязан к графическому компоненту, тобишь к кнопке
        button.setText("меня нажали");
    }
}
