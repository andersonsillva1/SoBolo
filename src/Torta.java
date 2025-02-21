public class Torta extends Bolo {
    private boolean recheio;
    private boolean cobertura;

    public Torta(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
    }

    public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(codigo, custo, formato);
        setRecheio(recheio);
        setCobertura(cobertura);
    }

    public boolean isRecheio() {
        return recheio;
    }

    public void setRecheio(boolean recheio) {
        this.recheio = recheio;
    }

    public boolean isCobertura() {
        return cobertura;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    //falat implementar
    public boolean preco{

    }

    //toString


}
