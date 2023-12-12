package VoltaQueODefuntoTaVivo;

class Veiculos {
    String modelo;
    int ano;
    String cor;

    public Veiculos(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor);
    }
}
