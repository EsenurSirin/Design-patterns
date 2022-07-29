package strategy;

public class AlininProgrami implements SporProgrami {
    @Override
    public EnumProgram getBirinci() {
        return EnumProgram.KOSU;
    }

    @Override
    public EnumProgram getİkinci() {
        return EnumProgram.PLATES;
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
