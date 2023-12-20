package esporte;

public class Ciclista extends Atleta implements Modalidade {
	private int TamanhoPercurso;

    public Ciclista(String nome, int idade, int TamanhoPercurso) {
        super(nome, idade);
        this.setTamanhoPercurso(TamanhoPercurso);
    }

	public int getTamanhoPercurso() {
		return TamanhoPercurso;
	}

	public void setTamanhoPercurso(int TamanhoPercurso) {
		this.TamanhoPercurso = TamanhoPercurso;
	}
	
	@Override
	public String praticar() {
		return "Atleta praticando Ciclismo!";
	}
}
