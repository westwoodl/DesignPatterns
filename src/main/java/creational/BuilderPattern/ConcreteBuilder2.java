package creational.BuilderPattern;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildA() {
        product.setA("a1");
    }

    @Override
    public void buildB() {
        product.setA("b1");
    }

    @Override
    public void buildC() {
        product.setA("c1");
    }
}
