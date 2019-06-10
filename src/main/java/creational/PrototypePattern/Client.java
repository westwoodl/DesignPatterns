package creational.PrototypePattern;

import org.junit.Test;

/**
 * 原型模式：克隆模式
 *     java中Object有clone方法和Cloneable接口，浅克隆
 *     被克隆的类中的引用类型必须也要实现Clone able接口，深克隆
 *     深克隆的另一种实现方式：序列化
 */
public class Client {
    @Test
    public void test(){
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setArr("hhh");

        try {
            System.out.println(prototype.clone() == prototype);
            System.out.println(prototype.clone().equals(prototype));
            System.out.println(prototype);
            System.out.println(prototype.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
