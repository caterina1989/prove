import java.util.Map;

public interface Event {

    public abstract String getName();

    public abstract void onEvent(Map<String,Object> map);

}