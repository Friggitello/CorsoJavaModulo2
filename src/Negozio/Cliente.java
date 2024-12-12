package Negozio;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    private Integer id;
    private static Integer idCounter = 0;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private Integer puntiRegalo;

    public Cliente(String nome, String cognome, LocalDate dataNascita) {
        this.id = ++idCounter;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.puntiRegalo = 0;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Integer getPuntiRegalo() {
        return puntiRegalo;
    }

    public void setPuntiRegalo(Integer puntiRegalo) {
        this.puntiRegalo = puntiRegalo;
    }

    public void addPuntiRegalo(Integer puntiRegalo){
        this.puntiRegalo += puntiRegalo;
    }

    public void subPuntiRegalo(Integer puntiRegalo){
        this.puntiRegalo -= puntiRegalo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    public Double acquistaProdotto(Prodotto prodotto, Integer quantita){
        if (!Negozio.isPresentProdotto(prodotto,quantita)){
            return 0.0;
        }
        prodotto.setQuantita(prodotto.getQuantita() - quantita);
        Scanner scanne = new Scanner(System.in);
        System.out.println("Premi 1 per pagare tutto insieme, premi 2 per pagare a rate");
        int nextValue = scanne.nextInt();
        if (nextValue == 1){
            this.puntiRegalo += (int) ((prodotto.getPrezzo()*quantita)/10);
            return prodotto.getPrezzo()*quantita;
        } else if (nextValue == 2) {
            System.out.println("In quanti mesi vuoi pagare?");
            int numMesi = scanne.nextInt();
            this.puntiRegalo += (int) ((prodotto.getPrezzo()*quantita)/10);
            return Negozio.ammontareRata(prodotto.getPrezzo()*quantita, numMesi);
        }
        else {
            System.out.println("Paga tutto insieme");
            this.puntiRegalo += (int) ((prodotto.getPrezzo()*quantita)/10);
            return prodotto.getPrezzo()*quantita;
        }

    }

    public Double acquistaProdotti(List<Prodotto> prodotti, List<Integer> quantita){
        if (prodotti.size() != quantita.size()){
            System.out.println("Array di prodotti e quantita hanno lunghezza diversa");
            return  0.0;
        }

        for (int i = 0; i < prodotti.size(); i++) {
            if (!Negozio.isPresentProdotto(prodotti.get(i), quantita.get(i))){
                return 0.0;
            }
        }

        double  prezzoTot = 0.0;

        for (int i = 0; i < prodotti.size(); i++) {
            prezzoTot += acquistaProdotto(prodotti.get(i), quantita.get(i));
        }
        Scanner scanne = new Scanner(System.in);
        System.out.println("Premi 1 per pagare tutto insieme, premi 2 per pagare a rate");
        int nextValue = scanne.nextInt();
        if (nextValue == 1){
            return prezzoTot;
        } else if (nextValue == 2) {
            System.out.println("In quanti mesi vuoi pagare?");
            int numMesi = scanne.nextInt();
            return Negozio.ammontareRata(prezzoTot, numMesi);
        }
        else {
            System.out.println("Paga tutto insieme");
            return prezzoTot;
        }
    }



}
