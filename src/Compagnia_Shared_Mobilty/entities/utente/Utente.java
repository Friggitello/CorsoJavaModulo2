package Compagnia_Shared_Mobilty.entities.utente;

import Compagnia_Shared_Mobilty.admin.Admin;
import Compagnia_Shared_Mobilty.database.Database;
import Compagnia_Shared_Mobilty.entities.noleggio.Noleggio;
import Compagnia_Shared_Mobilty.entities.veicolo.Veicolo;
import Compagnia_Shared_Mobilty.exceptions.VeicoloNotAvailableException;
import Compagnia_Shared_Mobilty.exceptions.VeicoloNotFoundException;
import Compagnia_Shared_Mobilty.validators.Validator;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
        Validator.matchingPattern(codiceFiscale,"^[A-Z]{6}[0-9]{8}[A-Z]{2}[0-9]{2}[A-Z0-9]{3}$\n");
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

    public Noleggio attivaNoleggio(Integer id_veicolo) throws VeicoloNotFoundException, VeicoloNotAvailableException {
        return attivaNoleggio(id_veicolo, LocalDateTime.now());
    }

    public Noleggio attivaNoleggio(Integer id_veicolo, LocalDateTime start) throws VeicoloNotFoundException, VeicoloNotAvailableException {
        //check se esiste id_veicolo
        Veicolo veicolo = Admin.getVeicoloById(id_veicolo);
        if (veicolo == null) throw new VeicoloNotFoundException("Il veicolo con id " + id_veicolo + " non esiste");
        if (!veicolo.isDisponibile(start)){
            throw new VeicoloNotAvailableException("Veicolo con id " + id_veicolo + " non disponibile!");
        }
        Noleggio myNoleggio = new Noleggio(veicolo,this);
        Admin.insertNoleggio(myNoleggio);
        return myNoleggio;
    }

    public Double terminaNoleggio(Noleggio noleggio){
        noleggio.setEnd(LocalDateTime.now());
        Long minutes = Duration.between(noleggio.getStart(), noleggio.getEnd()).toMinutes();
        return minutes*noleggio.getVeicolo().getPrezzo();
    }

    public List<Veicolo> getVeicoliDisponibili(LocalDateTime start){
        List<Veicolo> veicoliDisponibili = new ArrayList<>();
        List<Veicolo> allVeicoli = Admin.getAllVeicoli();
        for (Veicolo v:allVeicoli){
            if (v.isDisponibile(start)){
                veicoliDisponibili.add(v);
            }
        }
        return veicoliDisponibili;
    }

}
