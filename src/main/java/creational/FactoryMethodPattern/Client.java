package creational.FactoryMethodPattern;

import org.junit.Test;

/**
 * 工厂方法模式
 *     定义一个用于创建对象的工厂接口，让实现类决定将那个类实例化
 */
public class Client {
    @Test
    public void test(){
        Factory factory;
        factory  = new ConcreteFactory();// 可以通过配置文件获得
        Product p = factory.getProduct("A");
    }
}
