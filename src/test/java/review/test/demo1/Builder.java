package review.test.demo1;

public abstract class Builder {

    abstract void buildName();

    abstract void buildAge();

    abstract Student createObj();

}

class StudentBuilder extends Builder {

    protected Student student = new Student();

    @Override
    void buildName() {
        student.setName("lemur");
    }

    @Override
    void buildAge() {
        student.setAge(23);
    }

    @Override
    Student createObj() {
        return student;
    }
}

class Director {
    Student getStudent(Builder builder) {
        builder.buildName();
        builder.buildAge();
        return builder.createObj();
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

class Client {
    public static void main(String[] args) {
        Builder studentBuilder = new StudentBuilder();
        Director director = new Director();
        Student student = director.getStudent(studentBuilder);
        System.out.println(student);
    }
}