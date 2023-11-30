package fundamentos_3;

import java.util.Scanner;

public class alimentandoArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] ArrayA = new int[10];
		int[] ArrayB = new int[10];
		int[] ArrayC = new int[10];
		int[] ArrayD = new int[10];

		// ARRAY A
		for (int i = 0; i < ArrayA.length; i++) {
			System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
			ArrayA[i] = scanner.nextInt();
		}
		System.out.println("=========================================");
		System.out.print("ArrayA: ");
		for (int i = 0; i < ArrayA.length; i++) {
			System.out.print(ArrayA[i] + " ");
		}
		System.out.println("=========================================");
		
		// ARRAY B
		System.out.println();
		for (int i = 0; i < ArrayB.length; i++) {
			System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
			ArrayB[i] = scanner.nextInt();
		}
		System.out.println("=========================================");
		System.out.print("ArrayB: ");
		for (int i = 0; i < ArrayB.length; i++) {
			System.out.print(ArrayB[i] + " ");
		}
		System.out.println("=========================================");
		
		// ARRAY C
		System.out.println();
		for (int i = 0; i < ArrayC.length; i++) {
			System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
			ArrayC[i] = scanner.nextInt();
		}
		System.out.println("=========================================");
		System.out.print("ArrayC: ");
		for (int i = 0; i < ArrayC.length; i++) {
			System.out.print(ArrayC[i] + " ");
		}
		System.out.println("=========================================");

		// ARRAY D
		System.out.println();
		for (int i = 0; i < ArrayD.length; i++) {
			System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
			ArrayD[i] = scanner.nextInt();
		}
		System.out.println("=========================================");
		System.out.print("ArrayD: ");
		for (int i = 0; i < ArrayD.length; i++) {
			System.out.print(ArrayD[i] + " ");
		}
		System.out.println("=========================================");
		scanner.close();
	}
}

/*
 * Exercício 1: Para cada conjunto de valores abaixo, escreva o código Java,
 * usando laço(s), que preencha um array com os valores: 
 * a) 10 9 8 7 6 5 4 3 2 1
 * b) 0 1 4 9 16 25 36 49 64 81 100
 * c) 1 2 3 4 5 10 20 30 40 50 
 * d) 3 4 7 12 19 28 39 52 67 84
 */
