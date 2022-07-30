package builder;

public class TechMarketV2 {

    public static void main(String[] args) {

        // Builder sınıfımızda aynı markadan 2 farklı özelliklere sahip tv lerimizi burada çağırdık ve özelliklerini tanımladık.

        Tv tv1 = TVBuilder.start4KUHDBuild("LG", "webOS", "4K UHD", 31.4, 189)
                .setBluetooth(true)
                .setCamera(true)
                .setFilmmakerMode(false)
                .setHdSatelliteReceiver(true)
                .setPictureMode(true)
                .setResolution(3840 / 2160)
                .setTvSize(1678 / 964)
                .setUltraShine(false)
                .setVoltageHz(50 / 60)
                .build();

        Tv tv2 = TVBuilder.start4KOLEDBuild("LG", "webOS", "4K OLED", 17.1, 164,true,true)
                .setBluetooth(true)
                .setCamera(true)
                .setFilmmakerMode(false)
                .setHdSatelliteReceiver(true)
                .setPictureMode(true)
                .setResolution(3840 / 2160)
                .setTvSize(1678 / 964)
                .setUltraShine(false)
                .setVoltageHz(50 / 60)
                .setCamera(true)
                .setFilmmakerMode(true)
                .build();

        Tv(tv1);
        Tv(tv2);
    }

    public static void Tv(Tv tv) {

        System.out.println();

        System.out.println("Tv eklendi ->" + tv);

        System.out.println();
    }
}
