package creational.FactoryMethodPattern;

public class ConcreteFactory implements Factory {
    @Override
    public Product getProduct(String arg){
        return new ConcreteProduct();
    }
}
