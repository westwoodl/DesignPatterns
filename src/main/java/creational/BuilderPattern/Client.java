package creational.BuilderPattern;

import org.junit.Test;

/**
 * 建造者模式：将一个复杂的对象的构建和它的表示分离，使得同样的构建过程可以创建不同的表示
 * @see Director 指挥者，负责安排复杂对象的建造次序
 */
public class Client {

    @Test
    public void test(){
        Builder builder = new ConcreteBuilder1();//通过配置文件获取
        Director director = new Director(builder);
        Product product = director.construct();
    }
}
