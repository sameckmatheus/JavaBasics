package entregas;

import java.util.Scanner;

public class verificadorSexo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite 'F' ou 'M': ");
            String resposta = entrada.nextLine().toLowerCase();

            if (resposta.equals("f")) {
                System.out.println("FEMININO.");
            } else if (resposta.equals("m")) {
                System.out.println("MASCULINO.");
            } else {
                System.out.println("OPÇÃO INVÁLIDA.");
            }
        }
    }
}
