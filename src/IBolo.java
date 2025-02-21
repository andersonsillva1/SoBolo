public interface IBolo extends IFormato {
    double getCusto();

    default double preco() {
        return getCusto() * area();
    }
}