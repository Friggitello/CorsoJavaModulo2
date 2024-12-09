package esercizio_casa;

import javax.swing.text.EditorKit;
import javax.xml.stream.events.DTD;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DittaRiparazioni dittaRiparazioni1 = new DittaRiparazioni();
        dittaRiparazioni1.showRiparazioni();
        dittaRiparazioni1.newRiparazione("Via Gian",1);
        dittaRiparazioni1.newRiparazione("Via Sbron",6);
        dittaRiparazioni1.showRiparazioni();
        dittaRiparazioni1.newRiparazione("Via Cum", 2);
        dittaRiparazioni1.showRiparazioni();
        dittaRiparazioni1.newTecnico("Franco");
        dittaRiparazioni1.showTecnici();
        dittaRiparazioni1.newTecnico("Lorenzo");
        dittaRiparazioni1.showTecnici();
    }
}
