package DoragonBoru;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Combattimento combattimento = new Combattimento();
        // Mosse di Goku
        Mosse Kamehameha = new Mosse("Kamehameha", 200d, 0.70);
        Mosse Kaioken = new Mosse("Kaioken", 300d, 0.90);
        Mosse Genkidama = new Mosse("Sfera Genkidama", 500d, 0.90);
        Mosse Impatto = new Mosse("Impatto Meteoritico", 150d, 0.60);
        List<Mosse> mosseGoku = new ArrayList<>();
        mosseGoku.add(Kamehameha);
        mosseGoku.add(Kaioken);
        mosseGoku.add(Genkidama);
        mosseGoku.add(Impatto);

        // Mosse di Vegeta
        Mosse BigBangAttack = new Mosse("Big Bang Attack", 300d, 0.60);
        Mosse FinalFlash = new Mosse("Final Flash", 400d, 0.50);
        Mosse GalickGun = new Mosse("Galick Gun", 250d, 0.80);
        Mosse AtomicBlast = new Mosse("Atomic Blast", 350d, 0.55);
        List<Mosse> mosseVegeta = new ArrayList<>();
        mosseVegeta.add(BigBangAttack);
        mosseVegeta.add(FinalFlash);
        mosseVegeta.add(GalickGun);
        mosseVegeta.add(AtomicBlast);

        // Mosse di Piccolo
        Mosse SpecialBeamCannon = new Mosse("Special Beam Cannon", 300d, 0.75);
        Mosse HellzoneGrenade = new Mosse("Hellzone Grenade", 200d, 0.85);
        Mosse LightGrenade = new Mosse("Light Grenade", 150d, 0.90);
        Mosse DemonWave = new Mosse("Demon Wave", 250d, 0.65);
        List<Mosse> mossePiccolo = new ArrayList<>();
        mossePiccolo.add(SpecialBeamCannon);
        mossePiccolo.add(HellzoneGrenade);
        mossePiccolo.add(LightGrenade);
        mossePiccolo.add(DemonWave);

        // Mosse di Cell
        Mosse DeathBeam = new Mosse("Death Beam", 250d, 0.75);
        Mosse SolarKamehameha = new Mosse("Solar Kamehameha", 450d, 0.40);
        Mosse Regeneration = new Mosse("Regeneration", 100d, 1.00);
        Mosse Absorption = new Mosse("Absorption", 200d, 0.50);
        List<Mosse> mosseCell = new ArrayList<>();
        mosseCell.add(DeathBeam);
        mosseCell.add(SolarKamehameha);
        mosseCell.add(Regeneration);
        mosseCell.add(Absorption);

        // Mosse di Freezer
        Mosse DeathBall = new Mosse("Death Ball", 400d, 0.50);
        Mosse TailWhip = new Mosse("Tail Whip", 150d, 0.80);
        Mosse DeathStorm = new Mosse("Death Storm", 350d, 0.60);
        Mosse NovaStrike = new Mosse("Nova Strike", 300d, 0.55);
        List<Mosse> mosseFreezer = new ArrayList<>();
        mosseFreezer.add(DeathBall);
        mosseFreezer.add(TailWhip);
        mosseFreezer.add(DeathStorm);
        mosseFreezer.add(NovaStrike);

        // Mosse di Broly
        Mosse OmegaBlaster = new Mosse("Omega Blaster", 500d, 0.30);
        Mosse EraserCannon = new Mosse("Eraser Cannon", 400d, 0.45);
        Mosse GiganticRoar = new Mosse("Gigantic Roar", 450d, 0.40);
        Mosse SavageAssault = new Mosse("Savage Assault", 300d, 0.65);
        List<Mosse> mosseBroly = new ArrayList<>();
        mosseBroly.add(OmegaBlaster);
        mosseBroly.add(EraserCannon);
        mosseBroly.add(GiganticRoar);
        mosseBroly.add(SavageAssault);

        // Mosse di Majin Bu
        Mosse ChocolateBeam = new Mosse("Chocolate Beam", 150d, 0.95);
        Mosse PlanetBurst = new Mosse("Planet Burst", 500d, 0.30);
        Mosse AngryExplosion = new Mosse("Angry Explosion", 350d, 0.50);
        Mosse MysticBallAttack = new Mosse("Mystic Ball Attack", 200d, 0.70);
        List<Mosse> mosseMajinBu = new ArrayList<>();
        mosseMajinBu.add(ChocolateBeam);
        mosseMajinBu.add(PlanetBurst);
        mosseMajinBu.add(AngryExplosion);
        mosseMajinBu.add(MysticBallAttack);

        // Mosse di Trunks
        Mosse BurningAttack = new Mosse("Burning Attack", 300d, 0.65);
        Mosse ShiningSword = new Mosse("Shining Sword", 250d, 0.75);
        Mosse HeatDomeAttack = new Mosse("Heat Dome Attack", 400d, 0.50);
        Mosse EnergyWave = new Mosse("Energy Wave", 200d, 0.80);
        List<Mosse> mosseTrunks = new ArrayList<>();
        mosseTrunks.add(BurningAttack);
        mosseTrunks.add(ShiningSword);
        mosseTrunks.add(HeatDomeAttack);
        mosseTrunks.add(EnergyWave);

        // Creazione dei personaggi
        Personaggio p1 = new Personaggio("Goku", 1000d, mosseGoku, 100d, 0.6, 0.4);
        Personaggio p2 = new Personaggio("Vegeta", 1100d, mosseVegeta, 120d, 0.5, 0.5);
        Personaggio p3 = new Personaggio("Piccolo", 900d, mossePiccolo, 110d, 0.7, 0.4);
        Personaggio p4 = new Personaggio("Cell", 1200d, mosseCell, 130d, 0.6, 0.3);
        Personaggio p5 = new Personaggio("Freezer", 1150d, mosseFreezer, 125d, 0.5, 0.5);
        Personaggio p6 = new Personaggio("Broly", 1300d, mosseBroly, 140d, 0.4, 0.6);
        Personaggio p7 = new Personaggio("Majin Bu", 1250d, mosseMajinBu, 135d, 0.5, 0.5);
        Personaggio p8 = new Personaggio("Trunks", 1050d, mosseTrunks, 115d, 0.6, 0.4);
        Torneo torneoTenkaichi = new Torneo();
        torneoTenkaichi.torneo(p1,p2,p3,p4,p5,p6,p7,p8);
    }
}
