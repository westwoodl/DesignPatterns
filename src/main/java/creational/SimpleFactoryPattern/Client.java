package creational.SimpleFactoryPattern;

import org.junit.Test;

/**
 * 简单工厂方法
 *     提供一个静态工厂方法，创建产品对象
 */
public class Client {

    @Test
    public void test() {

        Factory.getProduct("A").methodDiff();
    }
}