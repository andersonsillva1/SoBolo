public interface IBolo extends IFormato {

    public double preco() {
        return custo * formato.area();
    }
}


