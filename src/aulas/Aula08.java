package aulas;

import java.util.ArrayList;

/**
 * Aula 09 Parte 1 - Teoria
 * @link https://www.youtube.com/watch?v=hCFu9Sy4dcM
 */
public class Aula08 {
    public Aula08() {
        // Instancia uma nova ArrayList
        ArrayList<Integer> lista = new ArrayList<Integer>();

        System.out.println(lista); // []

        // Adiciona um novo valor
        lista.add(3);
        lista.add(6);
        lista.add(1);
        System.out.println(lista); // [3, 6, 1]

        // index, valor
        lista.add(0, 5);
        System.out.println(lista); // [5, 3, 6, 1]


        // Sobrescreve o valor do indíce indicado
        lista.set(1, 7);
        System.out.println(lista); // [5, 7, 6, 1]

        // Imprime o valor do indíce indicado
        Integer i2 = lista.get(2);
        System.out.println(i2); // 6


        // Remove o valor do indíce indicado
        lista.remove(3);
        System.out.println(lista); // [5, 7, 6]
        
        // Remove o valor indicado
        lista.remove((Integer) 7);
        System.out.println(lista); // [5, 6]


        // Limpa um ArrayList
        // lista.clear(); // []

        // Clona um ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<Integer> lista2 = (ArrayList<Integer>) lista.clone();
        System.out.println(lista2);


        System.out.println(lista2.indexOf(6)); // 1
        System.out.println(lista2.isEmpty()); // false
        System.out.println(lista2.size()); // 2
    }
}
