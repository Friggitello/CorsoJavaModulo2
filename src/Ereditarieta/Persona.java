package Ereditarieta;

import java.time.LocalDate;

public class Persona {

    public static Integer idCounter = 0;
    public Integer id;
    public String nome;
    public String cognome;
    public String mese;
    public LocalDate dataNascita;
    public String luogoNascita;
    public String codiceFiscale;

    //Se non definisco alcun costruttore viene aggiunto da java
    //il costruttore di default

    public Persona() {
        this.id = ++idCounter;
    }

    public Persona(String nome, String cognome) {
        this.id = ++idCounter;
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", mese='" + mese + '\'' +
                ", dataNascita=" + dataNascita +
                ", luogoNascita='" + luogoNascita + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }

    @Override //equals di base fa il == tra due oggetti,
              // che di base darebbe la locazione di memoria
              //Quindi si puo riprogrammare per definire
              //quando sono uguali due oggetti in base ai propri valori
    public boolean equals(Object obj) {
        // la prima cosa da verificare se obj è una Persona
        if (obj.getClass() != this.getClass()){
            return false;
        }
        Persona persona = (Persona) obj;
        return persona.nome.equals(this.nome) && persona.cognome.equals(this.cognome);
        //In questo caso ho definito che sono uguali solo se hanno nome e cognome uguali
        //e non si basa sugli altri attributi dell'oggetto
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}