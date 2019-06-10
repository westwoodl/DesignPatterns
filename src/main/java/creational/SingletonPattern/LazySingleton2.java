package creational.SingletonPattern;
/**
 * 静态内部类实现懒汉模式
 */
public class LazySingleton2 {

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance(){
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static LazySingleton2 instance = new LazySingleton2();
    }
}
