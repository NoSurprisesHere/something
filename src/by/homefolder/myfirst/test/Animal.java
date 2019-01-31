package by.homefolder.myfirst.test;

public abstract class Animal {

    //public  - область видимости класса/метода/переменных.
// Public - самая широкая область видимости.
// Protected - распространяется на class, пакет, класс наследник
// Package(default) - распространяется на пакет, класс.
// private - класс
    public String name = "Alex";
    private int age = 24;

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

    public void eat() {
        System.out.println("im eating");

    }


}
