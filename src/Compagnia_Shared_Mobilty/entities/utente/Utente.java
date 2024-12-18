package Compagnia_Shared_Mobilty.entities.utente;

import Compagnia_Shared_Mobilty.admin.Admin;
import Compagnia_Shared_Mobilty.entities.noleggio.Noleggio;
import Compagnia_Shared_Mobilty.entities.veicolo.Veicolo;
import Compagnia_Shared_Mobilty.exceptions.VeicoloNotFoundException;
import Compagnia_Shared_Mobilty.validators.Validator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Utente {
    //Attributi
    private Integer id;
    private static Integer idCounter;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String codiceFiscale;
    private Patente patente;
    private Boolean hasCasco;
    private Double credito;

    //Costruttori
    public Utente(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, Boolean hasCasco) {
        Validator.requireNotBlank(nome);
        Validator.requireNotBlank(cognome);
        Validator.requireDateBefore(dataNascita, LocalDate.now());
        this.id = ++idCounter;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.hasCasco = hasCasco;
        this.credito = 0d;
    }

    public Utente(String nome, String cognome, LocalDate dataNascita, String codiceFiscale, Patente patente, Boolean hasCasco) {
        this(nome, cognome, dataNascita, codiceFiscale, hasCasco);
        this.patente = patente;
        this.credito = 0d;
    }

    public Utente() {
        this.id = ++idCounter;
    }

    //Getter e setter
    public Integer getId() {
        return id;
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

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public Boolean getHasCasco() {
        return hasCasco;
    }

    public void setHasCasco(Boolean hasCasco) {
        this.hasCasco = hasCasco;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public void addCredito(Double credito) {
        if (credito > 0) {
            this.credito += credito;
        } else System.out.println("Il credito da aggiungere non puo essere <= 0");
    }

    public Double subCredito(Double credito) {
        if (credito > this.credito) {
            Double result = credito - this.credito;
            this.credito = 0d;
            return result;
        } else {
            this.credito -= credito;
            return 0d;
        }
    }

    public Noleggio attivaNoleggio(Integer id_veicolo) throws VeicoloNotFoundException {
        //check se esiste id_veicolo
        Veicolo veicolo = Admin.getVeicoloById(id_veicolo);
        if (veicolo == null) throw new VeicoloNotFoundException("Il veicolo con id " + id_veicolo + " non esiste");

    }

    public Noleggio attivaNoleggio(Integer id_veicolo, LocalDateTime start) {
        return null;
    }
}
