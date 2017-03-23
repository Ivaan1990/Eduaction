package Java_zadachi;
import javax.sound.midi.*;
import static java.lang.System.out;

/**
 * Created by Asus on 20.03.2017.
 */
public class Music {

    public void play () {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            out.println ("Синтезатор успешно получен");
        } catch (MidiUnavailableException ex) {
            out.println ("Неудача");
        }
    }

}
