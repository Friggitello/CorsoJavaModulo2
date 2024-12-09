package utils;

import Ditta.Riparazione;
import Ditta.Tecnico;

public class ArrayUtils {

    public static Tecnico[] addTecnico(Tecnico[] arrayTecnici, Tecnico tecnico){
        Tecnico[] newArrayTecnici = new Tecnico[arrayTecnici.length+1];
        for (int i= 0; i < arrayTecnici.length; i++){
            newArrayTecnici[i] = arrayTecnici[i];
        }
        newArrayTecnici[newArrayTecnici.length-1] = tecnico;
        return newArrayTecnici;
    }

    public static Riparazione[] addRiparazione(Riparazione[] arrayRiparazioni, Riparazione riparazione){
        Riparazione[] newArrayRiparazioni = new Riparazione[arrayRiparazioni.length+1];
        for (int i= 0; i < arrayRiparazioni.length; i++){
            newArrayRiparazioni[i] = arrayRiparazioni[i];
        }
        newArrayRiparazioni[newArrayRiparazioni.length-1] = riparazione;
        return newArrayRiparazioni;
    }



}
