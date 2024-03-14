public class Animal {
    private final String nome;
    private final boolean temPelo;
    private final boolean carnivoro;
    private final boolean capazDeNadar;
    private final boolean isGrande;
    private final boolean viveEmFloresta;
    private final boolean temPelagemManchada;
    private final boolean eTerritorial;
    private final boolean eNoturno;
    private final boolean eSolitario;
    private final boolean temGarrasAfiadas;
    private final boolean eRapido;
    private final boolean temHabitosMigratorios;
    private final boolean ePredador;
    private final boolean eSocial;
    private final boolean eHerbivoro;

    public Animal(String nome, boolean temPelo, boolean carnivoro, boolean capazDeNadar, boolean isGrande, boolean viveEmFloresta, boolean temPelagemManchada,
                  boolean eTerritorial, boolean eNoturno, boolean eSolitario, boolean temGarrasAfiadas, boolean eRapido, boolean temHabitosMigratorios,
                  boolean ePredador, boolean eSocial, boolean eHerbivoro) {
        this.nome = nome;
        this.temPelo = temPelo;
        this.carnivoro = carnivoro;
        this.capazDeNadar = capazDeNadar;
        this.isGrande = isGrande;
        this.viveEmFloresta = viveEmFloresta;
        this.temPelagemManchada = temPelagemManchada;
        this.eTerritorial = eTerritorial;
        this.eNoturno = eNoturno;
        this.eSolitario = eSolitario;
        this.temGarrasAfiadas = temGarrasAfiadas;
        this.eRapido = eRapido;
        this.temHabitosMigratorios = temHabitosMigratorios;
        this.ePredador = ePredador;
        this.eSocial = eSocial;
        this.eHerbivoro = eHerbivoro;
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

    public boolean isCapazDeNadar() {
        return capazDeNadar;
    }

    public boolean isGrande() {
        return isGrande;
    }

    public boolean viveEmFloresta() {
        return viveEmFloresta;
    }

    public boolean temPelagemManchada() {
        return temPelagemManchada;
    }

    public boolean eTerritorial() {
        return eTerritorial;
    }

    public boolean eNoturno() {
        return eNoturno;
    }

    public boolean eSolitario() {
        return eSolitario;
    }

    public boolean temGarrasAfiadas() {
        return temGarrasAfiadas;
    }

    public boolean eRapido() {
        return eRapido;
    }

    public boolean temHabitosMigratorios() {
        return temHabitosMigratorios;
    }

    public boolean ePredador() {
        return ePredador;
    }

    public boolean eSocial() {
        return eSocial;
    }

    public boolean eHerbivoro() {
        return eHerbivoro;
    }
}
