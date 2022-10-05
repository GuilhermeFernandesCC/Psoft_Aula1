import java.util.Date;
import java.util.UUID;

public class Lote {
    private String id;
    private int quantidade;

    private Date dataValidade;

    private String produtoId;

    public Lote(String produtoId, int quantidade, Date dataValidade){
        this.id = UUID.randomUUID().toString();
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.produtoId = produtoId;
    }

    public String getId() {
        return this.id;
    }
}
