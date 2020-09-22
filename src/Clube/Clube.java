package Clube;

public class Clube {

    final String nome;
    final int idadeMorte;
    final boolean eDoClube;
    final String generoMusical;


    public Clube(String nome, int idadeMorte, boolean eDoClube, String generoMusical) {
        this.nome = nome;
        this.idadeMorte = idadeMorte;
        this.eDoClube = eDoClube;
        this.generoMusical = generoMusical;
    }

    @Override
    public String toString() {
        return "Clube{" +
                "nome='" + nome + '\'' +
                ", idadeMorte=" + idadeMorte +
                ", eDoClube=" + eDoClube +
                ", generoMusical='" + generoMusical + '\'' +
                '}';
    }
}
