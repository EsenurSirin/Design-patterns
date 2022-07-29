package strategy;

public class ElifinProgrami implements SporProgrami{
    @Override
    public EnumProgram getBirinci() {
        return EnumProgram.PLATES;
    }

    @Override
    public EnumProgram getİkinci() {
        return EnumProgram.FITNESS;
    }

    @Override
    public EnumProgram getUcunucu() {
        return EnumProgram.KOSU;
    }

    @Override
    public EnumProgram getDorduncu() {
        return EnumProgram.YUZME;
    }
}
