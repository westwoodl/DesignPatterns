package creational.BuilderPattern;

public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();

    public Product getProduct() {
        return product;
    }
}
