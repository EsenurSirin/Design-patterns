package factory;

public class Ali implements Person {

    @Override
    public void name() {
        System.out.println("He is name Ali.");
    }

    @Override
    public void humanBehavior(String behaviour) {
        System.out.println(behaviour);
    }
}
