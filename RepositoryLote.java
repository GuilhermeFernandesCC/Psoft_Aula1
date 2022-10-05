import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RepositoryLote {

    private Map<String,Lote> lotes;

    public RepositoryLote(){ this.lotes = new HashMap<String, Lote>();}

    public String salvarLote(Lote novoLote){
        lotes.put(novoLote.getId(),novoLote);
        return novoLote.getId();
    }

    public Collection<Lote> getAll() {
        return lotes.values();
    }
}
