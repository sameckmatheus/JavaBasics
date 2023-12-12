package VoltaQueODefuntoTaVivo;

class Moto extends Motorizado {
    String tipoMoto;

    public Moto(String modelo, int ano, String cor, String combustivel, String tipoMoto) {
        super(modelo, ano, cor, combustivel);
        this.tipoMoto = tipoMoto;
    }
}