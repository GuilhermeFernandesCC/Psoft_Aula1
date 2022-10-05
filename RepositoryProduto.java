import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RepositoryProduto {

    private Map<String, Produto> produtos;

    public RepositoryProduto() {
        this.produtos = new HashMap<String, Produto>();
    }

    public String salvarProduto(Produto novoProduto) {
        produtos.put(novoProduto.getId(), novoProduto);
        return novoProduto.getId();
    }

    public Collection<Produto> getAll(){
        return produtos.values();
    }
}
