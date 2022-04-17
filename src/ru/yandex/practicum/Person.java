package ru.yandex.practicum;

public class Person {

    public static final String DEFAULT_NAME = "Username";

    private int age;
    private String name;

    static {
        System.out.println("Static block!");
    }

    {
        System.out.println("Init block!");
    }

    public Person() {
        System.out.println("Constructor!");
    }

    public Person(String name, int age) {
        this();
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAgeIsNotNegative(age);

        this.age = age;
    }

    private void checkAgeIsNotNegative(int age){
        if (age < 0) {
            throw new IllegalArgumentException("Age shouldn't be negative");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
