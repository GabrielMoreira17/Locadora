/**
 * Clientes.java
 * Representa um cliente da locadora.
 */
public class Clientes {
    private String nome;
    private String cpf;
    private int idade;

    public Clientes(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Idade: %d", nome, cpf, idade);
    }
}
