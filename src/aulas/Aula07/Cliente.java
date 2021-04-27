package aulas.Aula07;

import java.util.Scanner;

/**
    Cliente cliente = new Cliente();

    cliente.imprime();

    System.out.println(cliente);
 */
public class Cliente {
    private int cpf;
    private String nome;
    private String endereco;

    /**
     * Construtor de Cliente
     */
    public Cliente() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o CPF do cliente: ");
        cpf = scan.nextInt();
        scan.nextLine(); // Limpa o cachê

        System.out.println("Digite o nome do cliente: ");
        nome = scan.nextLine();
        
        System.out.println("Digite o endereço do cliente: ");
        endereco = scan.nextLine();
    }

    /**
     * Imprime as informações do cliente
     */
    public void imprime() {
        System.out.println("----------------------------------------");
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("----------------------------------------");
    }
}
