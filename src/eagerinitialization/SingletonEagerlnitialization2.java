package eagerinitialization;

public class SingletonEagerlnitialization2 {

    private static SingletonEagerlnitialization2 instance;

    // static blok lnitialization işlemi yaptık
    static {

        instance = new SingletonEagerlnitialization2();

    }

    private static SingletonEagerlnitialization2 getInstance() {

        return instance;
    }
}
