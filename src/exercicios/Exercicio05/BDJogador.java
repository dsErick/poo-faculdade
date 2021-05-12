package exercicios.Exercicio05;

import java.util.ArrayList;

/**
 * Além disso, crie uma outra classe que funcionará como uma base de dados. A classe Base de Dados deve armazenar:
 *      - Um arrayList que armazena jogadores
 *
 *  A classe Base de Dados deve disponibilizar os seguintes métodos:
 *      - Método que aloca o arrayList na memória.
 *      - Método que permite inserir um jogador no arrayList;
 *      - Método que recebe (por parâmetro) o identificador do jogador e imprime os demais dados (atributos) desse jogador.
 *      - Método que retorna o jogador com maior número de gols;
 *      - Método que recebe (por parâmetro) uma quantidade de gols e imprime o nome dos jogadores com o número de gols igual ou maior que o valor informado.
 *      - Método que retorna o valor de mercado médio dos jogadores do arrayList.
 * 
    BDJogador bd = new BDJogador();

    bd.cadastrarJogador();
    bd.cadastrarJogador();
    bd.cadastrarJogador();

    bd.imprimeJogador(5);
    bd.imprimeJogador(1);

    System.out.println("\n--------------------------------------\n");
    bd.jogadorComMaisGols();
    
    System.out.println("\n--------------------------------------\n");
    bd.jogadorComGols(5);
    
    System.out.println("\n--------------------------------------\n");
    bd.valorMedio();
 */
public class BDJogador {
    private ArrayList<Jogador> jogadores;
    private int jogadorId = 1;

    /**
     * Contrutor.
     *
     * Método que aloca o arrayList na memória.
     */
    public BDJogador() {
        jogadores = new ArrayList<Jogador>();
    }

    /**
     * Método que permite inserir um jogador no arrayList.
     */
    public void cadastrarJogador() {
        Jogador jogador = new Jogador(jogadorId);

        jogadores.add(jogador);
        jogadorId++;
    }

    /**
     * Método que recebe (por parâmetro) o identificador do jogador
     * e imprime os demais dados (atributos) desse jogador.
     * 
     * @param id {@code String}
     */
    public void imprimeJogador(int id) {
        Boolean foiEncontrado = false;

        for (Jogador jogador : jogadores) {
            if (jogador.getId() == id) {
                jogador.imprime();
                foiEncontrado = true;
                break;
            }
        }

        if (!foiEncontrado) {
            System.out.println("\n--------------------------------------");
            System.out.println("| Não foi encontrado nenhum jogador com o id: " + id);
            System.out.println("--------------------------------------");
        }
    }

    /**
     * Método que retorna o jogador com maior número de gols
     *
     * @return {@code Jogador}
     */
    public Jogador jogadorComMaisGols() {
        Jogador jogadorMaisGols = jogadores.get(0);

        for (Jogador jogador : jogadores) {
            if (jogadorMaisGols.getGols() < jogador.getGols()) {
                jogadorMaisGols = jogador;
            }
        }

        jogadorMaisGols.imprime();

        return jogadorMaisGols;
    }

    /**
     * Método que recebe (por parâmetro) uma quantidade de gols e imprime o
     * nome dos jogadores com o número de gols igual ou maior que o valor informado.
     * 
     * @return {@code int}
     */
    public void jogadorComGols(int gols) {
        System.out.println("\n---- Jogadores com " + gols + " gols ou mais -----\n| ");
        for (Jogador jogador : jogadores) {
            if (jogador.getGols() >= gols) {
                System.out.print(jogador.getNome() + ", ");
            }
        }

        System.out.println("\n--------------------------------------");
    }

    /**
     * Método que retorna o valor de mercado médio dos jogadores do arrayList.
     */
    public double valorMedio() {
        double valorMedio = 0.0;

        for (Jogador jogador : jogadores) {
            valorMedio += jogador.getValorMercado();
        }

        System.out.println("--------------------------------------");
        System.out.println("| Valor de mercado total de todos os jogadores: " + valorMedio);
        System.out.println("| Quantidade de jogadores: " + jogadores.size());
        System.out.println("| Valor médio de mercado: " + valorMedio / jogadores.size());
        System.out.println("--------------------------------------");

        return valorMedio / jogadores.size();
    }
}
