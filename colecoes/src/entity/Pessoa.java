package entity;

public class Pessoa {
    private String nome;
    private String nomeFull;


    public Pessoa(String nome, String nomeFull) {
        this.nome = nome;
        this.nomeFull = nomeFull;
    }

    //o metodo equals deve ser REFLEXIVO(x = T se nao for null), SIMETRICO, TRANSITIVIDADE(xyz sao = a xyz),CONSISTENTE(X sempre é X)
    @Override
    public boolean equals(Object obj) {
        if(obj == null)return  false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        Pessoa pessoa = (Pessoa) obj;
        return nome != null && nome.equals(pessoa.nome);

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
