package Negozio;

import java.awt.*;
import java.util.UUID;

public class Prodotto {
    private Integer id;
    private static Integer idCounter = 0;
    private String codiceProdotto;
    private String nome;
    private Double prezzo;
    private Integer quantita;
    private TipoProdotto tipoProdotto;

    public Prodotto(String nome, Double prezzo, TipoProdotto tipoProdotto) {
        this.id = ++idCounter;
        this.codiceProdotto = UUID.randomUUID().toString();
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = 0;
        this.tipoProdotto = tipoProdotto;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public static Integer getIdCounter() {
        return idCounter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public TipoProdotto getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }



}
