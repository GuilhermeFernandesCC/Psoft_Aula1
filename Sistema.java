import java.util.Date;

public class Sistema {
    public static void main(String[] args) {
        Date dataV = new Date(2022,9,23);
        Produto prod = new Produto("Leite","Betania",8.00);
        Lote lote = new Lote(100, dataV,prod);
    }
}

