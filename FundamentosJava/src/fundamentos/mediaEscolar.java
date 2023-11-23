package fundamentos;
import java.util.Scanner;

public class mediaEscolar {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite a primeira nota: ");
			double nota1 = entrada.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			double nota2 = entrada.nextDouble();
			
			double media = (nota1 + nota2) / 2;
			
			if ((media < 7) && (media > 4)) {
				System.out.println("Sua média, é: " + media);
				System.out.println("RECUPERAÇÃO");
			} else if (media <= 4) {
				System.out.println("Sua média, é: " + media);
				System.out.println("REPROVADO");
			} else {
				System.out.println("Sua média, é: " + media);
				System.out.println("APROVADO");
			}
		}
	}
}
