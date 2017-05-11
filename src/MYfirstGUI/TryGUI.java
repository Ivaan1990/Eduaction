package MYfirstGUI;
import java.awt.*;
import javax.swing.*;

public class TryGUI extends JFrame{

    TryGUI () {

        setTitle("GUI First");
        setSize (new Dimension(300, 350));
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize(), fSize = getSize();

        JButton newButton = new JButton("Button");
        getContentPane().add(newButton);

        if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }

        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        }

        setLocation((sSize.width - fSize.width)/8, (sSize.height - fSize.height));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
