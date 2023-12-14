package polipocket;

class Veiculo {
    // Método que pode ser sobrescrito pelas subclasses
    public void acelerar() {
        System.out.println("Veículo acelerando...");
    }
}

class Carro extends Veiculo {
    // Sobrescrevendo o método acelerar da classe pai (Veiculo)
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    // Novo método específico da classe Carro
    public void abrirPorta() {
        System.out.println("Porta do carro aberta.");
    }
}

public class ExemploSobrescrita {
    public static void main(String[] args) {
        // Criando uma instância da classe Carro
        Carro meuCarro = new Carro();

        // Chamando o método acelerar da classe Carro (sobrescrito)
        meuCarro.acelerar();

        // Chamando o método da classe pai (Veiculo) usando a referência da classe Carro
        Veiculo veiculo = meuCarro;
        veiculo.acelerar();

        // Não é possível chamar o método abrirPorta usando a referência da classe pai
        // veiculo.abrirPorta(); // Isso geraria um erro de compilação

        // No entanto, podemos fazer um downcast para acessar o método específico da classe Carro
        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            carro.abrirPorta();
        }
    }
}
