package strategy;

public enum EnumProgram {

    YUZME("YÜZME"),
    KOSU("KOŞU"),
    FITNESS("FİTNESS"),
    PLATES("PLATES")
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
