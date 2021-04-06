package aulas.Aula07;

/**
 * @link https://www.youtube.com/watch?v=lS-_3k1c_MQ
 * 
    BDCliente clientes = new BDCliente(4);

    clientes.cadastrar();

    clientes.imprimeCliente(0);
    clientes.imprimeCliente(1);

    clientes.cadastrar();

    clientes.imprimeBD();
 */
public class BDCliente {
    private Cliente clientes[];
    private int cadastrados;

    /**
     * Construtor de DBCliente
     * 
     * @param tamanho
     */
    public BDCliente(int tamanho) {
        clientes = new Cliente[tamanho];
        cadastrados = 0;
    }

    /**
     * Cadastra um novo cliente na instância
     */
    public void cadastrar() {
        Cliente cliente = new Cliente();

        clientes[cadastrados] = cliente;
        cadastrados++;
    }

    /**
     * Imprime um cliente pelo sua posição
     * 
     * @param i
     */
    public void imprimeCliente(int i) {
        if (i >= cadastrados || i < 0) {
            System.out.println("Erro. Não há cliente na posição: " + i + "\n");
            return;
        }

        clientes[i].imprime();
    }

    /**
     * Imprime as informações de todos os clientes cadastrados
     */
    public void imprimeBD() {
        for (int i = 0; i < cadastrados; i++) {
            clientes[i].imprime();
        }
    }
}
