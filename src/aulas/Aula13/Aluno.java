package aulas.Aula13;

/**
 * 
    Aluno aluno = new Aluno();

    aluno.setNome("João");
    aluno.setMatricula(123);
    System.out.println(aluno.getNome() + " " + aluno.getMatricula());
    aluno.fazerAniversario();
    aluno.cancelaMatricula();
 */
public class Aluno extends Pessoa {
    private Integer matricula;
    private String curso;

    public void cancelaMatricula() {
        System.out.println(this.getNome() + " teve a matrícula cancelada");
    }
    
    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
