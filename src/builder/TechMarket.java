package builder;

public class TechMarket {

    public static void main(String[] args) {

        // bu kod okunması zor ve bağımlılığı çok fazla bir kod türüdür!!! Örnek olması açısından yazılmıştır.

        Tv tv1 = new Tv();
        tv1.setBrand("LG");
        tv1.setScreenType("4K OLED");
        tv1.setOs("webOS");
        tv1.setScreenSize(164);
        tv1.setTvSize(1449 / 832);
        tv1.setCamera(true);
        tv1.setBluetooth(true);

        Tv tv2 = new Tv("LG", "4K OLED", "webOS", 164, 1449 / 832, 17.1, 3840 / 2160, 50 / 60, true, true, true, true, true, true);

        Tv(tv1);

        Tv(tv2);
    }

    public static void Tv(Tv tv) {

        System.out.println();

        System.out.println("Tv eklendi ->" + tv);

        System.out.println();
    }
}
