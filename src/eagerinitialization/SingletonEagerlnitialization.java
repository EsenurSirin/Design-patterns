package eagerinitialization;

public class SingletonEagerlnitialization {

    // new SingletonEagerlnitialization şeklinde tanımlıyoruz.
    private static SingletonEagerlnitialization instance = new SingletonEagerlnitialization();

    private SingletonEagerlnitialization() {

    }

    public static SingletonEagerlnitialization getInstance() {

        return instance;
    }
}
