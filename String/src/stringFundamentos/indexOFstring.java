package stringFundamentos;

public class indexOFstring {
	public static void main(String[] args) {
		String str = "Hello World World2";
		int pos = str.indexOf("l");
		int lpos = str.lastIndexOf ("l"); 

		System.out.println(pos);
		System.out.println(lpos);
	}
}

/*
 * Podemos buscar a posição de caracteres ou substrings em uma String através
 * dos métodos indexOf e lastIndexOf. Estes métodos retornam o índice do
 * caractere que está sendo procurado ou índice do início da substring buscada.
 * 
 * String str = “Hello World World2”; 
 * int pos = str.indexOf (“l”);
 * 
 * 2 retorna o índice da primeira ocorrência de “l”.
 * 
 * int pos = str.lastIndexOf (“l”); 
 * 15 retorna o índice da última ocorrência de
 * ”l”.
 * 
 */
