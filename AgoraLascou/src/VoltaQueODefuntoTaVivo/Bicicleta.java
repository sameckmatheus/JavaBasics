package VoltaQueODefuntoTaVivo;

class Bicicleta extends NaoMotorizado {
    String tipoTerreno;

    public Bicicleta(String modelo, int ano, String cor, String tipoTerreno) {
        super(modelo, ano, cor);
        this.tipoTerreno = tipoTerreno;
    }
}
