package katia;

public class Main {
    public static void main(String... argvs) {

        Control control = new Control();

        control.executeCustomAction(new CustomAction() {

            @Override
            public void action(Control c) {
                
                System.out.println("Fabrizio");

            }

        });

    }
                                                   
}