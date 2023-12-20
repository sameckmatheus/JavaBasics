package acabou;

public class Triatleta implements Nadador, Corredor, Ciclista {
    private String nome;
    private int idade;
    private String estiloNado;
    private int velocidadeMedia;
    private int distanciaPercurso;

    public Triatleta(String nome, int idade, String estiloNado, int velocidadeMedia, int distanciaPercurso) {
        this.nome = nome;
        this.idade = idade;
        this.estiloNado = estiloNado;
        this.velocidadeMedia = velocidadeMedia;
        this.distanciaPercurso = distanciaPercurso;
    }

    @Override
    public String praticar() {
        return "Triatleta praticando!";
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getEstiloNado() {
        return estiloNado;
    }

    @Override
    public int getVelocidadeMedia() {
        return velocidadeMedia;
    }

    @Override
    public int getDistanciaPercurso() {
        return distanciaPercurso;
    }
}
