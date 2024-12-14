package DoragonBoru;

import java.util.ArrayList;
import java.util.List;

public class Personaggio{

    private String nome;
    private Double puntiVita;
    private List<Mosse> mosse;
    private Mosse attaccoFisico;
    private Double forzaFisica;
    private Double probSchivata;
    private Double resistenzaFisica;

    public Personaggio(String nome, Double puntiVita,
                       List<Mosse> mosse, Double forzaFisica,
                       Double probSchivata, Double resistenzaFisica) {
        this.attaccoFisico = new Mosse("Attacco Base",forzaFisica,0.50);
        this.mosse = mosse;
        mosse.add(attaccoFisico);
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.mosse = mosse;
        this.forzaFisica = forzaFisica;
        this.probSchivata = probSchivata;
        this.resistenzaFisica = resistenzaFisica;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPuntiVita() {
        return puntiVita;
    }
    public void setPuntiVita(Double puntiVita) {
        this.puntiVita = puntiVita;
    }
    public List<Mosse> getMosse() {
        return mosse;
    }
    public void setMosse(List<Mosse> mosse) {
        this.mosse = mosse;
    }
    public Double getForzaFisica() {
        return forzaFisica;
    }
    public void setForzaFisica(Double forzaFisica) {
        this.forzaFisica = forzaFisica;
    }
    public Double getProbSchivata() {
        return probSchivata;
    }
    public void setProbSchivata(Double probSchivata) {
        this.probSchivata = probSchivata;
    }
    public Double getResistenzaFisica() {
        return resistenzaFisica;
    }
    public void setResistenzaFisica(Double resistenzaFisica) {
        this.resistenzaFisica = resistenzaFisica;
    }



}
