// import aulas.Aula02;
// import aulas.Aula03;
// import aulas.Aula04.Caneta;
// import aulas.Aula06;
// import aulas.Aula07.Cliente;
// import aulas.Aula07.BDCliente;
// import aulas.Aula08;
// import aulas.Aula09.BDAluno;

// import exercicios.Exercicio01;
// import exercicios.Exercicio02.Carro;
// import exercicios.Exercicio04.Aluno;
// import exercicios.Exercicio04.BDAluno;

// import exercicios.Exercicio05.Jogador;
import exercicios.Exercicio05.BDJogador;

// import provas.Prova1.Venda;

/**
 * 
 * @author Erick
 */
public class App {
    public static void main(String[] args) {
        BDJogador bd = new BDJogador();

        bd.cadastrarJogador();
        bd.cadastrarJogador();
        bd.cadastrarJogador();

        bd.imprimeJogador(5);
        bd.imprimeJogador(1);

        System.out.println("\n--------------------------------------\n");
        bd.jogadorComMaisGols();
        
        System.out.println("\n--------------------------------------\n");
        bd.jogadorComGols(5);
        
        System.out.println("\n--------------------------------------\n");
        bd.valorMedio();
    }
}
