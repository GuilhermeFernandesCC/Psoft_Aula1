import java.util.Collection;
import java.util.Date;

public class LoteServices {

    private RepositoryProduto RepProd;
    private RepositoryLote RepLote;
    public String addLote(String produtoId, int quantidade, Date dataValidade) {
        Lote novoLote = new Lote(produtoId,quantidade,dataValidade);
        RepLote.salvarLote(novoLote);
        return novoLote.getId();
    }

    public Collection<Lote> listarLotes() {
        return RepLote.getAll();
    }
}
