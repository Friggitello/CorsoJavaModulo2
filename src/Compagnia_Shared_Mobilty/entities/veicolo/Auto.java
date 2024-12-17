package Compagnia_Shared_Mobilty.entities.veicolo;

import Compagnia_Shared_Mobilty.entities.utente.TipoPatente;

public class Auto extends VeicoloMotore{

    public Auto(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo, tipoPatente);
    }


    @Override
    public Boolean needCasco() {
        return false;
    }


}
