package strategy;

public class AhmetinProgrami implements SporProgrami {
    @Override
    public EnumProgram getBirinci() {
        return EnumProgram.PLATES;
    }

    @Override
    public EnumProgram getİkinci() {
        return EnumProgram.KOSU;
    }

    @Override
    public EnumProgram getUcunucu() {
        return EnumProgram.YUZME;
    }

    @Override
    public EnumProgram getDorduncu() {
        return EnumProgram.FITNESS;
    }
}
