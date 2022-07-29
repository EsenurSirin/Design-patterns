package factory;

public class InsanFactory {

    public static Insan createInsan(Class aClass) throws IllegalAccessException, InstantiationException {
        return (Insan) aClass.newInstance();
    }
}
