// import aulas.Aula02;
// import aulas.Aula03;
// import aulas.Aula04.Caneta;
// import aulas.Aula06;
// import aulas.Aula07.Cliente;
// import aulas.Aula07.BDCliente;

// import exercicios.Exercicio01;
// import exercicios.Exercicio02.Carro;
import exercicios.Exercicio04.Aluno;
import exercicios.Exercicio04.BDAluno;

// import provas.Prova1.Venda;

/**
 * 
 * @author Erick
 */
public class App {
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList
        // https://www.w3schools.com/java/java_arraylist.asp

        // Aluno aluno = new Aluno();
        // aluno.imprime();

        BDAluno alunos = new BDAluno(3);

        alunos.cadastrarAluno();
        alunos.cadastrarAluno();
        alunos.cadastrarAluno();

        alunos.imprimeAluno(1);

        alunos.imprimeAlunoComMaiorCoeficiente();

        alunos.imprimeAlunosDoPeriodo(7);
    }
}
