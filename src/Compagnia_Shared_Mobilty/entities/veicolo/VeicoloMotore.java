package Compagnia_Shared_Mobilty.entities.veicolo;

import Compagnia_Shared_Mobilty.entities.utente.TipoPatente;

public abstract class VeicoloMotore extends Veicolo {

    protected String targa;
    protected TipoPatente tipoPatente;
    protected Double livelloCarburante; //valore tra 0 ed 1 che rappresenta la percentuale di serbatoio piena

    public VeicoloMotore(Double prezzo, TipoPatente tipoPatente) {
        super(prezzo);
        this.tipoPatente = tipoPatente;
        this.livelloCarburante = 1d;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public TipoPatente getTipoPatente() {
        return tipoPatente;
    }

    public void setTipoPatente(TipoPatente tipoPatente) {
        this.tipoPatente = tipoPatente;
    }

    public Double getLivelloCarburante() {
        return livelloCarburante;
    }

    public void setLivelloCarburante(Double livelloCarburante) {
        this.livelloCarburante = livelloCarburante;
    }
}
