package fundamentos;
import java.util.Scanner;

public class verificadorNumericoPn {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			
			double resp = entrada.nextDouble();
			System.out.println(resp < 0 ? "O número é negativo." : "O número é positivo.");
		}
	}
}
