package lambdaexample;

public class Impiegato {
    private Integer id;
    private static Integer idCounter = 0;
    private String nome;
    private String cognome;
    private String genere;
    private Integer pagaMensile;

    public Impiegato(String nome, String cognome, String genere, Integer pagaMensile) {
        this.id = ++idCounter;
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.pagaMensile = pagaMensile;
    }

    @Override
    public String toString() {
        return "Impiegato #" + id + " " + nome + " " + cognome + " (" + genere + ", " + pagaMensile + ")";
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

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Integer getPagaMensile() {
        return pagaMensile;
    }

    public void setPagaMensile(Integer pagaMensile) {
        this.pagaMensile = pagaMensile;
    }
}
