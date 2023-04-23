package review.builder.demo1;

public interface Builder {
    void buildName();

    void buildCount();

    Clazz buildClazz();
}

class ClazzBuilder implements Builder {

    Clazz clazz = new Clazz();

    @Override
    public void buildName() {
        clazz.setName("一班");
    }

    @Override
    public void buildCount() {
        clazz.setCount("20");
    }

    @Override
    public Clazz buildClazz() {
        return clazz;
    }
}

class Director {
    public void constructor(Builder builder) {
        builder.buildName();
        builder.buildCount();
    }
}

class Clazz {
    private String name;

    private String count;

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}

class Client {
    public static void main(String[] args) {
        Builder clazzBuilder = new ClazzBuilder();
        Director director = new Director();
        director.constructor(clazzBuilder);
        Clazz clazz = clazzBuilder.buildClazz();
        System.out.println(clazz);
    }
}

