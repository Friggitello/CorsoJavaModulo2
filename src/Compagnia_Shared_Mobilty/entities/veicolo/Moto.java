package Compagnia_Shared_Mobilty.entities.veicolo;

import Compagnia_Shared_Mobilty.entities.utente.TipoPatente;

public class Moto extends VeicoloMotore{

    public Moto(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo, tipoPatente);
    }

    @Override
    public Boolean needCasco() {
        return true;
    }
}
