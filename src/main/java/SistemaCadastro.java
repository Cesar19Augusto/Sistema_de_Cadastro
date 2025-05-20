import java.util.List;

public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = repository.buscar(1);
        if ( cadastro != null) {
            System.out.println(cadastro.getId() + " " + cadastro.getNome());
        }else {
            System.out.println("Não foi possivel localizar o cadastro por Id");
        }
    }
}
 