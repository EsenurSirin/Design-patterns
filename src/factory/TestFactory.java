package factory;

public class TestFactory {

    public static void main(String[] args) {

        try {
            Ayse ayse = (Ayse) InsanFactory.createInsan(Ayse.class);
            ayse.name();
            ayse.insanDavranisi("Ayşe iyi davrandı");

            Ali ali = (Ali) InsanFactory.createInsan(Ali.class);
            ali.name();
            ali.insanDavranisi("Ali kötü davrandı");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
