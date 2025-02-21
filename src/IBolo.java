public interface Bolo {
    double preco();
}


abstract class BoloBase implements Bolo {
    protected double custoUnitario;

    public BoloBase(double custoPorUnidade) {
        this.custoUnitario = custoUnitario;
    }


    protected abstract double calcularArea();

    @Override
    public double preco() {
        return custoUnitario * calcularArea();
    }
}


class BoloCircular extends BoloBase {
    private double raio;

    public BoloCircular(double raio, double custoUnitario) {
        super(custoUnitario);
        this.raio = raio;
    }

    @Override
    protected double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}


class BoloRetangular extends BoloBase {
    private double largura;
    private double altura;

    public BoloRetangular(double largura, double altura, double custoUnitario) {
        super(custoUnitario);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    protected double calcularArea() {
        return largura * altura;
    }
}
