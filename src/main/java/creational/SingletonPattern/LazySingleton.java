package creational.SingletonPattern;

/**
 * 双重检查锁的懒汉模式
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null)
                    instance = new LazySingleton();
            }
        }
        return instance;
    }
}
