package provas.Prova1;

/**
 * Faça um programa em Java que contenha uma classe "venda".
 * A classe venda deve ter como atributos quantidade de produtos, valor da venda e id da venda.
 * Além disso, a classe venda deve ter como método "calcula valor da venda".
 * Esse método deve atribuir o valor da multiplicação do atributo "quantidade de produtos" por 1,99.
 * 
 * Por exemplo: se para um objeto a quantidade de produtos é 5, o método
 * calcula valor da venda deve atribuir ao valor da venda: 5 x 1,99.
 * 
 * Além disso, o programa deve criar um objeto da classe venda no método main.
 * Você deve atribuir o valor 7 ao atributo quantidade de produtos do objeto
 * anteriormente criado. Posteriormente, o método "calcula valor da venda" deve
 * ser chamado e o valor do atributo "valor da venda" deve ser impresso na tela.
 * 
 * 
    Venda venda01 = new Venda(7, "venda01");

    System.out.println(venda01.calculaValorVenda());
 */
public class Venda {
    private Integer quantidade_produtos;
    private Double valor_venda;
    // private String id_venda;

    public Venda(Integer quantidade_produtos/* , String id_venda */) {
        this.quantidade_produtos = quantidade_produtos;
        // this.id_venda = id_venda;
    }

    public Double calculaValorVenda() {
        this.valor_venda = this.quantidade_produtos * 1.99;

        return this.valor_venda;
    }
}
