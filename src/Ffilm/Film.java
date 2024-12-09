package Ffilm;

import java.time.LocalDate;

public class Film {
    private String nome;
    private int dataUscita;
    private Generi genere;
    private String regista;
    private boolean disponibile;

    public Film(String nome, int dataUscita, Generi genere, String regista) {
        this.nome = nome;
        this.dataUscita = dataUscita;
        this.genere = genere;
        this.regista = regista;
        this.disponibile = true;
    }

    public Film(String nome, Generi genere) {
        this.nome = nome;
        this.genere = genere;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataUscita() {
        return dataUscita;
    }

    public void setDataUscita(int dataUscita) {
        this.dataUscita = dataUscita;
    }

    public Generi getGenere() {
        return genere;
    }

    public void setGenere(Generi genere) {
        this.genere = genere;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public void visionaFilm(){
        if (!disponibile){
            System.out.printf("Il film non è disponibile\n");
        }
        this.disponibile = false;
    }

    public void terminaVisione(){
        this.disponibile = true;
    }

    public String infoFilm(){
        return "Film{" +
                "nome='" + nome + '\'' +
                ", dataUscita=" + dataUscita +
                ", genere=" + genere +
                ", regista='" + regista + '\'' +
                ", disponibile=" + disponibile +
                '}';
        }

    @Override
    public String toString() {
        return "Film{" +
                "nome='" + nome + '\'' +
                ", dataUscita=" + dataUscita +
                ", genere=" + genere +
                ", regista='" + regista + '\'' +
                ", disponibile=" + disponibile +
                '}';
    }
}