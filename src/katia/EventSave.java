public class EventSave implements Event {

    public String save;
  

    @Override
    public String getName() {      
        return "eventSave";
    }
    
     public EventSave(String save) {
        this.save = save;
    }   

    public String getSave() {
        return save;
    }
}