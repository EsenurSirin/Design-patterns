package factory;

public class Ayse implements Insan {

    @Override
    public void name() {
        System.out.println("Adı Ayşe");

    }

    @Override
    public void insanDavranisi(String davranis) {

        System.out.println("Ayşe iyi davrandı" + davranis);

    }
}
