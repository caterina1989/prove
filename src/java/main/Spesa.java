package java.main;

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
    
}