package katia;

import java.util.ArrayList;
import java.util.List;

public class Control {

    List<Payer> payers;
    List<Spesa> lista;

    public Control() {

        lista = new ArrayList<Spesa>();
        payers = new ArrayList<Payer>();

        Payer fabrizio = new Payer("Fabrizio");
        Payer katia = new Payer("Katia");

        Spesa piscina = new Spesa("giugra", 16, katia);
        Spesa birra = new Spesa("birre", 10, fabrizio);
        Spesa pizza = new Spesa("pizzeria", 30, katia);

        payers.add(fabrizio);
        payers.add(katia);

        lista.add(piscina);
        lista.add(birra);
        lista.add(pizza);

        System.out.println(getSpesaByPayer("Katia"));
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

    // public int getSpesaByPayer(String name) {
    //     int totale = 0;
    //     for (int i = 0; i < payers.size(); i++) {
    //         Payer tizio = payers.get(i);
    //         for (int x = 0; x < lista.size(); x++) {
    //             Spesa cosa = lista.get(x);
    //             if (tizio.getNome().equals(name)) {
    //                 totale = cosa.getImporto();
    //             }
    //         }
    //     }
    //     return totale;
    // }

}