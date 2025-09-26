/**
 * Carros.java
 * Representa um carro disponível para locação.
 */
public class Carros {
    private String modelo;
    private int ano;
    private String cor;
    private boolean disponivel;

    // Construtor
    public Carros(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.disponivel = true; // por padrão, quando cadastrado, está disponível
    }

    // Getters e setters (encapsulamento)
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    @Override
    public String toString() {
        return String.format("Modelo: %s | Ano: %d | Cor: %s | Disponível: %s",
                modelo, ano, cor, disponivel ? "Sim" : "Não");
    }
}