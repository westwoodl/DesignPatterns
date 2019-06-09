package creational.BuilderPattern;

/**
 * 负责安排复杂对象的建造次序
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    //产品的构建
    public Product construct(){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }
}
