package builder;

public class Tv {

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

    public Tv() {
    }

    public Tv(String brand, String screenType, String os, int screenSize, int tvSize, double tvWeight, int resolution, int voltageHz, boolean camera, boolean ultraShine, boolean filmmakerMode, boolean pictureMode, boolean bluetooth, boolean hdSatelliteReceiver) {
        this.brand = brand;
        this.screenType = screenType;
        this.os = os;
        this.screenSize = screenSize;
        this.tvSize = tvSize;
        this.tvWeight = tvWeight;
        this.resolution = resolution;
        this.voltageHz = voltageHz;
        this.camera = camera;
        this.ultraShine = ultraShine;
        this.filmmakerMode = filmmakerMode;
        this.pictureMode = pictureMode;
        this.bluetooth = bluetooth;
        this.hdSatelliteReceiver = hdSatelliteReceiver;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                ", screenType='" + screenType + '\'' +
                ", Os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", tvSize=" + tvSize +
                ", tvWeight=" + tvWeight +
                ", resolution=" + resolution +
                ", voltageHz=" + voltageHz +
                ", camera=" + camera +
                ", ultraShine=" + ultraShine +
                ", filmmakerMode=" + filmmakerMode +
                ", pictureMode=" + pictureMode +
                ", bluetooth=" + bluetooth +
                ", hdSatelliteReceiver=" + hdSatelliteReceiver +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getTvSize() {
        return tvSize;
    }

    public void setTvSize(int tvSize) {
        this.tvSize = tvSize;
    }

    public double getTvWeight() {
        return tvWeight;
    }

    public void setTvWeight(double tvWeight) {
        this.tvWeight = tvWeight;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getVoltageHz() {
        return voltageHz;
    }

    public void setVoltageHz(int voltageHz) {
        this.voltageHz = voltageHz;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public boolean isUltraShine() {
        return ultraShine;
    }

    public void setUltraShine(boolean ultraShine) {
        this.ultraShine = ultraShine;
    }

    public boolean isFilmmakerMode() {
        return filmmakerMode;
    }

    public void setFilmmakerMode(boolean filmmakerMode) {
        this.filmmakerMode = filmmakerMode;
    }

    public boolean isPictureMode() {
        return pictureMode;
    }

    public void setPictureMode(boolean pictureMode) {
        this.pictureMode = pictureMode;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isHdSatelliteReceiver() {
        return hdSatelliteReceiver;
    }

    public void setHdSatelliteReceiver(boolean hdSatelliteReceiver) {
        this.hdSatelliteReceiver = hdSatelliteReceiver;
    }
}
