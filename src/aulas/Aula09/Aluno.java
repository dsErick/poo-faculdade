package aulas.Aula09;

import java.util.Scanner;

/**
 * Aula 09 Parte 2, Prática - 19-04-2021
 * @link https://www.youtube.com/watch?v=OwjFog1jkbY
 */
public class Aluno {
    public String nome;
    public Integer matricula;
    public Double coeficiente;
    
    public Aluno() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------");

        System.out.print("Informe o nome: ");
        nome = scan.nextLine();

        System.out.print("Informe a matrícula: ");
        matricula = scan.nextInt();

        System.out.print("Informe o coeficiente: ");
        coeficiente = scan.nextDouble();

        System.out.println("--------------------------------\n");
    }

    public void imprime() {
        System.out.println("Nome: " + nome + "; Matrícula: " + matricula + "; Coeficiente: " + coeficiente);
    }
}
