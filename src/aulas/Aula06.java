package aulas;

/**
 * @link https://youtu.be/QrHpjVqT5wg
 * 
    new Aula06().vetor();

    Aula06 aula06[] = new Aula06[2];

    System.out.println(aula06);
    System.out.println(aula06[0]);
    // System.out.println(aula06[1].numeros);
 */
public class Aula06 {
    public int numeros[] = {8, 2, 4, 7};

    /**
     * 
     */
    public void vetor() {
        System.out.println(numeros);

        for(int i : numeros) {
            System.out.print(i + " - ");
        }
    }
}
