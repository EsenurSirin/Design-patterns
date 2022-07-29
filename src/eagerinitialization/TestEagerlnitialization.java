package eagerinitialization;

public class TestEagerlnitialization {

    public static void main(String[] args) {

        SingletonEagerlnitialization singletonEagerlnitialization1 = SingletonEagerlnitialization.getInstance();
        SingletonEagerlnitialization singletonEagerlnitialization2 = SingletonEagerlnitialization.getInstance();

        System.out.println("singletonEagerlnitialization1 ==>" + singletonEagerlnitialization1);
        System.out.println("singletonEagerlnitialization2 ==>" + singletonEagerlnitialization2);

        System.out.println(singletonEagerlnitialization1 == singletonEagerlnitialization2);

    }
}
