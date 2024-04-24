public class Cliente extends Pessoa {

    private String email;

    public Cliente(){

    }

    public Cliente(int id, String nome, String email) {
        super(id, nome);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                '}';
    }
}
