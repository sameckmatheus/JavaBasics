package heranca;

import java.util.Date;

public class Professor extends Pessoa {
	public Professor(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	
	@Override
    public String getClassificacao() {
        return "Professor";
    }

	public double salario;
	public String disciplina;
}
