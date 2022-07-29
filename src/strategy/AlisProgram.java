package strategy;

public class AlisProgram implements SporsProgram {
    @Override
    public EnumProgram getFirst() {
        return EnumProgram.RUNNING;
    }

    @Override
    public EnumProgram getSecond() {
        return EnumProgram.PILATES;
    }

    @Override
    public EnumProgram getThird() {
        return EnumProgram.SWIMMING;
    }

    @Override
    public EnumProgram getFourth() {
        return EnumProgram.FITNESS;
    }
}
