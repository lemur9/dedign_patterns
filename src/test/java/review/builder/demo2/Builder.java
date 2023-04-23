package review.builder.demo2;

public class Builder {
    private String name;

    private String count;

    public Builder buildName(String name) {
        this.name = name;
        return this;
    }

    public Builder buildCount(String count) {
        this.count = count;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getCount() {
        return count;
    }

    public Clazz builder() {
        return new Clazz(this);
    }
}

class Clazz {
    private String name;

    private String count;

    public Clazz(Builder builder) {
        this.name = builder.getName();
        this.count = builder.getCount();
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
        Builder builder = new Builder();
        Clazz clazz = builder.buildName("一班").buildCount("200").builder();
        System.out.println(clazz);
    }
}




