package aulas.Aula09;

import java.util.ArrayList;
import java.util.Scanner;

/**
    BDAluno bd = new BDAluno();

    bd.cadastrarAluno();
    bd.cadastrarAluno();
    bd.cadastrarAluno();

    bd.imprimeBD();
    bd.imprimeAluno();

    bd.removeAluno();

    bd.imprimeBD();
 */
public class BDAluno {
    private ArrayList<Aluno> bd = new ArrayList<Aluno>();

    public void cadastrarAluno() {
        Aluno aluno = new Aluno();

        bd.add(aluno);
    }

    public void imprimeBD() {
        System.out.println("------------ Alunos ------------");

        for (Aluno aluno : bd) {
            aluno.imprime();
        }
        System.out.println("--------------------------------\n");
    }

    public void imprimeAluno() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("------ Aluno com matrícula ------");
        System.out.print("Digite a matrícula do aluno: ");
        Integer mat = scan.nextInt();

        Boolean foiEncontrado = false;

        for (Aluno aluno : bd) {
            if (aluno.matricula == mat) {
                aluno.imprime();
                foiEncontrado = true;
                break;
            }
        }

        if (!foiEncontrado) {
            System.out.println("Não foi encontrado nenhum aluno com a matrícula: " + mat);
        }
        System.out.println("---------------------------------\n");
    }

    public void removeAluno() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("-------- Remover Aluno ----------");
        System.out.print("Digite a matrícula do aluno: ");
        Integer mat = scan.nextInt();

        Boolean foiEncontrado = false;

        for (Aluno aluno : bd) {
            if (aluno.matricula == mat) {
                bd.remove(aluno);
                System.out.println("Aluno removido com sucesso");
                break;
            }
        }

        if (!foiEncontrado) {
            System.out.println("Não foi encontrado nenhum aluno com a matrícula: " + mat);
        }
        System.out.println("--------------------------------\n");
    }
}
