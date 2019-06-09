package creational.AbstractFactoryPattern;

import org.junit.Test;

/**
 * 抽象工厂模式
 *     提供一个创建一系列相关或互相依赖对象的接口，而无须指定它们具体的类
 */
public class Client {
    @Test
    public void test(){
        Factory factory = new ConcreteFactory1();
        factory.getProductA();
        factory.getProductB();
    }
}
