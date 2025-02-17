public class Cliente {
    String nome;
    String email;
    String endereco;

    public Cliente(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    String Saudacao() {
        return ("Bem vindo(a) " + nome + "!");
    }
}