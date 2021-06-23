package exercicios.Exercicio07;

/**
 * - Classe cachorro: deve herdar da classe mamífero _e conter como atributos cor do pelo (com os métodos gets e sets respectivos)_.
 *      Além disso deve conter o método latir. Na implementação do método latir
 *      deve-se imprimir na tela "Cachorro está latindo".
 * 
    Cachorro cachorro = new Cachorro();
    cachorro.setPeso(50.5);
    cachorro.setIdade(2);
    cachorro.setCorPelo("Caramelo");

    System.out.println(String.format("Cachorro\nPeso: %s\nIdade: %s\nPelo: %s", cachorro.getPeso(), cachorro.getIdade(), cachorro.getCorPelo()));
    cachorro.alimentar();
    cachorro.locomover();
    cachorro.produzirLeite();
    cachorro.latir();
 */
public class Cachorro extends Mamifero {
    public void latir() {
        System.out.println("Cachorro está latindo");
    }
}
