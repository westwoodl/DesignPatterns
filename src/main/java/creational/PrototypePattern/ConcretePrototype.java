package creational.PrototypePattern;

import java.util.Objects;

public class ConcretePrototype implements Cloneable{
    private String arr;

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConcretePrototype)) return false;
        ConcretePrototype prototype = (ConcretePrototype) o;
        return Objects.equals(getArr(), prototype.getArr());
    }

}

