package Compagnia_Shared_Mobilty.entities.noleggio;

import Compagnia_Shared_Mobilty.entities.utente.Utente;
import Compagnia_Shared_Mobilty.entities.veicolo.Veicolo;

import java.time.LocalDateTime;

public class Noleggio {

    private Integer id;
    private static Integer idCounter;
    private final Veicolo veicolo;
    private final Utente utente;
    private LocalDateTime start;
    private LocalDateTime end;

    public Noleggio(Veicolo veicolo, Utente utente) {
        this.id = ++idCounter;
        this.veicolo = veicolo;
        this.utente = utente;
        this.start = LocalDateTime.now();
    }

    public Noleggio(Veicolo veicolo, Utente utente, LocalDateTime start) {
        this.id = ++idCounter;
        this.veicolo = veicolo;
        this.utente = utente;
        this.start = start;
    }

    public Integer getId() {
        return id;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public Utente getUtente() {
        return utente;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        if (this.start.isBefore(LocalDateTime.now())){
            this.start = start;
        }
        else System.out.println("Noleggio gia iniziato, non puoi modificare la data di inizio");
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }


}
