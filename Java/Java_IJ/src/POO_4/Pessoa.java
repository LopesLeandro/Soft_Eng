package POO_4;

public class Pessoa {
    String nome;
    String sobrenome;

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setNome(String value) {
        this.nome = value;
    }

    public void setSobrenome(String value) {
        this.sobrenome = value;
    }
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}