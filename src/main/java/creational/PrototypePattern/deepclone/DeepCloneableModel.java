package creational.PrototypePattern.deepclone;

import java.io.*;

public class DeepCloneableModel implements Serializable {
    private ReferenceTypeClass reference;
    private String date;

    @Override
    public String toString() {
        return "DeepCloneableModel{" +
                "reference=" + reference +
                ", date='" + date + '\'' +
                '}';
    }

    public ReferenceTypeClass getReference() {
        return reference;
    }

    public void setReference(ReferenceTypeClass reference) {
        this.reference = reference;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DeepCloneableModel deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象写入内存中并读出
        return (DeepCloneableModel)(new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray())).readObject());
    }
}
class ReferenceTypeClass implements Serializable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public ReferenceTypeClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ReferenceTypeClass{" +
                "name='" + name + '\'' +
                '}';
    }
}