package factory;

public class Ayse implements Person {


    @Override
    public void name() {
        System.out.println("She is name Ayşe");

    }

    @Override
    public void humanBehavior(String behaviour) {
        System.out.println(behaviour);

    }
}
