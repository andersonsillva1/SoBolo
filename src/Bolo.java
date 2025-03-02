public abstract class Bolo implements IBolo {
    private int codigo;
    private double custo;
    private IFormato formato;

    private static int proximoCodigo = 1;

    public Bolo(double custo) {
        setCodigo(proximoCodigo++);
        setCusto(custo);
    }

    public Bolo(double custo, IFormato formato) {
        this(custo);
        setFormato(formato);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public IFormato getFormato() {
        return formato;
    }

    public void setFormato(IFormato formato) {
        this.formato = formato;
    }

    @Override
    public abstract double preco();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bolo)) return false;
        Bolo bolo = (Bolo) o;
        return this.codigo == bolo.codigo;
    }

    @Override
    public String toString() {
        return "Bolo{" +
                "codigo=" + codigo +
                ", custo=" + custo +
                ", formato=" + formato +
                '}';
    }
}
