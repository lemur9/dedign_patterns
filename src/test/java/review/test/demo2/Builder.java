package review.test.demo2;

public class Builder {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Builder buildName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder buildAge(int age) {
        this.age = age;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}

class Student {
    private String name;
    private int age;

    public Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Student lemur = builder.buildAge(23).buildName("lemur").build();
        System.out.println(lemur);
    }
}
