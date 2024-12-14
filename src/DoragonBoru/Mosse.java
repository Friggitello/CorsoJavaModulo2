package DoragonBoru;

public class Mosse {
    private String nome;
    private Double danno;
    private Double hitChance;

    public Mosse(String nome, Double danno, Double hitChance) {
        this.nome = nome;
        this.danno = danno;
        this.hitChance = hitChance;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getDanno() {
        return danno;
    }
    public void setDanno(Double danno) {
        this.danno = danno;
    }
    public Double getHitChance() {
        return hitChance;
    }
    public void setHitChance(Double hitChance) {
        this.hitChance = hitChance;
    }



}
