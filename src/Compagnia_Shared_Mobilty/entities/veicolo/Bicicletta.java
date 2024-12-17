package Compagnia_Shared_Mobilty.entities.veicolo;

public class Bicicletta extends Veicolo{
    public Bicicletta(Double prezzo) {
        super(prezzo);
    }

    @Override
    public Boolean needCasco() {
        return true;
    }
}
