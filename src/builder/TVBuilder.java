package builder;

public class TVBuilder {

    // Builder sınıfımızda aynı marka olan fakat iki ayrı özelliklere sahip tv tipi oluşturduk.

    private String brand;
    private String screenType;
    private String os;

    private double tvWeight;

    private int screenSize;
    private int tvSize;
    private int resolution;
    private int voltageHz;

    private boolean camera;
    private boolean ultraShine;
    private boolean filmmakerMode;
    private boolean pictureMode;
    private boolean bluetooth;
    private boolean hdSatelliteReceiver;

    public static TVBuilder start4KUHDBuild(String brand, String screenType, String os, double tvWeight, int screenSize) {

        TVBuilder tvBuilder = new TVBuilder();

        tvBuilder.brand = brand;
        tvBuilder.screenType = screenType;
        tvBuilder.os = os;
        tvBuilder.tvWeight = tvWeight;
        tvBuilder.screenSize = screenSize;

        return tvBuilder;

    }

    public static TVBuilder start4KOLEDBuild(String brand, String screenType, String os, double tvWeight, int screenSize, boolean camera, boolean filmmakerMode) {

        TVBuilder tvBuilder = new TVBuilder();

        tvBuilder.brand = brand;
        tvBuilder.screenType = screenType;
        tvBuilder.os = os;
        tvBuilder.tvWeight = tvWeight;
        tvBuilder.screenSize = screenSize;
        tvBuilder.camera = camera;
        tvBuilder.filmmakerMode = filmmakerMode;

        return tvBuilder;

    }

    public Tv build() {

        Tv tv = new Tv();

        tv.setBrand(brand);
        tv.setScreenType(screenType);
        tv.setOs(os);
        tv.setTvWeight(tvWeight);
        tv.setScreenSize(screenSize);
        tv.setTvSize(tvSize);
        tv.setResolution(resolution);
        tv.setVoltageHz(voltageHz);
        tv.setCamera(camera);
        tv.setUltraShine(ultraShine);
        tv.setFilmmakerMode(filmmakerMode);
        tv.setPictureMode(pictureMode);
        tv.setBluetooth(bluetooth);
        tv.setHdSatelliteReceiver(hdSatelliteReceiver);

        return tv;
    }

    public TVBuilder setTvSize(int tvSize) {
        this.tvSize = tvSize;
        return this;
    }

    public TVBuilder setResolution(int resolution) {
        this.resolution = resolution;
        return this;
    }

    public TVBuilder setVoltageHz(int voltageHz) {
        this.voltageHz = voltageHz;
        return this;
    }

    public TVBuilder setCamera(boolean camera) {
        this.camera = camera;
        return this;
    }

    public TVBuilder setUltraShine(boolean ultraShine) {
        this.ultraShine = ultraShine;
        return this;
    }

    public TVBuilder setFilmmakerMode(boolean filmmakerMode) {
        this.filmmakerMode = filmmakerMode;
        return this;
    }

    public TVBuilder setPictureMode(boolean pictureMode) {
        this.pictureMode = pictureMode;
        return this;
    }

    public TVBuilder setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public TVBuilder setHdSatelliteReceiver(boolean hdSatelliteReceiver) {
        this.hdSatelliteReceiver = hdSatelliteReceiver;
        return this;
    }
}
