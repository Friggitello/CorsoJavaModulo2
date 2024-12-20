package Compagnia_Shared_Mobilty.entities.noleggio;

import Compagnia_Shared_Mobilty.entities.utente.Utente;
import Compagnia_Shared_Mobilty.entities.veicolo.Veicolo;
import Compagnia_Shared_Mobilty.validators.Validator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Noleggio {

    private Integer id;
    private static Integer idCounter = 0;
    private final Veicolo veicolo;
    private final Utente utente;
    private LocalDateTime start;
    private LocalDateTime end;

    public Noleggio(Veicolo veicolo, Utente utente) {
        Validator.requireNotNull(veicolo);
        Validator.requireNotNull(utente);
        this.id = ++idCounter;
        this.veicolo = veicolo;
        this.utente = utente;
        this.start = LocalDateTime.now();
    }

    public Noleggio(Veicolo veicolo, Utente utente, LocalDateTime start) {
        Validator.requireNotNull(veicolo);
        Validator.requireNotNull(utente);
        Validator.requireDateTimeAfter(start,LocalDateTime.now());
        this.id = ++idCounter;
        this.veicolo = veicolo;
        this.utente = utente;
        if (start.isBefore(LocalDateTime.now())) throw new IllegalArgumentException("La data non puo essere nel passato");
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

    public Boolean isNoleggioAttivo(LocalDateTime time){
        return this.start.isBefore(time) && this.end == null;
    }

    @Override
    public String toString() {
        return "Noleggio{" +
                "id=" + id +
                ", veicolo=" + veicolo +
                ", utente=" + utente +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
