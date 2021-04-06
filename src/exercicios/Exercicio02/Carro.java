package exercicios.Exercicio02;

/**
 * 2.Faça um programa em Java que:
 * 
 *    1. Tenha uma classe Carro que representa um carro.
 * 
 *    2. A classe Carro deve possuir as seguintes características (atributos)
 *    	- Modelo (String)
 *    	- Cor (String)
 *    	- Velocidade máxima (inteiro)
 *    	- Velocidade atual (inteiro)
 *    	- automático (booleano)	
 *    	- combustível máximo (inteiro)
 *    	- combustível atual (inteiro)
 *    	- Ligado (booleano) 
 * 
 *    3. A classe Carro deve permitir as seguinte ações (métodos)
 *    	- Ligar carro: atributo ligado deve receber verdadeiro.
 *    	- Desligar carro: atributo ligado deve receber false.
 *    	- Acelerar: Só é possível se o carro tiver combustível. Aumenta a velocidade do carro em 10 unidades. Reduz Combustível em 3 unidades.
 *    	- Desacelerar: reduz a velocidade do carro em 10 unidades.
 *    	- Freiar: a velocidade do carro recebe valor zero.
 *    	- Engatar marcha ré: não pode ser engatada se a velocidade do carro for superior a zero. Reduz Combustível em 3 unidades.
 * 
 * 
 * 
   Carro carro = new Carro("Parati", "Azul", 120, false, 10, 10);
   
   carro.acelerar();
   
   carro.ligar();
   carro.acelerar();
   carro.acelerar();
   carro.acelerar();
   
   carro.desacelerar();
   
   carro.engatarRe();
   
   carro.freiar();
   carro.engatarRe();
   
   carro.desligar();
   carro.acelerar();
 */
public class Carro {
    protected String modelo;
    protected String cor;
    protected Integer velocidade_max;
    protected Integer velocidade_atual = 0;
    protected Boolean automatico;
    protected Integer combustivel_max;
    protected Integer combustivel_atual;
    protected Boolean ligado = false;

    /**
     * Construtor de Carro
     * 
     * @param modelo String
     * @param cor String
     * @param velocidade_max Integer
     * @param automatico Boolean
     * @param combustivel_max Integer
     * @param combustivel_atual Integer
     */
    public Carro(String modelo, String cor, Integer velocidade_max, Boolean automatico, Integer combustivel_max, Integer combustivel_atual) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade_max = velocidade_max;
        this.automatico = automatico;
        this.combustivel_max = combustivel_max;
        this.combustivel_atual = combustivel_atual;
    }

    /**
     * Liga o carro
     */
    public void ligar() {
        this.ligado = true;

        System.out.println("Carro ligado.\n");
    }

    /**
     * Desliga o carro
     */
    public void desligar() {
        this.ligado = false;

        System.out.println("Carro desligado.\n");
    }

    /**
     * Acelerar: Só é possível se o carro tiver combustível. Aumenta a velocidade do carro em 10 unidades. Reduz Combustível em 3 unidades.
     */
    public void acelerar() {
        if (this.ligado && this.combustivel_atual >= 3 && this.velocidade_atual <= this.velocidade_max - 10) {
            this.velocidade_atual += 10;
            this.combustivel_atual -= 3;
            
            System.out.println("Carro acelerado. Velocidade: " + this.velocidade_atual + " - Combustível: " + this.combustivel_atual + "\n");

        } else System.out.println("Não foi possível acelerar o carro.\n");
    }

    /**
     * Desacelerar: reduz a velocidade do carro em 10 unidades.
     */
    public void desacelerar() {
        if (this.velocidade_atual < 10) this.velocidade_atual = 0;
        else this.velocidade_atual -= 10;

        System.out.println("Carro desacelerado. Velocidade: " + this.velocidade_atual + "\n");
    }

    /**
     * Freiar: a velocidade do carro recebe valor zero.
     */
    public void freiar() {
        this.velocidade_atual = 0;

        System.out.println("Carro freiado.\n");
    }

    /**
     * Engatar marcha ré: não pode ser engatada se a velocidade do carro for superior a zero. Reduz Combustível em 3 unidades.
     */
    public void engatarRe() {
        if (this.ligado && this.velocidade_atual == 0 && this.combustivel_atual >= 3) {
            this.combustivel_atual -= 3;

            System.out.println("Marcha a ré engatada.\n");

        } else System.out.println("Não foi possível engatar a marcha a ré.\n");
    }
}
