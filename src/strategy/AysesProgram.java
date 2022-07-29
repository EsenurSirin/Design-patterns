package strategy;

public class AysesProgram implements SporsProgram {


    @Override
    public EnumProgram getFirst() {
        return EnumProgram.PILATES;
    }

    @Override
    public EnumProgram getSecond() {
        return EnumProgram.SWIMMING;
    }

    @Override
    public EnumProgram getThird() {
        return EnumProgram.RUNNING;
    }

    @Override
    public EnumProgram getFourth() {
        return EnumProgram.FITNESS;
    }
}
