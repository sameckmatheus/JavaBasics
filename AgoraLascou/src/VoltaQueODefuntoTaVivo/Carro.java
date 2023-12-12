package VoltaQueODefuntoTaVivo;


class Carro extends Motorizado {
    int numPortas;

    public Carro(String modelo, int ano, String cor, String combustivel, int numPortas) {
        super(modelo, ano, cor, combustivel);
        this.numPortas = numPortas;
    }
}

