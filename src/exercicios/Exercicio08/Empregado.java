package exercicios.Exercicio08;

/**
 * 1.Faça um programa que contenhas as seguintes classes:
 *
 *  - Classe Empregado:
 *      Deve conter como atributos salário base, valor de serviços prestados e comissão (com os métodos gets e sets respectivos).
 *      Além disso, deve conter o método calcula comissão e calcula salário total.
 *      Na implementação do método calcula comissão deve-se retornar a multiplicação do valor de serviços prestados por 10%.
 *      Já na implementação do método calcula salário total deve-se retornar a soma do salário base com a comissão.
 *
 */
public class Empregado {
    private double salarioBase;
    private double valorServicosPrestados;
    private double comissao;

    public Empregado(double salarioBase, double valorServicosPrestados) {
        this.setSalarioBase(salarioBase);
        this.setValorServicosPrestados(valorServicosPrestados);
    }

    public double calculaComissao() {
        this.comissao = this.valorServicosPrestados * .1;
        return this.comissao;
    }

    public double calculaSalarioTotal() {
        return this.salarioBase + this.calculaComissao();
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorServicosPrestados() {
        return valorServicosPrestados;
    }
    public void setValorServicosPrestados(double valorServicosPrestados) {
        this.valorServicosPrestados = valorServicosPrestados;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
