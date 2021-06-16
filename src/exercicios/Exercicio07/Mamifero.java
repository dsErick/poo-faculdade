package exercicios.Exercicio07;

/**
 * - Classe mamífero: deve herdar da classe animal e conter como atributo cor do pelo (com os métodos gets e sets respectivos).
 *      Além disso, deve conter o método produzir leite. Na implementação do método produzir
 *      leite deve-se imprimir na tela "Mamífero produzindo leite".
 */
public class Mamifero extends Animal {
    private String corPelo;

    public void produzirLeite() {
        System.out.println("Mamífero produzindo leite");
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
