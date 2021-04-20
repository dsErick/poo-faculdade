package exercicios.Exercicio04;

import java.util.Scanner;

/**
 * Faça um programa em Java que implemente uma classe Aluno. A classe Aluno deve armazenar:
 *  - Nome do aluno;
 *  - Matrícula do aluno;
 *  - Coeficiente médio do aluno;
 *  - Período do aluno;
 * 
 * A classe aluno deve disponibilizar os seguintes métodos: 
 *  - Método responsável por imprimir os dados do aluno;
 *  - Método responsável por receber do teclado os dados do aluno;
 * 
    Aluno aluno = new Aluno();
    aluno.imprime();
 */
public class Aluno {
    private String nome;
    private int matricula;
    private Double coeficienteMedio = 0.0;
    private int periodo;

    /**
     * Construtor de aluno
     * 
     * Recebe do teclado os dados do aluno
     */
    public Aluno () {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o nome do aluno: ");
        this.nome = scan.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        this.matricula = scan.nextInt();

        System.out.print("Digite o coeficiente médio do aluno: ");
        this.coeficienteMedio = scan.nextDouble();

        System.out.print("Digite o período do aluno: ");
        this.periodo = scan.nextInt();
    }

    /**
     * Imprime os dados do aluno
     */
    public void imprime() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Coeficiente Médio: " + this.coeficienteMedio);
        System.out.println("Período: " + this.periodo);
        System.out.println("----------------------------------------");
    }

    /**
     * Retorna valor de matrícula 
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Retorna o valor de coeficiente médio
     */
    public Double getCoeficienteMedio() {
        return coeficienteMedio;
    }

    /**
     * Retorna o valor de período
     */
    public int getPeriodo() {
        return periodo;
    }
}
