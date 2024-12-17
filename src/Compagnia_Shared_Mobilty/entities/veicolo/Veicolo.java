package Compagnia_Shared_Mobilty.entities.veicolo;

import java.time.LocalDateTime;

public abstract class Veicolo implements Casco{

    protected Integer id;
    protected static Integer idCounter;
    protected Double prezzo;
    protected Coordinata coordinata;

    public Veicolo(Double prezzo) {
        this.id = ++idCounter;
        this.prezzo = prezzo;
        this.coordinata = new Coordinata(0d,0d);
    }

    public Integer getId() {
        return id;
    }
    public Double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
    public Coordinata getCoordinata() {
        return coordinata;
    }
    public void setCoordinata(Coordinata coordinata) {
        this.coordinata = coordinata;
    }

    public Boolean isDisponibile(LocalDateTime time){
        return false;
    }

}
