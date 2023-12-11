package abstracao;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Marcelo", 20);
		Pessoa pessoa2 = new Pessoa("Rossana", 25);

		pessoa1.exibirInformacoes();
		pessoa2.exibirInformacoes();
	}
}
