package katia;

public class Payer {
    
    public String nome;
    public int importoDovuto;

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setImportoDovuto (int importoDovuto) {
        this.importoDovuto = importoDovuto;
    }

    public int getImortoDovuto() {
        return importoDovuto;
    }

    public Payer (String nome) {
        this.nome = nome;
    }

    public void save(Bus bus){
        bus.fireEvent(new Event(){

            @Override
            public String getName() {
                // TODO Auto-generated method stub
                return "save";
            }

        });
    }

}