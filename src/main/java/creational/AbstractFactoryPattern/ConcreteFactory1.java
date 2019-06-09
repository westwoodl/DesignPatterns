package creational.AbstractFactoryPattern;


public class ConcreteFactory1 implements Factory {

    @Override
    public Product getProductA() {
        return new ConcreteProductA();
    }

    @Override
    public Product getProductB() {
        return new ConcreteProductB();
    }
}
