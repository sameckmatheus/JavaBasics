package heranca;

import java.util.Date;

public class Aluno extends Pessoa {
	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}

	@Override
    public String getClassificacao() {
        return "Aluno";
    }
	
	public String matricula;
}
