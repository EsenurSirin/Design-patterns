package strategy;

public enum EnumBolum {

    YUZUCU("YÜZÜCÜ"),
    KOSUCU("KOŞUCU"),
    FITNESSEGITMENI("FİTNESS EĞİTMENİ"),
    PLATESEGITMENI("PLATES EĞİTMENİ")
    ;

    private String bolum;

    EnumBolum(String bolum){

        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return bolum;
    }
}
