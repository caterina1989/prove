import java.util.HashMap;
import java.util.Map;

public abstract class EventSave implements Event {

    public static String NAME = EventSave.class.getName();

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void onEvent(Object param) {
        //
        this.onSave((Spesa) param);
    }

    public abstract void onSave(Spesa spesa);

    public static void fireEvent(Bus bus, Spesa spesa) {

        Map<String, Object> map = new HashMap<>();
        map.put("pewex", spesa);

        bus.fireEvent(EventSave.NAME, map);
    }
}