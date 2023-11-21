package fundamentos;

public class Exercicio004 {
	public static void main(String[] args) {
		int a = 3;
		
		System.out.println(a % 2 == 0 ? ++a : a++);
		System.out.println(a);
	}
}
