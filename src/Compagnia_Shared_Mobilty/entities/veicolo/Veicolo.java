package Compagnia_Shared_Mobilty.entities.veicolo;

import Compagnia_Shared_Mobilty.admin.Admin;
import Compagnia_Shared_Mobilty.database.Database;
import Compagnia_Shared_Mobilty.entities.noleggio.Noleggio;
import Compagnia_Shared_Mobilty.validators.Validator;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.List;

public abstract class Veicolo implements Casco{

    protected Integer id;
    protected static Integer idCounter;
    protected Double prezzo;
    protected Coordinata coordinata;


    public Veicolo(Double prezzo) {
        Validator.requireGreaterThan(prezzo, 0d);
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
        List<Noleggio> myNoleggi = Admin.getNoleggiById(this.id);
        for (Noleggio n : myNoleggi){
            if (n.isNoleggioAttivo(time)){
                return false;
            }
        }
        return true;
    }

}
