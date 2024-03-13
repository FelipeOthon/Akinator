public class Animal {
    private String nome;
    private boolean temPelo;
    private boolean carnivoro;
    // Adicione outras características aqui conforme necessário

    public Animal(String nome, boolean temPelo, boolean carnivoro) {
        this.nome = nome;
        this.temPelo = temPelo;
        this.carnivoro = carnivoro;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public boolean temPelo() {
        return temPelo;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }
}
