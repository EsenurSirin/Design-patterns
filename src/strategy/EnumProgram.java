package strategy;

public enum EnumProgram {

    SWIMMING("SWİMMİNG"),
    RUNNING("RUNNİNG"),
    FITNESS("FİTNESS"),
    PILATES("PiLATES")
    ;

    private String program;

    EnumProgram(String program){

        this.program = program;
    }

    @Override
    public String toString() {
       return program;
    }
}
