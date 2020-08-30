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

        Spesa spesa = new Spesa(null, 0, new Payer("fab"));
        spesa.saveSpesa(bus);

        bus.registerEvent(new EventSave() {

            @Override
            public void onSave(Spesa s) {
                //
                System.out.println(s.getPayer().getNome());
                // Ho la spesa
            }
        });
    }

}