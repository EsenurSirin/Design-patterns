package factory;

public class PersonFactory {

    public static Person createPerson(Class aClass) throws IllegalAccessException, InstantiationException {
        return (Person) aClass.newInstance();
    }
}
