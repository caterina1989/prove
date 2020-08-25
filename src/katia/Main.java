public class Main {
    public static void main(String[] argvs) {

        Bus bus = new Bus();

        Control control = new Control(bus);

        control.executeCustomAction(new CustomAction() {

            @Override
            public void action(Control c) {

                System.out.println("Fabrizio");

            }

        });

        bus.fireEvent(new Event() {

            @Override
            public String getName() {
                return "nome: uno";
            }

            
        });

        bus.fireEvent(new Event() {

            @Override
            public String getName() {
                return "nome: save";
            }

            

        });

        Payer payer = new Payer("pippo");
        payer.save(bus, "message payer");

        Spesa spesa = new Spesa(null, 0, payer);
        spesa.save(bus, "message spesa");


    }

}