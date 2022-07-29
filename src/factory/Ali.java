package factory;

public class Ali implements Insan {


    @Override
    public void name() {
        System.out.println("Adı Ali");
    }

    @Override
    public void insanDavranisi(String davranis) {
        System.out.println("Ali kötü davrandı" + davranis);

    }
}
