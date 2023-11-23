package entregas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class investigacaoCriminal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Responda às perguntas com 's' ou 'n'.");

            boolean telefonouParaVitima = obterResposta(scanner, "Telefonou para a vítima?");
            boolean esteveNoLocal = obterResposta(scanner, "Esteve no local do crime?");
            boolean moraPerto = obterResposta(scanner, "Mora perto da vítima?");
            boolean deviaParaVitima = obterResposta(scanner, "Devia para a vítima?");
            boolean trabalhouComVitima = obterResposta(scanner, "Já trabalhou com a vítima?");

            int respostasPositivas = contadorRespostas(telefonouParaVitima, esteveNoLocal, moraPerto, deviaParaVitima, trabalhouComVitima);

            if (respostasPositivas == 2) {
                System.out.println("Suspeita!");
            } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
                System.out.println("Cúmplice!");
            } else if (respostasPositivas == 5) {
                System.out.println("Assassino!");
            } else {
                System.out.println("Inocente!");
            }
            
        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Certifique-se de digitar 's' ou 'n'.");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro durante a execução do programa.");
            System.err.println("Detalhes do erro: " + e.getMessage());
        }
    }

    private static boolean obterResposta(Scanner scanner, String pergunta) {
        while (true) {
            System.out.print(pergunta + " ");
            String resposta = scanner.nextLine().toLowerCase();
            if (resposta.equals("s")) {
                return true;
            } else if (resposta.equals("n")) {
                return false;
            } else {
                System.out.println("Resposta inválida. Digite 's' para Sim ou 'n' para Não.");
            }
        }
    }

    private static int contadorRespostas(boolean... respostas) {
        int contador = 0;
        for (boolean resposta : respostas) {
            if (resposta) {
                contador++;
            }
        }
        return contador;
    }
}
