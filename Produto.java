import java.util.UUID;

public class Produto {

    private String id;

    private String nome;

    private String fabricante;

    private Double preco;

    public Produto(String nome, String fabricante, Double preco) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;


    }
}
