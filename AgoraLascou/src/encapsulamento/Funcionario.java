package encapsulamento;

public class Funcionario {
	public String Nome;
	public String End;
	private String CPF;
	private String RG;
	private String Telefone;
	private String Email;
	private double Salario;
	private int QuantidadeFilhos;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public int getQuantidadeFilhos() {
		return QuantidadeFilhos;
	}
	public void setQuantidadeFilhos(int quantidadeFilhos) {
		QuantidadeFilhos = quantidadeFilhos;
	}
	
	
}
