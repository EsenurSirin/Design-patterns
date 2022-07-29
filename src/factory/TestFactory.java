package factory;

public class TestFactory {

    public static void main(String[] args) {

        try {
            Ayse ayse = (Ayse) PersonFactory.createPerson(Ayse.class);
            ayse.name();
            ayse.humanBehavior("Ayşe iyi davrandı");

            Ali ali = (Ali) PersonFactory.createPerson(Ali.class);
            ali.name();
            ali.humanBehavior("Ali kötü davrandı");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
