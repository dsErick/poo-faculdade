package exercicios;

import javax.swing.JOptionPane;

public class Exercicio01 {
    /**
     * ------------------------------------------------------
     * Construa um programa que leia um número n e imprima n
     * linhas no formato a seguir (n=6, no exemplo):
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 1 2 3 4 5 6
     * ------------------------------------------------------
     * 
     * Aula no dia 03-03-2021
     * 
     * @return  void
     */
    public static void questao1() {
        String result = "";

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for(int i = 1; i <= num; i++) {

            for(int j = 1; j <= i; j++) result += j + " ";

            result += "\n";
        }

        JOptionPane.showMessageDialog(null, result, "Questão 1", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * ------------------------------------------------------
     * Codifique um programa que, dados dois valores inteiros
     * entre 1 e 10, calcule e imprima a média dos números,
     * caso a soma deles seja menor que 8.
     * ------------------------------------------------------
     * 
     * @return  void
     */
    public static void questao2() {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 10: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número entre 1 e 10: "));


        if (num1 >= 1 && num1 <= 10 && num2 >=  1 && num2 <= 10) {
            if ((num1 + num2) < 8) {
                JOptionPane.showMessageDialog(null, "A média dos números é " + (num1 + num2) / 2, "Números válidos", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(null, "A soma dos números não pode ser maior que 8", "Números inválidos", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Os números precisam ser entre 1 e 10", "Números inválidos", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * ------------------------------------------------------
     * Escrever um programa que leia um número inteiro n e
     * calcule a tabuada de n. Mostre a tabuada na forma:
     * 1∗n =
     * 2∗n 
     * ..
     * n∗n =__
     * ------------------------------------------------------
     * 
     * @return  void
     */
    public static void questao3() {
        String result = "";
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for(int i = 1; i <= num; i++) {
            result += i + " * " + num + " = " + i * num + "\n";
        }

        JOptionPane.showMessageDialog(null, result, "Questão 3 - Tabuada", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * ------------------------------------------------------
     * Faça um programa que leia uma quantidade não
     * determinada de números positivos. Calcule a quantidade
     * de números pares e ímpares, a média de valores pares e
     * a média geral dos números lidos. O número que
     * encerrará a leitura será zero
     * ------------------------------------------------------
     * 
     * @return  void
     */
    public static void questao4() {
        int num = 1,
            total = 0,
            totalCount = 0,
            pares = 0,
            paresCount = 0,
            imparesCount = 0;

        while(num != 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor (0 interrompe): "));

            total += num;
            totalCount++;
            
            if (num % 2 == 0) {
                pares += num;
                paresCount++;

            } else {
                imparesCount++;
            }
        }

        String result = "Soma total: " + total +
                        "\nQuantidade números no total: " + totalCount +
                        "\nQuantidade de números pares: " + paresCount +
                        "\nQuantidade de números ímpares: " + imparesCount +
                        "\nA média de todos os valores : " + total / totalCount +
                        "\nA média de valores pares: " + pares / paresCount;

        JOptionPane.showMessageDialog(null, result);
    }
}
