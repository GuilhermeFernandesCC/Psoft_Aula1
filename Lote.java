import java.util.Date;

public class Lote {

    private int quantidade;

    private Date dataValidade;

    private Produto produto;

    public Lote(int quant,Date dataV,Produto produto){
        this.quantidade = quant;
        this.dataValidade = dataV;
        this.produto = produto;
    }
}
