// import aulas.Aula02;
// import aulas.Aula03;
// import aulas.Aula04.Caneta;
// import aulas.Aula06;
// import aulas.Aula07.Cliente;
// import aulas.Aula07.BDCliente;
// import aulas.Aula08;
import aulas.Aula09.BDAluno;

// import exercicios.Exercicio01;
// import exercicios.Exercicio02.Carro;
// import exercicios.Exercicio04.Aluno;
// import exercicios.Exercicio04.BDAluno;

// import provas.Prova1.Venda;

/**
 * 
 * @author Erick
 */
public class App {
    public static void main(String[] args) {
        BDAluno bd = new BDAluno();

        bd.cadastrarAluno();
        bd.cadastrarAluno();
        bd.cadastrarAluno();

        bd.imprimeBD();
        bd.imprimeAluno();

        bd.removeAluno();

        bd.imprimeBD();
    }
}
