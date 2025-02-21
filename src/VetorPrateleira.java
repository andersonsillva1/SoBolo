import java.util.List;
/**/
public class VetorPrateleira {
    protected List<IBolo> Prateleira;
    protected int gtdBolo;

    public VetorPrateleira(List<IBolo> prateleira, int gtdBolo) {
        Prateleira = prateleira;
        this.gtdBolo = gtdBolo;
    }

    public void inserir(IBolo bolo){
        for(IBolo b : Prateleira){
            if(((Bolo)b).getCodigo() == ((Bolo)bolo).getCodigo()){
                System.out.println("Bolo já cadastrado!!");
                return;
            }
        }
        if(Prateleira.size() >= gtdBolo) {
            System.out.println("Prateleira cheia. Não é possível adicionar mais bolos");
            return;
        }
    }

    public  IBolo remover(int posicao){
        if(posicao >=0 && posicao < Prateleira.size()){
            return Prateleira.remove(posicao);
        }else{
            System.out.println("Bolo inexistente.");
            return null;
        }
    }

}

