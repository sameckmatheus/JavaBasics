package heranca;

import java.util.Date;

public class infoPessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;

    public infoPessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }
}
