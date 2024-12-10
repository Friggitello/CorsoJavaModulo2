package Ereditarieta;

public class Professore extends Persona{
    private int anniServizio;
    private String corsoInsegnato;
    public Professore(String nome, String cognome) {
        super(nome, cognome);
        this.anniServizio = 0;
        this.corsoInsegnato = "";
    }

    public Professore(String nome, String cognome, String corsoInsegnato, int anniServizio) {
        super(nome, cognome);
        this.corsoInsegnato = corsoInsegnato;
        this.anniServizio = anniServizio;
    }

    public int getAnniServizio() {
        return anniServizio;
    }

    public void setAnniServizio(int anniServizio) {
        this.anniServizio = anniServizio;
    }

    public String getCorsoInsegnato() {
        return corsoInsegnato;
    }

    public void setCorsoInsegnato(String corsoInsegnato) {
        this.corsoInsegnato = corsoInsegnato;
    }

    public void inserisciVoto(){
        System.out.println("PROMOSSO");
    }

}
