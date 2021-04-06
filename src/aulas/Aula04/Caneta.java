package aulas.Aula04;


/**
 * Classe Caneta
 * 
 * @link    https://www.youtube.com/watch?v=sQmKOUXrOfw
 * 
 * Caneta caneta1 = new Caneta("Azul"); // Armazena um endereço de memória
 *
 *      caneta1.imprimeEstado();
 *      caneta1.escrever("Hello, World!");
 *
 *      caneta1.setFechada(false);
 *      caneta1.escrever("Hello, World!");
 *      caneta1.imprimeEstado();
 *
 *      Caneta caneta2 = new Caneta("Vermelha");
 *      caneta2.imprimeEstado();
 *
 *      caneta1 = caneta2; // Faz uma cópia de caneta2, e agora os dois apontam para o mesmo espaço na memória
 *
 *      caneta1.setFechada(false);
 *      caneta1.imprimeEstado();
 *      caneta2.imprimeEstado();
 */
public class Caneta {
    private int carga = 100;
    private boolean fechada = true;
    private String cor;
    
    /**
     * Construtor da classe
     * 
     * @params  String cor
     */
    public Caneta(String cor) {
        this.cor = cor;
    }
    
    /**
     * Imprime os valores das propriedades da instancia
     * 
     * @return  void
     */
    public void imprimeEstado() {
        System.out.println(this.cor + ", " + this.fechada + ", " + this.carga);
    }

    /**
     * Caso não esteja fechada, escreve o que foi solicitado
     * 
     * @return  void
     */
    public void escrever(String texto) {
        if (this.fechada) System.out.println("Não é possível escrever");
        else {
            System.out.println("Escrevendo: " + texto);
            this.carga -= 5;
        }
    }

    /**
     * Altera o valor de fechado para o que for solicitado
     * 
     * @return  void
     */
    public void setFechada(boolean fechada) {
        this.fechada = fechada;
    }

}
