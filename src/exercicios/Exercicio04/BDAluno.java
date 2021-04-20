package exercicios.Exercicio04;

/**
 * 
 * Além disso, crie uma outra classe que funcionará como uma base de dados. A classe Base de Dados deve armazenar:
 *  - Um array (vetor) que armazena alunos
 *  - Um inteiro que controla a quantidade de alunos que foram inseridos no array. (Obs: o tamanho do array não necessariamente é igual a quantidade de alunos inseridos no vetor).
 * 
 * A classe Base de Dados deve disponibilizar os seguintes métodos:
 *  - Método que recebe (por parâmetro) o tamanho do array e aloca esse array na memória.
 *  - Método que permite inserir um aluno no array;
 *  - Método que recebe (por parâmetro) a matrícula do aluno e imprime os demais dados (atributos) desse aluno. 
 *  - Método que retorna o aluno com maior coeficiente;
 *  - Método que recebe (por parâmetro) um período e imprime os alunos desse período.
 * 
    BDAluno alunos = new BDAluno(3);

    alunos.cadastrarAluno();
    alunos.cadastrarAluno();
    alunos.cadastrarAluno();

    alunos.imprimeAluno(1);

    alunos.imprimeAlunoComMaiorCoeficiente();

    alunos.imprimeAlunosDoPeriodo(7);
 */
public class BDAluno {
    private Aluno alunos[];
    private int countAlunos;

    /**
     * Construtor de BDAluno
     * 
     * @param count
     */
    public BDAluno(int count) {
        this.alunos = new Aluno[count];
        this.countAlunos = 0;
    }

    /**
     * Cadastra um novo aluno
     */
    public void cadastrarAluno() {
        Aluno aluno = new Aluno();

        this.alunos[this.countAlunos] = aluno;
        this.countAlunos++;
    }

    /**
     * Imprime um aluno pela sua matrícula
     * 
     * @param matricula
     */
    public void imprimeAluno(int matricula) {
        System.out.println("\nBuscando aluno com matrícula: " + matricula);

        for (int i = 0; i < this.countAlunos; i++) {
            if (this.alunos[i].getMatricula() == matricula) this.alunos[i].imprime();
        }
    }

    /**
     * Imprime o aluno com maior coeficiente médio
     */
    public void imprimeAlunoComMaiorCoeficiente() {
        Aluno aluno = this.alunos[0];

        for (int i = 0; i < this.countAlunos; i++) {
            if (aluno.getCoeficienteMedio() < this.alunos[i].getCoeficienteMedio()) {
                aluno = this.alunos[i];
            }
        }

        System.out.println("\nBuscando aluno com maior coeficiente médio");
        aluno.imprime();
    }

    /**
     * Imprime os alunos que estão no período especificado
     * 
     * @param periodo
     */
    public void imprimeAlunosDoPeriodo(int periodo) {
        System.out.println("\nBuscando os alunos que estão no " + periodo + " período");

        for (int i = 0; i < this.countAlunos; i++) {
            if (this.alunos[i].getPeriodo() == periodo) {
                this.alunos[i].imprime();
            }
        }
    }
}
