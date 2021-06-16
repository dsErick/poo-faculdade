package exercicios.Exercicio07;

/**
 * aula do dia 16-06-2021
 *
 * Faça um programa que contenhas as seguintes classe:
 * - Classe animal: deve ser abstrata e conter como atributos peso e idade (com os métodos gets e sets respectivos).
 *      Além disso, deve conter os métodos  locomover e alimentar. Na implementação do método
 *      locomover deve-se imprimir na tela "Animal se locomovendo". Já na implementação do método
 *      alimentar deve-se imprimir na tela "Animal se alimentando".
 */
public abstract class Animal {
    private Integer idade;
    private double peso;

    public void locomover() {
        System.out.println("Animal se locomovendo");
    }

    public void alimentar() {
        System.out.println("Animal se alimentando");
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
