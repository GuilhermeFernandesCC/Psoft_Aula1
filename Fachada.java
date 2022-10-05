import java.util.Collection;
import java.util.Date;

public class Fachada {
    private LoteServices loteServices = new LoteServices();
    private ProdutoServices produtoServices = new ProdutoServices();
    public String addProduto(String nome, String fabricante, double preco){
        return produtoServices.addProduto(nome, fabricante, preco);
    }

    public String addLote(String produtoId, int quantidade, Date dataValidade) {
        return loteServices.addLote(produtoId,quantidade,dataValidade);
    }

    public int[] listarProdutos() {
        return produtoServices.listarProdutos();
    }

    public Collection<Lote> listarLotes() {
        return loteServices.listarLotes();
    }
}
