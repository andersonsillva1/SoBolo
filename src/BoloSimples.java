public class BoloSimples extends Bolo {
    private boolean semLactose;

    public BoloSimples(double custo, IFormato formato) {
        super(custo, formato);
    }

    public BoloSimples(double custo, IFormato formato, boolean semLactose) {
        super(custo, formato);
        this.semLactose = semLactose;
    }

    @Override
    public double preco() {
        double precoBase = getCusto() * getFormato().area();
        return semLactose ? precoBase + 35.0 : precoBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", semLactose=" + semLactose;
    }

}
