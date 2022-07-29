package lazyinitialization;

public class SingletonLazyInitialization {

    // class ile aynı türde static bir üye mevcuttur
    private static SingletonLazyInitialization instance;

    // // private constructor tanımlanmıştır
    private SingletonLazyInitialization() {

    }

    // static üye'ye ulaşmak için kullanılan static metottur.
    public static SingletonLazyInitialization getInstance() {

        if (instance == null) {

            instance = new SingletonLazyInitialization();
        }

        return instance;
    }
}
