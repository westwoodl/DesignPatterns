package creational.SimpleFactoryPattern;

public class Factory {
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A"))
            product = new ConcreteProduct();
        else if (arg.equalsIgnoreCase("B"))
            product = new ConcreteProduct();

        return product;
    }
}
