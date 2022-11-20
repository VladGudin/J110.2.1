package package110_2_1;

public enum Gender {
    MALE("he","his"),
    FEMALE("she", "her");
    private final String pronounHeShe;
    private final String pronounHisHer;


    private Gender (String pronounHeShe, String pronounHisHer){
        this.pronounHeShe = pronounHeShe;
        this.pronounHisHer = pronounHisHer;
    }

    public String getPronounHeShe() {
        return pronounHeShe;
    }

    public String getPronounHisHer() {
        return pronounHisHer;
    }
}
