import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Bus {
    //
    private List<Event> events = new ArrayList<Event>();

    /**
     * Registra un evento
     * 
     * @param event
     */
    public void registerEvent(Event event) {
        // questo è com'era addReader
        synchronized (events) {
            //
            events.add(event);
        }

    }

    /**
     * Spara un evento
     * 
     * @param eventName
     * @param map
     * @param msg
     */
    public void fireEvent(String eventName, Map<String, Object> map, String msg) {
        //
        Iterator<Event> iterator = events.iterator();
        //
        while (iterator.hasNext()) {
            //
            Event event = iterator.next();
            //
            if (eventName.equals(event.getName())) {
                //
                event.onEvent(map, msg);
            }
        }
    }
}
