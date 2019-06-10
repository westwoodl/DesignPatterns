package creational.PrototypePattern.deepclone;

import org.junit.Test;

import java.io.IOException;

public class Client {

    @Test
    public void test() throws IOException, ClassNotFoundException {

        DeepCloneableModel deep = new DeepCloneableModel();
        deep.setDate("date");
        deep.setReference(new ReferenceTypeClass("name"));

        //深克隆
        DeepCloneableModel deep2 = deep.deepClone();
        System.out.println(deep);
        System.out.println(deep2);
        System.out.println(deep == deep2);
        System.out.println(deep.getReference() == deep2.getReference());



    }
}
