public abstract class Bolo implements IBolo {
    private int codigo;
    private double custo;
    private IFormato formato;

    public Bolo(int codigo, double custo) {
        setCodigo(codigo);
        setCusto(custo);
    }

    public Bolo(int codigo, double custo, IFormato formato) {
        this(codigo, custo);
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
    public double preco() {
        return custo * formato.area();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bolo bolo = (Bolo) o;
        return codigo == bolo.codigo;
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
