package strategy;

public class AhmetsProgram implements SporsProgram {
    @Override
    public EnumProgram getFirst() {
        return EnumProgram.PILATES;
    }

    @Override
    public EnumProgram getSecond() {
        return EnumProgram.RUNNING;
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
