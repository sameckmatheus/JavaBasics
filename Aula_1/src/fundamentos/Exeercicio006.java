package fundamentos;

public class Exeercicio006 {
	public static void main(String[] args) {
		int idade = 15;
		boolean amigoDoDono = true;
		
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("Não pode entar.");
		} else {
			System.out.println("Pode entrar.");
		}
	}
}
