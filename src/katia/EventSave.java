public class EventSave implements Event {

    public Spesa spesa;

    @Override
    public String getName() {      
        return "eventSave";
    }
    
     public EventSave(Spesa spesa) {
        this.spesa = spesa;
    }   

    public Spesa getSpesa() {
        return spesa;
    }

}