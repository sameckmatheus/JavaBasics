package esporte;

public class Triatleta extends Atleta implements Modalidade {
	private boolean ciclista;
	private boolean corredor;
	private boolean nadador;
	
	public Triatleta (String nome, int idade, boolean ciclista, boolean corredor, boolean nadador) {
		super(nome, idade);
		this.ciclista = ciclista;
		this.corredor = corredor;
		this.nadador = nadador;
	}

	public boolean isCiclista() {
		return ciclista;
	}

	public void setCiclista(boolean ciclista) {
		this.ciclista = ciclista;
	}

	public boolean isCorredor() {
		return corredor;
	}

	public void setCorredor(boolean corredor) {
		this.corredor = corredor;
	}

	public boolean isNadador() {
		return nadador;
	}

	public void setNadador(boolean nadador) {
		this.nadador = nadador;
	}
	
	public String praticar() {
		return "Atleta praticando Triatlo!";
	}
}
