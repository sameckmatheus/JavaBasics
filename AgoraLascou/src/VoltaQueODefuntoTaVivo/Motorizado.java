package VoltaQueODefuntoTaVivo;

class Motorizado extends Veiculos {
    String combustivel;

    public Motorizado(String modelo, int ano, String cor, String combustivel) {
        super(modelo, ano, cor);
        this.combustivel = combustivel;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Combustível: " + combustivel);
    }
}