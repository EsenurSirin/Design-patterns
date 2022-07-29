package strategy;

public class ElifsProgram implements SporsProgram {
    @Override
    public EnumProgram getFirst() {
        return EnumProgram.PILATES;
    }

    @Override
    public EnumProgram getSecond() {
        return EnumProgram.FITNESS;
    }

    @Override
    public EnumProgram getThird() {
        return EnumProgram.RUNNING;
    }

    @Override
    public EnumProgram getFourth() {
        return EnumProgram.SWIMMING;
    }
}
