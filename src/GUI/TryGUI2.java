package GUI;
import javax.swing.*;
import java.awt.*;

public class TryGUI2 extends JFrame {

    TryGUI2() {

        super ("CalculatorGUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        setSize (250, 242);
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize(), getSize = getSize();

        //panel.setLayout(new GridLayout(2, 3));
        // Распологаем кнопки в окне "вручную"

        JButton button = new JButton("*");
        button.setSize(45, 45);
        button.setLocation(180, 1);
        panel.add(button);

        button = new JButton("-");
        button.setSize(45, 45);
        button.setLocation(180, 50);
        panel.add(button);

        button = new JButton("+");
        button.setSize(45, 45);
        button.setLocation(180, 100);
        panel.add(button);

        button = new JButton("/");
        button.setSize(45, 45);
        button.setLocation(180, 152);
        panel.add(button);

        setContentPane(panel);
        setLocation((size.width - getSize.width)/2, (size.height - getSize.height)/2);

    }
}
