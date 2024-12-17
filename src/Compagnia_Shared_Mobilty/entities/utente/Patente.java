package Compagnia_Shared_Mobilty.entities.utente;

import java.time.LocalDate;

public class Patente {

    private Integer id;
    private static Integer idCounter;
    private String numeroPatente;
    private LocalDate scadenza;
    private TipoPatente tipoPatente;
    private Utente utente;

    public Patente(String numeroPatente, LocalDate scadenza, TipoPatente tipoPatente, Utente utente) {
        this.id = ++idCounter;
        this.numeroPatente = numeroPatente;
        this.scadenza = scadenza;
        this.tipoPatente = tipoPatente;
        this.utente = utente;
    }

    public Integer getId() {
        return id;
    }
    public String getNumeroPatente() {
        return numeroPatente;
    }
    public void setNumeroPatente(String numeroPatente) {
        this.numeroPatente = numeroPatente;
    }
    public LocalDate getScadenza() {
        return scadenza;
    }
    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }
    public TipoPatente getTipoPatente() {
        return tipoPatente;
    }
    public void setTipoPatente(TipoPatente tipoPatente) {
        this.tipoPatente = tipoPatente;
    }
    public Utente getUtente() {
        return utente;
    }
    public void setUtente(Utente utente) {
        this.utente = utente;
    }


}