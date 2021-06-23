package exercicios.Exercicio08;

/**
 *  - Classe Empregado Vendedor:
 *      Deve herdar da classe Empregado e conter como atributo auxilio transporte (com os métodos gets e sets respectivos).
 *      Além disso, deve conter o método calcula comissão e calcula salário total.
 *      Na implementação do método calcula comissão deve-se retornar a multiplicação do valor de serviços prestados por 15%.
 *      Já na implementação do método calcula salário total deve-se retornar a soma do salário base, da comissão e do auxilio alimentação.
 *
 */
public class Vendedor extends Empregado {
    private double auxilioTransporte;

    public Vendedor(double salarioBase, double valorServicosPrestados, double auxilioTransporte) {
        super(salarioBase, valorServicosPrestados);

        this.setAuxilioTransporte(auxilioTransporte);
    }

    @Override
    public double calculaComissao() {
        return super.getValorServicosPrestados() * .15;
    }

    @Override
    public double calculaSalarioTotal() {
        return super.getSalarioBase() + this.calculaComissao() + this.auxilioTransporte;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }
    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }
}
