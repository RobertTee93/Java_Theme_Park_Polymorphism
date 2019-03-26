package People;

public abstract class Person {

    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
