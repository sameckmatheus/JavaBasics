package acabou;

public class TestAtleta {
    public static void main(String[] args) {
        testCiclistaPratica();
        testCorredorPratica();
        testNadadorPratica();
        testTriatletaPratica();
    }

    public static void testCiclistaPratica() {
        Ciclista ciclista = new Triatleta("Carlos", 30, "Livre", 15, 50);
        String resultado = ciclista.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Ciclista", sucesso, resultado);
    }

    public static void testCorredorPratica() {
        Corredor corredor = new Triatleta("Ana", 25, "Livre", 15, 50);
        String resultado = corredor.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Corredor", sucesso, resultado);
    }

    public static void testNadadorPratica() {
        Nadador nadador = new Triatleta("Miguel", 28, "Livre", 15, 50);
        String resultado = nadador.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Nadador", sucesso, resultado);
    }

    public static void testTriatletaPratica() {
        Triatleta triatleta = new Triatleta("Julia", 35, "Livre", 15, 50);
        String resultado = triatleta.praticar();
        boolean sucesso = resultado.contains("praticando");
        exibirResultadoTeste("Triatleta", sucesso, resultado);
    }

    public static void exibirResultadoTeste(String testNome, boolean successo, String resultado) {
        System.out.println("Resultado do teste -> " + testNome + ": " + (successo ? "SUCESSO" : "FALHA"));
        System.out.println("Detalhes: " + resultado);
        System.out.println("----------------------------------------------");
    }
}

