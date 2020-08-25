public class EventMessage implements Event {

    public String message;

    public EventMessage(String message) {
        this.message = message;
    }   

    @Override
    public String getName() {
        return "eventMessage";
    }

    public String getMessage() {
        return message;
    }


}