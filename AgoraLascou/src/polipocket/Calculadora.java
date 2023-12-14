package polipocket;

public class Calculadora {

	// somar dois inteiros
	public int calculo(int a, int b) {
		return a + b;
	}

	// somar dois números float
	public double calcular(double a, double b) {
		return a + b;
	}

	// calcular a área de um quadrado
	public double calcular(int lado) {
		return lado * lado;
	}

	// calcular a área de um retângulo
	public double calcular(int comprimento, int largura) {
		return comprimento * largura;
	}

	// exibir o resultado
	public void exibirResultado(int resultado) {
		System.out.println("O resultado é: " + resultado);
	}

	// exibir o resultado
	public void exibirResultado(double resultado) {
		System.out.println("O resultado é: " + resultado);
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		// Exemplo de sobrecarga usando inteiros
		int somaInteiros = calculadora.calculo(5, 3);
		calculadora.exibirResultado(somaInteiros);

		// Exemplo de sobrecarga usando números de ponto flutuante
		double somaDoubles = calculadora.calcular(5.5, 3.2);
		calculadora.exibirResultado(somaDoubles);

		// Exemplo de sobrecarga para calcular a área de um quadrado
		double areaQuadrado = calculadora.calcular(4);
		calculadora.exibirResultado(areaQuadrado);

		// Exemplo de sobrecarga para calcular a área de um retângulo
		double areaRetangulo = calculadora.calculo(4, 6);
		calculadora.exibirResultado(areaRetangulo);
	}
}
