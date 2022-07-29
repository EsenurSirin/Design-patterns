package factory;

public class TestFactory {

    public static void main(String[] args) {

        try {
            Ayse ayse = (Ayse) PersonFactory.createPerson(Ayse.class);
            ayse.name();
            ayse.humanBehavior("Ayşe was well behaved.");

            Ali ali = (Ali) PersonFactory.createPerson(Ali.class);
            ali.name();
            ali.humanBehavior("Ali behaved badly.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
