package fundamentos;
import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda às perguntas com 'sim' ou 'nao'.");
        
        System.out.print("Telefonou para a vítima? ");
        boolean telefonou = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Esteve no local do crime? ");
        boolean esteveNoLocal = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Mora perto da vítima? ");
        boolean moraPerto = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Devia para a vítima? ");
        boolean devia = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Já trabalhou com a vítima? ");
        boolean trabalhouComVitima = scanner.nextLine().equalsIgnoreCase("sim");

        int respostasPositivas = contarRespostasPositivas(telefonou, esteveNoLocal, moraPerto, devia, trabalhouComVitima);

        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }

    private static int contarRespostasPositivas(boolean... respostas) {
        int count = 0;
        for (boolean resposta : respostas) {
            if (resposta) {
                count++;
            }
        }
        return count;
    }
}
