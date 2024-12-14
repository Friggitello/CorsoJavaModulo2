package DoragonBoru;

import java.util.Random;

public class Combattimento {
    //    <>
    public static Double rollColpo(){
        Double x = Math.random();
        Double x2 = Math.round(x * 100) / 100.0;
        return x2;
    }

    public void combattimento(Personaggio p1, Personaggio p2){
        Double bufferVitaP1 = p1.getPuntiVita();
        Double bufferVitaP2 = p2.getPuntiVita();
        while (p1.getPuntiVita()>=0 || p2.getPuntiVita()>=0){
            Random random = new Random();
            int mossaScelta = random.nextInt(0,2);
            Double schivataP2 = p1.getMosse().get(mossaScelta).getHitChance()*p2.getProbSchivata();
            System.out.println(p1.getNome() + " attacca " + p2.getNome() +
                    " con " + p1.getMosse().get(mossaScelta).getNome() + "!");
            if (rollColpo() < schivataP2) {
                System.out.println("Vita di " + p2.getNome() + ": " + p2.getPuntiVita() +
                        " -> " + (p2.getPuntiVita() - p1.getMosse().get(mossaScelta).getDanno() * p2.getResistenzaFisica()));
                p2.setPuntiVita(p2.getPuntiVita() - p1.getMosse().get(mossaScelta).getDanno() * p2.getResistenzaFisica());

            }else System.out.println(p2.getNome() + " schiva il colpo!");
            if (p2.getPuntiVita() <= 0) break;
            mossaScelta = random.nextInt(0,2);
            Double schivataP1 = p2.getMosse().get(mossaScelta).getHitChance()*p1.getProbSchivata();
            System.out.println(p2.getNome() + " attacca " + p1.getNome() +
                    " con " + p2.getMosse().get(mossaScelta).getNome() + "!");
            if (rollColpo() < schivataP1) {
                System.out.println("Vita di " + p1.getNome() + ": " + p1.getPuntiVita() +
                        " -> " + (p1.getPuntiVita() - p2.getMosse().get(mossaScelta).getDanno() * p1.getResistenzaFisica()));
                p1.setPuntiVita(p1.getPuntiVita() - p2.getMosse().get(mossaScelta).getDanno() * p1.getResistenzaFisica());
            }else System.out.println(p1.getNome() + " schiva il colpo!");
            if (p1.getPuntiVita() <= 0) break;
        }
        if (p1.getPuntiVita()<=0 ){
            System.out.println("Vince " + p2.getNome());
        } else
            System.out.println("Vince " + p1.getNome());
    }
    public Personaggio combattimentoTorneo(Personaggio p1, Personaggio p2){
        Double bufferVitaP1 = p1.getPuntiVita();
        Double bufferVitaP2 = p2.getPuntiVita();
        while (p1.getPuntiVita()>=0 || p2.getPuntiVita()>=0){
            Random random = new Random();
            int mossaScelta = random.nextInt(0,2);
            Double schivataP2 = p1.getMosse().get(mossaScelta).getHitChance()*p2.getProbSchivata();
            System.out.println(p1.getNome() + " attacca " + p2.getNome() +
                    " con " + p1.getMosse().get(mossaScelta).getNome() + "!");
            if (rollColpo() < schivataP2) {
                System.out.println("Vita di " + p2.getNome() + ": " + p2.getPuntiVita() +
                        " -> " + (p2.getPuntiVita() - p1.getMosse().get(mossaScelta).getDanno() * p2.getResistenzaFisica()));
                p2.setPuntiVita(p2.getPuntiVita() - p1.getMosse().get(mossaScelta).getDanno() * p2.getResistenzaFisica());

            }else System.out.println(p2.getNome() + " schiva il colpo!");
            if (p2.getPuntiVita() <= 0) break;
            mossaScelta = random.nextInt(0,2);
            Double schivataP1 = p2.getMosse().get(mossaScelta).getHitChance()*p1.getProbSchivata();
            System.out.println(p2.getNome() + " attacca " + p1.getNome() +
                    " con " + p2.getMosse().get(mossaScelta).getNome() + "!");
            if (rollColpo() < schivataP1) {
                System.out.println("Vita di " + p1.getNome() + ": " + p1.getPuntiVita() +
                        " -> " + (p1.getPuntiVita() - p2.getMosse().get(mossaScelta).getDanno() * p1.getResistenzaFisica()));
                p1.setPuntiVita(p1.getPuntiVita() - p2.getMosse().get(mossaScelta).getDanno() * p1.getResistenzaFisica());
            }else System.out.println(p1.getNome() + " schiva il colpo!");
            if (p1.getPuntiVita() <= 0) break;
        }
        if (p1.getPuntiVita()<=0 ){
            System.out.println("Vince " + p2.getNome());
            return p2;
        } else {
            System.out.println("Vince " + p1.getNome());
            return p1;
        }

    }
}
