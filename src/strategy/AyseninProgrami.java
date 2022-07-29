package strategy;

public class AyseninProgrami implements SporProgrami {


    @Override
    public EnumProgram getBirinci() {
        return EnumProgram.PLATES;
    }

    @Override
    public EnumProgram getİkinci() {
        return EnumProgram.YUZME;
    }

    @Override
    public EnumProgram getUcunucu() {
        return EnumProgram.KOSU;
    }

    @Override
    public EnumProgram getDorduncu() {
        return EnumProgram.FITNESS;
    }
}
