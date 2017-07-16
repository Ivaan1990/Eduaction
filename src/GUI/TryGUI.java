package GUI;
import java.awt.*;
import javax.swing.*;

public class TryGUI extends JFrame{

    TryGUI () {

        /*try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex){}//персонализирует окно программы под установленную ОС */

        // создается окно
        setTitle("GUI First");
        setSize (new Dimension(400, 350)); // его размер, ширина, высота
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize(), fSize = getSize();
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //создаем кнопки Jpanel
        JPanel panel = new JPanel();
        //panel.setLayout(new FlowLayout()); //размещает добавляемые на панель компоненты строго по очереди
        //panel.add(new JButton("Кнопка"));
        //panel.add(new JButton("+"));

        //размещает кнопки согласно сторонам света, лучше использовать уже определенные константы WEST EAST SOUTH NORTH
        getContentPane().add (new JButton("-"), BorderLayout.WEST);
        getContentPane().add (new JButton("+"), BorderLayout.EAST);
        getContentPane().add (new JButton("END"));//без параметра расположения, встает по центру

        //setContentPane(panel);// узнать что за метод

        //распологаем окно
        /*if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }

        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        }*/

        //выбираем точное расположение

        setLocation((sSize.width - fSize.width)/2, (sSize.height - fSize.height)/2);

    }

    public void go() {
    }
}
