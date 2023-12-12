package VoltaQueODefuntoTaVivo;

class NaoMotorizado extends Veiculos {
    String tipo;

    public NaoMotorizado(String modelo, int ano, String cor) {
        super(modelo, ano, cor);
        this.tipo = "Não motorizado";
    }
}