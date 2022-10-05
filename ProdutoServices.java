import java.util.Collection;

public class ProdutoServices {
    private RepositoryProduto RepProd;
    private RepositoryLote RepLote;
    public String addProduto(String nome, String fabricante, double preco){
        Produto novoProduto = new Produto(nome,fabricante,preco);
        RepProd.salvarProduto(novoProduto);
        return novoProduto.getId();
    }

    public Collection<Produto> listarProdutos() {
        return RepProd.getAll();
    }

}
