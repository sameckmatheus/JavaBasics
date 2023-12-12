package heranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Escola {
    public static void main(String[] args) {
    	Calendar dataAtual = Calendar.getInstance();
        Date dataNascimento = dataAtual.getTime();

        Funcionario funcionario = new Funcionario("João Funcionário", "123.456.789-00", dataNascimento);
        funcionario.salario = 5000.0;
        funcionario.data_admissao = parseDate("2020-01-15");
        funcionario.cargo = "Desenvolvedor";

        Aluno aluno = new Aluno("Maria Aluna", "987.654.321-00", dataNascimento);
        aluno.matricula = "2023001";

        Professor professor = new Professor("Carlos Professor", "555.111.222-33", dataNascimento);
        professor.salario = 8000.0;
        professor.disciplina = "Matemática";

        exibirInformacoesComClassificacao(funcionario);
        exibirInformacoesComClassificacao(aluno);
        exibirInformacoesComClassificacao(professor);
    }

    private static void exibirInformacoesComClassificacao(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("CPF: " + pessoa.cpf);
        System.out.println("Data de Nascimento: " + pessoa.data_nascimento);
        System.out.println("Classificação: " + pessoa.getClassificacao());
        System.out.println();
    }

    private static Date parseDate(String dateString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
