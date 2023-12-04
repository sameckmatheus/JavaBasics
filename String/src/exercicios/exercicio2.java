package exercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(texto);
        int numeroPalavras = tokenizer.countTokens();
	
		
		System.out.println("Número de palavras: " + numeroPalavras);
        
        scanner.close();
	}
}

/*
 * Faça um programa que, a partir de um texto digitado pelo usuário, conte o
 * número de palavras (palavra é definida por qualquer sequência de caracteres
 * delimitada por espaços em branco) e exiba o resultado.
 */
