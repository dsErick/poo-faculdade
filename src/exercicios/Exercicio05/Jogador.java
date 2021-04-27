package exercicios.Exercicio05;

import java.util.Scanner;

/**
 * 26-04-2021
 * 
 * 1.Faça um programa em Java que implemente uma classe que represente um jogador de futebol. A classe jogador deve armazenar:
 *      - Identificador do jogador
 *      - Nome do jogado;
 *      - Time do jogador;
 *      - Quantidade de gols do jogado;
 *      - Valor de mercado do jogador;
 *
 * A classe jogador deve disponibilizar os seguintes métodos:
 *      - Método responsável por imprimir os dados do jogador;
 *      - Método responsável por receber do teclado os dados do jogador;
 */
public class Jogador {
    private int id;
    private String nome;
    private String time;
    private int gols;
    private double valorMercado;

    /**
     * Construtor de Jogador
     * 
     * @param id {@code int}
     */
    public Jogador(int id) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        this.id = id;
        
        System.out.println("\n---------- Cadastrar jogador ----------");
        System.out.print("Informe o nome: ");
        nome = scan.nextLine();
        
        System.out.print("Informe o time: ");
        time = scan.nextLine();

        System.out.print("Informe a quantidade de gols: ");
        gols = scan.nextInt();

        System.out.print("Informe o valor de mercado: ");
        valorMercado = scan.nextDouble();

        System.out.println("--------------------------------------");
    }

    /**
     * Imprime os dados do jogador
     */
    public void imprime() {
        System.out.println(
            "\n---------- Dados do jogador ----------" +
            "\n| Id: " + id +
            "\n| Nome: " + nome +
            "\n| Time: " + time +
            "\n| Quantidade de gols: " + gols +
            "\n| Valor de mercado: " + valorMercado +
            "\n--------------------------------------"
        );
    }

    /// Getters

    /**
     * Retorna o id do jogador
     * 
     * @return {@code int}
     */
    public int getId() {
        return id;
    }
    
    /**
     * Retorna o nome do jogador
     * 
     * @return {@code String}
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna a quantidade de gols do jogador
     * 
     * @return {@code int}
     */
    public int getGols() {
        return gols;
    }

    /**
     * Retorna o valor de mercado do jogador
     * 
     * @return {@code double}
     */
    public double getValorMercado() {
        return valorMercado;
    }
}
