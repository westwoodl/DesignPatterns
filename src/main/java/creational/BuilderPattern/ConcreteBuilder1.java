package creational.BuilderPattern;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildA() {
        product.setA("a");
    }

    @Override
    public void buildB() {
        product.setA("b");
    }

    @Override
    public void buildC() {
        product.setA("c");
    }
}
