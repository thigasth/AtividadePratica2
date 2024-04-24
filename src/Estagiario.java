public class Estagiario extends Pessoa {

    private String curso;

    public void Estagiario() {

    }

    public Estagiario(int id, String nome, String curso) {
        super(id, nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        
        return super.toString() + "curso: " + curso;
    }

}
