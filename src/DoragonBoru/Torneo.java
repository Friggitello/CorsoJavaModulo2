package DoragonBoru;

public class Torneo extends Combattimento {
    public void torneo(Personaggio p1,Personaggio p2, Personaggio p3, Personaggio p4
                       ,Personaggio p5,Personaggio p6, Personaggio p7, Personaggio p8){
        Personaggio p12 = combattimentoTorneo(p1,p2);
        Personaggio p34 = combattimentoTorneo(p3,p4);
        Personaggio p56 = combattimentoTorneo(p5,p6);
        Personaggio p78 = combattimentoTorneo(p7,p8);
        Personaggio p1234 = combattimentoTorneo(p12,p34);
        Personaggio p5678 = combattimentoTorneo(p56,p78);
        Personaggio vincitore = combattimentoTorneo(p1234, p5678);
        System.out.println(p1.getNome() + " contro " + p2.getNome() + " - Vincitore " + p12.getNome());
        System.out.println(p3.getNome() + " contro " + p4.getNome() + " - Vincitore " + p34.getNome());
        System.out.println(p5.getNome() + " contro " + p6.getNome() + " - Vincitore " + p56.getNome());
        System.out.println(p7.getNome() + " contro " + p8.getNome() + " - Vincitore " + p78.getNome());
        System.out.println(p12.getNome() + " contro " + p34.getNome() + " - Vincitore " + p1234.getNome());
        System.out.println(p56.getNome() + " contro " + p78.getNome() + " - Vincitore " + p5678.getNome());
        System.out.println("Finale " + p1234.getNome() + " contro " + p5678.getNome());
        System.out.println("Il vincitore del torneo è " + vincitore.getNome());
    }
}
