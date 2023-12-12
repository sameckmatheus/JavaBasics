package heranca;

import java.util.Date;

public class Funcionario extends Pessoa {
	public Funcionario(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}

	@Override
    public String getClassificacao() {
        return "Funcionário";
    }
	
	public double salario;
	public Date data_admissao;
	public String cargo;
}
