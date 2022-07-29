package strategy;

public class Ogrenci {

    private EnumBolum enumBolum;
    private SporProgrami sporProgrami;

    public Ogrenci(EnumBolum enumBolum) {
        this.enumBolum = enumBolum;

        if (enumBolum == null) {
            throw new NullPointerException("Bölüm boş olamaz.");
        }

        switch (enumBolum) {
            case YUZUCU:
                sporProgrami = new AyseninProgrami();
                break;

            case KOSUCU:
                sporProgrami = new AhmetinProgrami();
                break;

            case FITNESSEGITMENI:
                sporProgrami = new AlininProgrami();
                break;

            case PLATESEGITMENI:
                sporProgrami = new ElifinProgrami();
                break;

            default:
                break;
        }
    }

    public String getOncelikSiralamasi() {

        System.out.println(enumBolum + " için spor programı: ");

        String siralama = "Önce " + sporProgrami.getBirinci() + " yap. \n" +
                "Sonra " + sporProgrami.getİkinci() + " yap. \n" +
                "Daha sonra " + sporProgrami.getUcunucu() + " yap. \n" +
                "Son olarak " + sporProgrami.getDorduncu() + " yap. \n";

        return siralama;
    }
}
