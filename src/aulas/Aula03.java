package aulas;

public class Aula03 {
    private String name;
    private Integer age;
    
    /**
     * Classes e Objectos
     * Aula03 constructor
     * @link    https://www.youtube.com/watch?v=PYMIitbUTKk
     * 
     * @params  String name
     * @params  Integer age
     */
    public Aula03(String name, Integer age) {
        setName(name);
        setAge(age);
    }

    /**
     * Get name property
     * 
     * @return  String
     */
    public String getName() {
        return name;
    }

    /**
     * Set a value for name property
     * 
     * @return  void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get age property
     * 
     * @return  Integer
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Set a value for age property
     * 
     * @return  void
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Return a greeting with the instance properties
     * 
     * @return  String
     */
    public String greeting() {
        return "Hi, I'm " + this.name + " and I'm " + this.age + " years old.";
    }

    public static void displayTest() {
        System.out.println("Aula03 class teste");
    }
}