package lazyinitialization;

public class TestLazyInitialization {

    public static void main(String[] args) {

        // Instance’ları new ile yaratmıyoruz. Bunun yerine getInstance metodunu kullandık.
        // Bu metot bize her defasında aynı instance’ı veriyor
        // getInstance metodu çağırılana kadar instance yaratılmaz
        SingletonLazyInitialization singletonLazyInitialization1 = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization singletonLazyInitialization2 = SingletonLazyInitialization.getInstance();

        System.out.println("singleton1 ==>" + singletonLazyInitialization1);
        System.out.println("singleton2 ==>" + singletonLazyInitialization2);

        System.out.println(singletonLazyInitialization1 == singletonLazyInitialization2);
    }
}
