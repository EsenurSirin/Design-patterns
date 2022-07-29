package strategy;

public class App {

    public static void main(String[] args) {

        System.out.println("----------------------");
        siralamaYazdir(EnumBolum.YUZUCU);

        System.out.println("----------------------");
        siralamaYazdir(EnumBolum.KOSUCU);

        System.out.println("----------------------");
        siralamaYazdir(EnumBolum.FITNESSEGITMENI);

        System.out.println("----------------------");
        siralamaYazdir(EnumBolum.PLATESEGITMENI);

    }
    private static void siralamaYazdir (EnumBolum bolum){

        Ogrenci ogrenci = new Ogrenci(bolum);
        String oncelikSiralamasi = ogrenci.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);

    }
}
