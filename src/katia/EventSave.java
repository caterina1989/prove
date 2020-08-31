import java.util.HashMap;
import java.util.Map;

public abstract class EventSave implements Event {

    public static String NAME = EventSave.class.getName();

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void onEvent(Map<String,Object> map) {
        //
        this.onSave((Spesa) map.get("pewex"));
        System.out.println(map.get("messaggio"));
    }

    public abstract void onSave(Spesa spesa);

    public static void fireEvent(Bus bus, Spesa spesa, String msg) {

        Map<String, Object> map = new HashMap<>();
        map.put("pewex", spesa);
        map.put("messaggio", msg);

        bus.fireEvent(EventSave.NAME, map);
    }
}