package review.creatorPatterns.builder.test;

public interface Builder {

    void name(String name);

    void age(int age);

    Student build();
}

class StudentBuilder implements Builder {

    Student student = new Student();

    @Override
    public void name(String name) {
        student.setName(name);
    }

    @Override
    public void age(int age) {
        student.setAge(age);
    }

    @Override
    public Student build() {
        return student;
    }
}

class Director {
    public void constructor(Builder builder) {
        builder.name("lemur");
        builder.age(34);
    }
}

class Client {
    public static void main(String[] args) {
        Builder studentBuilder = new StudentBuilder();
        Director director = new Director();
        director.constructor(studentBuilder);
        Student build = studentBuilder.build();
        System.out.println(build);
    }
}

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
