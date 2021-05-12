package provas;

import java.util.ArrayList;

/**
 * 12-05-2021
 * 
 * Crie uma outra classe em java que deve armazenar (ter como atributo):
 *  - Um arrayList que armazena inteiros
 * 
 * Essa classe deve disponibilizar os seguintes métodos:
 *  - Método que aloca o arrayList na memória.
 *  - Método que recebe por parâmetro um valor inteiro e remove esse valor do arrayList.
 *  - Método que recebe por parâmetro um valor inteiro e remove do arrayList os valores menores do que o passado por parâmetro
 */
public class Prova2 {
    private ArrayList<Integer> numeros;

    public Prova2() {
        numeros = new ArrayList<Integer>();
    }

    public void removeValor(Integer num) {
        numeros.remove(num);
    }

    public void removeMenores(Integer num) {
        for(int i = 0; i < numeros.size(); i++) {
            if (i < num) {
                removeValor(i);
            }
        }
    }
}
