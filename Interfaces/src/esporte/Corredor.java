package esporte;

public class Corredor extends Atleta implements Modalidade {
    private int velocidadeMedia;

    public Corredor(String nome, int idade, int velocidadeMedia) {
        super(nome, idade);
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(int velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public String praticar() {
        return "Atleta praticando Corrida!";
    }
}

