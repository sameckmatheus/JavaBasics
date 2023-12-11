package abstracao;

public class Animal {
	public abstract class Animais {
		private String nome;

		public Animais(String nome) {
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		// Método abstrato que deve ser implementado nas subclasses
		public abstract void emitirSom();
	}
	
	public class Cachorro extends Animais {
        public Cachorro(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("O cachorro está latindo.");
        }
    }
	
	public class Gato extends Animais {
        public Gato(String nome) {
            super(nome);
        }

        @Override
        public void emitirSom() {
            System.out.println("O gato está miando.");
        }
    }
}
