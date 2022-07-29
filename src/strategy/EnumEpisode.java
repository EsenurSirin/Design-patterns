package strategy;

public enum EnumEpisode {

    SWIMMER("SWİMMER"),
    RUNNER("RUNNER"),
    FITNESSTRAINER("FİTNESS TRAİNER"),
    PILATESINSTRUCTOR("PİLATES İNSTRUCTOR");

    private String episode;

    EnumEpisode(String episode) {
        this.episode = episode;
    }

    @Override
    public String toString() {
        return episode;
    }
}
