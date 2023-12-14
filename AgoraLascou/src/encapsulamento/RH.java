package encapsulamento;

public class RH {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.Nome = "Robson";
		f1.End = "Rua do desespero, 23";
		f1.setCPF("16416416489");
		f1.setRG("1234567");
		f1.setTelefone("909089896");
		f1.setEmail("exemplo@exemplo.com");
		f1.setQuantidadeFilhos(4);
		f1.setSalario(6000);

		String nome = f1.Nome;
		String end = f1.End;
		double salario = f1.getSalario();
		String cpf = f1.getCPF();
		String rg = f1.getRG();
		String telefone = f1.getTelefone();
		String email = f1.getEmail();
		int filhos = f1.getQuantidadeFilhos();

		System.out.println(nome);
		System.out.println(end);
		System.out.println(salario);
		System.out.println(cpf);
		System.out.println(rg);
		System.out.println(telefone);
		System.out.println(email);
		System.out.println(filhos);
	}
}
