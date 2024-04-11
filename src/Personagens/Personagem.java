package Personagens;

public class Personagem {
    private String nome;
    private String arma;
    private String casa;

    public Personagem(String nome, String arma, String casa){
        this.nome = nome;
        this.arma = arma;
        this.casa = casa;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the arma
     */
    public String getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(String arma) {
        this.arma = arma;
    }

    /**
     * @return String return the casa
     */
    public String getCasa() {
        return casa;
    }

    /**
     * @param casa the casa to set
     */
    public void setCasa(String casa) {
        this.casa = casa;
    }

}
