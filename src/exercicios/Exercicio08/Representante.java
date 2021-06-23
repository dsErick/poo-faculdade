package exercicios.Exercicio08;

/**
 *  - Classe Empregado Representante:
 *      Deve herdar da classe Empregado e conter como atributo gratificação por tempo de serviço (com os métodos gets e sets respectivos).
 *      Além disso, deve conter o método calcula comissão e calcula salário total.
 *      Na implementação do método calcula comissão deve-se retornar a multiplicação do valor de serviços prestados por 7%.
 *      Já na implementação do método calcula salário total deve-se retornar a soma do salário base, da comissão e da gratificação por tempo de serviço.
 *
 */
public class Representante extends Empregado {
    private double gratificacaoPorTempoServico;

    public Representante(double salarioBase, double valorServicosPrestados, double gratificacaoPorTempoServico) {
        super(salarioBase, valorServicosPrestados);

        this.setGratificacaoPorTempoServico(gratificacaoPorTempoServico);
    }

    @Override
    public double calculaComissao() {
        return super.getValorServicosPrestados() * .07;
    }

    @Override
    public double calculaSalarioTotal() {
        return super.getSalarioBase() + this.calculaComissao() + this.getGratificacaoPorTempoServico();
    }

    public double getGratificacaoPorTempoServico() {
        return gratificacaoPorTempoServico;
    }
    public void setGratificacaoPorTempoServico(double gratificacaoPorTempoServico) {
        this.gratificacaoPorTempoServico = gratificacaoPorTempoServico;
    }
}
