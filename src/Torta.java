public class Torta extends Bolo {
    private boolean recheio;
    private boolean cobertura;

    public Torta(double custo, IFormato formato) {
        super(custo, formato);
    }

    public Torta(double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(custo, formato);
        setRecheio(recheio);
        setCobertura(cobertura);
    }

    public boolean eRecheio() {
        return recheio;
    }

    public void setRecheio(boolean recheio) {
        this.recheio = recheio;
    }

    public boolean eCobertura() {
        return cobertura;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public double preco() {
        double precoBase = getCusto() * getFormato().area();
        if (recheio) precoBase += 12.5;
        if (cobertura) precoBase += 20.0;
        return precoBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", recheio=" + recheio + ", cobertura=" + cobertura;
    }


}
