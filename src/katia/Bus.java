import java.util.ArrayList;
import java.util.List;

public class Bus {

    List<Reader> readers = new ArrayList<Reader>();

    public void fireEvent(Event e) {
        // dato event estrarre il nome dall event e ricercare nella lista dei reader
        // tutti quelli chehanno lo
        // stesso nome. per ogni reader trovato eseguire azione del reader passando
        // event.

        for (int i = 0; i < readers.size(); i++) {
            Reader uno = readers.get(i);

            if (e.getName().equals(uno.getName())) {

                uno.actionReader(e);
            }
        }

    }

    public void addReader(Reader r) {
        // Aggiungre readaer alla lista

        readers.add(r);

    }

    // piu reader in una lista, quando si implementa un event verra passato a tutti
    // i reader

}