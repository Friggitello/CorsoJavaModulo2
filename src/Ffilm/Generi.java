package Ffilm;

public enum Generi {
    ANIMAZIONE("Animazione"), COMMEDIA("Commedia"), WESTERN("Western"),
    SPORT("Sport"), MYSTERY("Mystery"), FANTASY("Fantasy"),
    FANTASCIENZA("Fantascienza"), GANGSTER("Gangster"),
    DRAMMA("Dramma"), EPICO("Epico");

    private String genere;

    Generi(String genere){this.genere = genere;}

    public String getGenere() {
        return genere;
    }
}
