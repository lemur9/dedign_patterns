package review.creatorPatterns.builder.demo2;

public class Builder {

    private Builder() {
    }

    public static Builder builder() {
        return new Builder();
    }

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

    public Clazz build() {
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
        Clazz clazz = Builder.builder().buildName("一班").buildCount("200").build();
        System.out.println(clazz);
    }
}




