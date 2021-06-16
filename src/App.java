// import aulas.Aula02;
// import aulas.Aula03;
// import aulas.Aula04.Caneta;
// import aulas.Aula06;
// import aulas.Aula07.Cliente;
// import aulas.Aula07.BDCliente;
// import aulas.Aula08;
// import aulas.Aula09.BDAluno;
// import aulas.Aula13.Aluno;
// import aulas.Aula13.Pessoa;
// import aulas.Aula13.Professor;

// import exercicios.Exercicio01;
// import exercicios.Exercicio02.Carro;
// import exercicios.Exercicio04.Aluno;
// import exercicios.Exercicio04.BDAluno;
// import exercicios.Exercicio05.Jogador;
// import exercicios.Exercicio05.BDJogador;
import exercicios.Exercicio07.Animal;
import exercicios.Exercicio07.Cachorro;
import exercicios.Exercicio07.Mamifero;

// import provas.Prova1.Venda;
// import provas.Prova2;

/**
 *
 * @author Erick
 */
public class App {
    public static void main(String[] args) {
        // Animal animal = new Animal();

        Cachorro cachorro = new Cachorro();
        cachorro.setPeso(50.5);
        cachorro.setIdade(2);
        cachorro.setCorPelo("Caramelo");

        System.out.println(String.format("Cachorro\nPeso: %s\nIdade: %s\nPelo: %s", cachorro.getPeso(), cachorro.getIdade(), cachorro.getCorPelo()));
        cachorro.alimentar();
        cachorro.locomover();
        cachorro.produzirLeite();
        cachorro.latir();

        Mamifero mamifero = new Mamifero();
        mamifero.setPeso(500);
        mamifero.setIdade(13);
        mamifero.setCorPelo("cinza");

        System.out.println(String.format("\n\nMamifero\nPeso: %s\nIdade: %s\nPelo: %s", mamifero.getPeso(), mamifero.getIdade(), mamifero.getCorPelo()));
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.produzirLeite();
    }
}
