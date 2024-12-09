package esempio;

public enum Mese {
    GENNAIO(1 ), FEBBRAIO(2), MARZO(3);

    private int numeroMese;

    Mese(int numeroMese){
        this.numeroMese = numeroMese;
    }

    public int getNumeroMese() {
        return numeroMese;
    }


}
