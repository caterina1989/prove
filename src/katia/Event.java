public interface Event {

    public abstract String getName();

    public abstract void onEvent(Object param);

}