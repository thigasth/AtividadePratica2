import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cadastro {

    private static List<Pessoa> listaPessoas = new ArrayList<>();

    public static void cadastrar (Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public static List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public static Pessoa buscar(int id) {

        for (Pessoa temp : listaPessoas) {

            if (temp.getId() == id) {

                return temp;
            }
        }

        return null;

    }

    public static boolean remover(int id) {
        Iterator<Pessoa> iterator = listaPessoas.iterator();
        while (iterator.hasNext()) {
            Pessoa pessoa = iterator.next();
            if (pessoa.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public static void limparLista() {
        listaPessoas.clear();
    }

}
