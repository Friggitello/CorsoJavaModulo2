package Compagnia_Shared_Mobilty.entities.veicolo;

public class Monopattino extends Veicolo{

    private Double livelloBatteria;

    public Monopattino(Double prezzo) {
        super(prezzo);
        this.livelloBatteria = 1d;
    }

    public Double getLivelloBatteria() {
        return livelloBatteria;
    }
    public void setLivelloBatteria(Double livelloBatteria) {
        this.livelloBatteria = livelloBatteria;
    }

    @Override
    public Boolean needCasco() {
        return true;
    }


}
