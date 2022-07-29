package strategy;

public class Student {

    private EnumEpisode enumEpisode;
    private SporsProgram sporsProgram;

    public Student(EnumEpisode enumEpisode) {
        this.enumEpisode = enumEpisode;

        if (enumEpisode == null) {
            throw new NullPointerException("Partition cannot be empty");
        }

        switch (enumEpisode) {
            case SWIMMER:
                sporsProgram = new AysesProgram();
                break;

            case RUNNER:
                sporsProgram = new AhmetsProgram();
                break;

            case FITNESSTRAINER:
                sporsProgram = new AlisProgram();
                break;

            case PILATESINSTRUCTOR:
                sporsProgram = new ElifsProgram();
                break;

            default:
                break;
        }
    }

    public String getprintInOrder() {

        System.out.println(enumEpisode + " for sports program: ");

        String arrangement = "First " + sporsProgram.getFirst() + " do. \n" +
                "Then " + sporsProgram.getSecond() + " do. \n" +
                "Later " + sporsProgram.getThird() + " do. \n" +
                "Finally " + sporsProgram.getFourth() + " do. \n";

        return arrangement;
    }
}
