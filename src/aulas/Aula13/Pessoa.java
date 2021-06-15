package aulas.Aula13;

/**
 * https://www.youtube.com/watch?v=RmEiShe2gLA
 * aula do dia 14-06-2021
 */
public class Pessoa {
    private String nome;
    private Integer idade;
    private char sexo;

    public void fazerAniversario() {
        System.out.println("Parabéns");
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
