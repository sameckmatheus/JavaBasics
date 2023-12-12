package VoltaQueODefuntoTaVivo;

public class DisnoveNissan {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", 2022, "Verde", "Asfalto");
        Carro carro = new Carro("Toyota Corolla", 2023, "Prata", "Gasolina", 4);
        Moto moto = new Moto("Honda CB500", 2023, "Preto", "Gasolina", "Esportiva");

        bicicleta.exibirInformacoes();
        System.out.println("\n");
        
        carro.exibirInformacoes();
        System.out.println("\n");
        
        moto.exibirInformacoes();
    }
}