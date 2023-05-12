package review.behavioralPatterns.template;

public abstract class Template {

    public void execution() {
        first();
        second();
        third();
        fourth();
        fifth();
    }

    private void first() {
        System.out.println("一");
    }

    private void second() {
        System.out.println("二");
    }

    abstract void third();

    abstract void fourth();

    private void fifth() {
        System.out.println("五");
    }
}

class AlbTemplate extends Template {

    @Override
    void third() {
        System.out.println("3");
    }

    @Override
    void fourth() {
        System.out.println("4");
    }
}

class Client {
    public static void main(String[] args) {
        Template albTemplate = new AlbTemplate();
        albTemplate.execution();
    }
}
