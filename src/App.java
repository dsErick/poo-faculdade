// import aulas.Aula02;
// import aulas.Aula03;
// import aulas.Aula04.Caneta;
// import aulas.Aula06;
// import aulas.Aula07.Cliente;
// import aulas.Aula07.BDCliente;
// import aulas.Aula08;
// import aulas.Aula09.BDAluno;
import aulas.Aula13.Aluno;
import aulas.Aula13.Pessoa;
import aulas.Aula13.Professor;

// import exercicios.Exercicio01;
// import exercicios.Exercicio02.Carro;
// import exercicios.Exercicio04.Aluno;
// import exercicios.Exercicio04.BDAluno;

// import exercicios.Exercicio05.Jogador;
// import exercicios.Exercicio05.BDJogador;

// import provas.Prova1.Venda;
// import provas.Prova2;

/**
 *
 * @author Erick
 */
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Fulano");
        System.out.println(pessoa.getNome());

        Aluno aluno = new Aluno();

        aluno.setNome("João");
        aluno.setMatricula(123);
        System.out.println(aluno.getNome() + " " + aluno.getMatricula());
        aluno.fazerAniversario();
        aluno.cancelaMatricula();

        Professor professor = new Professor();

        professor.setNome("Mario");
        professor.setSalario(942);
        System.out.println(professor.getNome() + " " + professor.getSalario());
    }
}
