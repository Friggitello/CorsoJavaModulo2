package Compagnia_Shared_Mobilty.entities.veicolo;

import Compagnia_Shared_Mobilty.entities.utente.TipoPatente;

public class Furgoncino extends VeicoloMotore{

    public Furgoncino(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo, tipoPatente);
    }

    @Override
    public Boolean needCasco() {
        return false;
    }
}
