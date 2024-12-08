package esercizio_casa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DittaRiparazioni {
    public Object[] gruppoTecnici = new Object[5];
    public Object[] gruppoRiparazioni = new Object[5];
    int counterRiparazione = 0;
    int counterTecnico = 0;

    public void newRiparazione(String inputVia, int inputPriorita){
        Riparazione r1 = new Riparazione(inputVia,inputPriorita);
        gruppoRiparazioni[counterRiparazione] = r1;
        counterRiparazione++;
    }

    public void newTecnico(String nome){
        Tecnico t1 = new Tecnico(nome);
        gruppoTecnici[counterTecnico] = t1;
        counterTecnico++;
    }

    public void showRiparazioni(){
        System.out.println(Arrays.toString(gruppoRiparazioni));
    }

    public void showMaggiorePriorita(Riparazione prova){
        int priorita = prova.getId();
        int numeroMaggiorePriorita = 0;

        for (int i = 0; i < gruppoRiparazioni.length; i++){
            int prioritaOggetto = prova.getPriorita();
            if (priorita < prioritaOggetto){
                numeroMaggiorePriorita = prova.getId();
            }else continue;
        }
        System.out.println(prova.getIndirizzo());
    }



    public void assegnazioneTecnico(){

        counterTecnico--;
        counterRiparazione--;
    }

    public void showTecnici(){
        System.out.println(Arrays.toString(gruppoTecnici));
    }
}
