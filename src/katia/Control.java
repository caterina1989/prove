package katia;

import java.util.ArrayList;
import java.util.List;

public class Control {

    List<Payer> payers;
    List<Spesa> lista;
    private Bus bus;

    public Control(Bus bus) {

        this.bus = bus;

        lista = new ArrayList<Spesa>();
        payers = new ArrayList<Payer>();

        Payer fabrizio = new Payer("Fabrizio");
        Payer katia = new Payer("Katia");

        Spesa piscina = new Spesa("giugra", 16, katia);
        Spesa birra = new Spesa("birre", 10, fabrizio);
        Spesa pizza = new Spesa("pizzeria", 30, katia);
        Spesa birrette = new Spesa("birrette", 40, fabrizio);

        payers.add(fabrizio);
        payers.add(katia);

        lista.add(piscina);
        lista.add(birra);
        lista.add(pizza);
        lista.add(birrette);

        bus.addReader(new Reader() {

            @Override
            public String getName() {
                // TODO Auto-generated method stub
                return "uno";
            }

            @Override
            public void actionReader(Event x) {
                //
                System.out.println("uno");
            }
        });

        bus.addReader(new Reader() {

            @Override
            public String getName() {
                // TODO Auto-generated method stub
                return "save";
            }

            @Override
            public void actionReader(Event x) {
                //
                System.out.println("saveS");
            }
        });

        // System.out.println(getSpesaByPayer("Katia"));

        // System.out.println(getDifference());

    }

    public int getSpesaByPayer(String name) {

        int sum = 0;

        for (int i = 0; i < lista.size(); i++) {
            Spesa cosa = lista.get(i);

            if (cosa.getPayer().getNome().equals(name)) {
                sum = sum + cosa.getImporto();
            }
        }
        return sum;
    }

    public int getDifference() {

        int uno = this.getSpesaByPayer("Katia");
        int due = this.getSpesaByPayer("Fabrizio");

        int diff = due - uno;

        return diff;
    }

    public void executeCustomAction(CustomAction a) {
        a.action(this);
    }

    // public int getSpesaByPayer(String name) {
    // int totale = 0;
    // for (int i = 0; i < payers.size(); i++) {
    // Payer tizio = payers.get(i);
    // for (int x = 0; x < lista.size(); x++) {
    // Spesa cosa = lista.get(x);
    // if (tizio.getNome().equals(name)) {
    // totale = cosa.getImporto();
    // }
    // }
    // }
    // return totale;
    // }

}