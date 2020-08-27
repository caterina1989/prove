import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bus {
	//
	private List<Event> events = new ArrayList<Event>();

	/**
	 * Registra un evento
	 * 
	 * @param event
	 */
	public void registerEvent(Event event) {
		//
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
	 */
	public void fireEvent(String eventName, Object param) {
		//
		Iterator<Event> iterator = events.iterator();
		//
		while (iterator.hasNext()) {
			//
			Event event = (Event) iterator.next();
			//
			if (eventName.equals(event.getName())) {
				//
				event.onEvent(param);
			}
		}
	}
}
