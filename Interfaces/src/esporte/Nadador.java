package esporte;

public class Nadador extends Atleta implements Modalidade {
    private String estiloNado;

    public Nadador(String nome, int idade, String estiloNado) {
        super(nome, idade);
        this.estiloNado = estiloNado;
    }

    public String getEstiloNado() {
        return estiloNado;
    }

    public void setEstiloNado(String estiloNado) {
        this.estiloNado = estiloNado;
    }

    @Override
    public String praticar() {
        return "Atleta praticando Natação!";
    }
}
