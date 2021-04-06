package aulas;

import javax.swing.JOptionPane;

public class Aula02 {
    /**
     * Mostra um diálogo na tela com "Hello, World!"
     * 
     * Aula no dia 01-03-2021
     * 
     * @return void
     */
    public static void helloWorld(String[] args) {
        // String $greeting = "Hello, World!";
        // System.out.print($greeting);
        // System.out.println($greeting + "\nLegal");

        // JOptionPane.showMessageDialog(null, "Hello, World!");
        JOptionPane.showMessageDialog(null, "Hello, World!", "Greetings", JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Faz a soma de 2 números dados pelo o usuário
     * 
     * @return void
     */
    public static void soma() {
        String num1, num2;
        Integer soma;

        num1 = JOptionPane.showInputDialog("Informe o 1º número: ");
        num2 = JOptionPane.showInputDialog("Informe o 2º número: ");

        soma = Integer.parseInt(num1) + Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null, "A soma de: " + num1 + " + " + num2 + " = " + soma, "Resultado da soma", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Calcula o fatorial de um número e de seus antecessores
     * 
     * @return void
     */
    public static void fatorial() {
        String num, result = "";
        Integer fatorial;

        num = JOptionPane.showInputDialog(null, "Digite um número", "Calculando o fatorial", JOptionPane.QUESTION_MESSAGE);

        for (int i = Integer.parseInt(num); i > 0; i--) {
            fatorial = 1;

            result += i + "! => ";
            
            for (int j = i; j > 0; j--) {
                fatorial *= j;
                
                result += j;
                if (j > 1) result += " * ";
            }
            
            result += " = " + fatorial + "\n";
        }

        JOptionPane.showMessageDialog(null, result, "Resultado da conta", JOptionPane.INFORMATION_MESSAGE);
    }
}
