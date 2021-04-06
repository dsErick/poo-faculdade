package exercicios.Exercicio02;

/**
 * 1.Faça um programa em Java que:
 *    1. Tenha uma classe contaBancaria que representa uma conta bancária.
 * 
 *    2. A classe contaBancaria deve possuir as seguintes características (atributos)
 *    	- Agência (inteiro)
 *    	- Numero da conta (inteiro)
 *    	- CPF do titular (String)
 *    	- Titular da conta (String)
 *    	- Saldo da conta (nº real)
 *    	- cheque especial (nº real)
 * 
 *    3. A classe contaBancaria deve permitir as seguinte ações (métodos)
 *    	- Depósito: receber por parâmetro o valor depositado e somar esse valor ao saldo da conta
 *    	- saque: receber por parâmetro o valor sacado e diminuir esse valor ao saldo da conta.
 *    	- Saldo: deve imprimir o saldo da conta. 
 * 
 * 
    ContaBancaria conta = new ContaBancaria(1, 1, "123.456", "Erick");

    conta.saldo();

    conta.saque(10.0);
    conta.deposito(15.0);
        
    conta.saque(15.0);
    conta.saque(250.0);
    conta.saque(500.0);

    conta.saldo();
 */
public class ContaBancaria {
    protected int agencia;
    protected int numero;
    protected String cpf;
    protected String titular;
    protected Double saldo = 0.0;
    protected Double cheque_especial = 500.0;

    /**
     * Construtor de ContaBancaria
     * 
     * @param agencia Int
     * @param numero Int
     * @param cpf String
     * @param titular String
     */
    public ContaBancaria(int agencia, int numero, String cpf, String titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.cpf = cpf;
        this.titular = titular;
    }

    /**
     * Adiciona o valore specificado ao saldo da conta
     * 
     * @param   valor Double
     * @return  void
     */
    public boolean deposito(Double valor) {
        this.saldo += valor;

        System.out.println(valor + " depositado com succeso\n");
        return true;
    }

    /**
     * Subtrai a valor, se possível, da conta
     * 
     * @param   valor Double
     * @return  void
     */
    public boolean saque(Double valor) {
        if (valor > this.saldo + this.cheque_especial) return false;

        if (this.saldo >= valor) this.saldo -= valor;
        else {
            Double diferenca = valor - this.saldo;

            this.saldo = 0.0;
            this.cheque_especial -= diferenca;
        }

        System.out.println(valor + " sacado com succeso\n");
        return true;
    }

    /**
     * Informa quanto de saldo há disponível na conta
     * 
     * @param   valor Double
     * @return  Double[]
     */
    public Double[] saldo() {
        System.out.println("\nSaldo: " + this.saldo + "\nCheque especial: " + this.cheque_especial);
        
        Double[] result = {this.saldo, this.cheque_especial};

        return result;
    }
}
