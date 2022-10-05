import java.util.Collection;
import java.util.Date;

public class Fachada {
    private LoteServices loteServices;
    private ProdutoServices produtoServices;
    public String addProduto(String nome, String fabricante, double preco){
        return produtoServices.addProduto(nome, fabricante, preco);
    }

    public String addLote(String produtoId, int quantidade, Date dataValidade) {
        return loteServices.addLote(produtoId,quantidade,dataValidade);
    }

    public Collection<Produto> listarProdutos() {
        return produtoServices.listarProdutos();
    }

    public Collection<Lote> listarLotes() {
        return loteServices.listarLotes();
    }
}
