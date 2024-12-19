package Compagnia_Shared_Mobilty.entities.veicolo;

import Compagnia_Shared_Mobilty.entities.utente.TipoPatente;

public class Furgoncino extends VeicoloMotore{

    public Furgoncino(Double prezzo, TipoPatente tipoPatente,String targa) {
        super(prezzo, tipoPatente, targa);
    }

    @Override
    public Boolean needCasco() {
        return false;
    }
}
