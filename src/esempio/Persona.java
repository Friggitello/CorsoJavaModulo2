package esempio;

import java.time.LocalDate;

public class Persona {

    public String nome;
    public String cognome;
    public LocalDate dataNascita;
    public String luogoNascita;
    public String codiceFiscale;

    //Se non definisco alcun costruttore viene aggiunto da java
    //il costruttore di default

    public Persona(){}

    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", luogoNascita='" + luogoNascita + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }
}
