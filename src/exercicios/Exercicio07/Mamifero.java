package exercicios.Exercicio07;

/**
 * - Classe mamífero: deve herdar da classe animal e conter como atributo cor do pelo (com os métodos gets e sets respectivos).
 *      Além disso, deve conter o método produzir leite. Na implementação do método produzir
 *      leite deve-se imprimir na tela "Mamífero produzindo leite".
 * 
    Mamifero mamifero = new Mamifero();
    mamifero.setPeso(500);
    mamifero.setIdade(13);
    mamifero.setCorPelo("cinza");

    System.out.println(String.format("\n\nMamifero\nPeso: %s\nIdade: %s\nPelo: %s", mamifero.getPeso(), mamifero.getIdade(), mamifero.getCorPelo()));
    mamifero.alimentar();
    mamifero.locomover();
    mamifero.produzirLeite();
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
