import java.util.ArrayList;
import java.util.List;

public class VetorPrateleira {
    private List<IBolo> Prateleira;
    private int gtdBolo;


    public VetorPrateleira(int gtdBolo) {
        this.gtdBolo = gtdBolo;
        this.Prateleira = new ArrayList<>();
    }


    public List<IBolo> getPrateleira() {
        return new ArrayList<>(Prateleira);
    }

    public int getGtdBolo() {
        return gtdBolo;
    }


    public void setPrateleira(List<IBolo> prateleira) {
        if (prateleira != null) {
            this.Prateleira = prateleira;
        } else {
            System.out.println("Erro: Lista de prateleira não pode ser nula!");
        }
    }

    public void setGtdBolo(int gtdBolo) {
        if (gtdBolo > 0) {
            this.gtdBolo = gtdBolo;
        } else {
            System.out.println("Erro: Quantidade de bolos deve ser maior que zero.");
        }
    }


    public boolean cheia() {
        return Prateleira.size() >= gtdBolo;
    }

    public boolean vazia() {
        return Prateleira.isEmpty();
    }

    public boolean existe(IBolo bolo) {
        return Prateleira.contains(bolo);
    }

    public int buscar(IBolo bolo) {
        return Prateleira.indexOf(bolo);
    }

    public void inserir(IBolo bolo) {
        if (existe(bolo)) {
            System.out.println("Bolo já cadastrado!");
            return;
        }
        if (cheia()) {
            System.out.println("Prateleira cheia. Não é possível adicionar mais bolos.");
            return;
        }
        Prateleira.add(bolo);
    }

    public IBolo remover(IBolo bolo) {
        if (Prateleira.remove(bolo)) {
            return bolo;
        } else {
            System.out.println("Bolo inexistente.");
            return null;
        }
    }

    public IBolo remover(int posicao) {
        if (posicao >= 0 && posicao < Prateleira.size()) {
            return Prateleira.remove(posicao);
        } else {
            System.out.println("Posição inválida. Bolo inexistente.");
            return null;
        }
    }

    public IBolo consultar(IBolo bolo) {
        int posicao = buscar(bolo);
        if (posicao != -1) {
            return Prateleira.get(posicao);
        }
        System.out.println("Bolo não encontrado.");
        return null;
    }

    public List<IBolo> listar() {
        return new ArrayList<>(Prateleira);
    }

    public List<IBolo> listar(char tipoDoBolo) {
        List<IBolo> listaFiltrada = new ArrayList<>();

        for (IBolo bolo : Prateleira) {
            if ((tipoDoBolo == 'S' && bolo instanceof BoloSimples) ||
                    (tipoDoBolo == 'T' && bolo instanceof Torta)) {
                listaFiltrada.add(bolo);
            }
        }

        return listaFiltrada;
    }
}
