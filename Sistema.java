import java.util.Collection;
import java.util.Date;

public class Sistema {
    private Fachada fachada;
    public static void main(String[] args) {

    }
    public void  addProdduto(String nome,String fabricante,double preco){
        fachada.addProduto(nome,fabricante,preco);
    }

    public void  addLote(String produtoId,int quantidade,Date dataValidade){
        fachada.addLote(produtoId,quantidade,dataValidade);
    }

    public Collection<Produto> listarProdutos(){
        return fachada.listarProdutos();
    }
    public String[] listarLotes(){
        return fachada.listarLotes();
    }

}

