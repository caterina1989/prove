public class Spesa {

    public String nome;
    public int importo;
    public Payer payer;

    public Spesa(String nome, int importo, Payer payer) {
        this.nome = nome;
        this.importo = importo;
        this.payer = payer;
    }

    public int getImporto() {
        return importo;
    }

    public void setImporto(int importo) {
        this.importo = importo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }
    
    public void save(Bus bus, String message){

         bus.fireEvent(new EventMessage(message));
    }
}

// save(bus) + fireEvent(new EventSave) - EventSave implements Event
// 