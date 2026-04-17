package entity;

public class Pessoa {
    private String nome;
    private String nomeFull;


    public Pessoa(String nome, String nomeFull) {
        this.nome = nome;
        this.nomeFull = nomeFull;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFull() {
        return nomeFull;
    }

    public void setNomeFull(String nomeFull) {
        this.nomeFull = nomeFull;
    }
}
