package aulas.Aula13;

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
