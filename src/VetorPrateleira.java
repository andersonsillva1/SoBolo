import java.util.ArrayList;
import java.util.List;

public class VetorPrateleira implements IPrateleira {
    private List<IBolo> prateleira;
    private int gtdBolo;

    public VetorPrateleira(int gtdBolo) {
        this.gtdBolo = gtdBolo;
        this.prateleira = new ArrayList<>();
    }
    public VetorPrateleira() {
        this.gtdBolo = -1;
        this.prateleira = new ArrayList<>();
    }

    @Override
    public boolean cheia() {
        return gtdBolo != -1 && prateleira.size() >= gtdBolo;
    }

    @Override
    public boolean vazia() {
        return prateleira.isEmpty();
    }

    @Override
    public boolean existe(IBolo bolo) {
        return prateleira.contains(bolo);
    }

    @Override
    public int buscar(IBolo bolo) {
        return prateleira.indexOf(bolo);
    }

    @Override
    public boolean inserir(IBolo bolo) {
        if (existe(bolo)) {
            System.out.println("Bolo já cadastrado!");
            return false;
        } else if (cheia()) {
            System.out.println("Prateleira cheia. Não é possível adicionar mais bolos.");
            return false;
        } else {
            prateleira.add(bolo);
            return true;
        }
    }

    @Override
    public IBolo remover(IBolo bolo) {
        if (prateleira.remove(bolo)) {
            return bolo;
        } else {
            System.out.println("Bolo inexistente.");
            return null;
        }
    }

    @Override
    public IBolo remover(int posicao) {
        if (posicao >= 0 && posicao < prateleira.size()) {
            return prateleira.remove(posicao);
        } else {
            System.out.println("Posição inválida. Bolo inexistente.");
            return null;
        }
    }

    @Override
    public IBolo consultar(IBolo bolo) {
        int posicao = buscar(bolo);
        if (posicao != -1) {
            return prateleira.get(posicao);
        }else {
            System.out.println("Bolo não encontrado.");
            return null;
        }
    }

    @Override
    public IBolo[] listar() {
        return prateleira.toArray(new IBolo[0]);
    }

    @Override
    public IBolo[] listar(char tipoDoBolo) {
        List<IBolo> listaFiltrada = new ArrayList<>();
        for (IBolo bolo : prateleira) {
            if ((tipoDoBolo == 'S' && bolo instanceof BoloSimples) ||
                    (tipoDoBolo == 'T' && bolo instanceof Torta)) {
                listaFiltrada.add(bolo);
            }
        }
        return listaFiltrada.toArray(new IBolo[0]);
    }
}
