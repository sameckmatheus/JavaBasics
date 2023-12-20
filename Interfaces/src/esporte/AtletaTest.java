package esporte;

public class AtletaTest {

    public static void main(String[] args) {
        testCiclistaPratica();
        testCorredorPratica();
        testNadadorPratica();
        testTriatletaPratica();
    }

    public static void testCiclistaPratica() {
        Ciclista ciclista = new Ciclista("Carlos", 30, 50);
        String resultado = ciclista.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Ciclista", sucesso, resultado);
    }

    public static void testCorredorPratica() {
        Corredor corredor = new Corredor("Ana", 25, 15);
        String resultado = corredor.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Corredor", sucesso, resultado);
    }

    public static void testNadadorPratica() {
        Nadador nadador = new Nadador("Miguel", 28, "Livre");
        String resultado = nadador.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Nadador", sucesso, resultado);
    }

    public static void testTriatletaPratica() {
        Triatleta triatleta = new Triatleta("Julia", 35, true, true, true);
        String resultado = triatleta.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Triatleta", sucesso, resultado);
    }

    public static void exibirResultadoTeste(String testNome, boolean success, String resultado) {
        System.out.println("Resultado do teste -> " + testNome + ": " + (success ? "SUCESSO" : "FALHA"));
        System.out.println("Detalhes: " + resultado);
        System.out.println("----------------------------------------------");
    }
}
