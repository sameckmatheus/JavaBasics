package fundamentos_3;

import java.util.Scanner;

public class mediaArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];
		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "ª nota: ");
			notas[i] = scanner.nextDouble();
		}

		for (double nota : notas)
			media += nota;

		media /= notas.length;

		System.out.printf("Média das notas: %.2f\n", media);
		scanner.close();
	}
}