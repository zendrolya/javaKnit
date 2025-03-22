package org.knit.solutions.lab2_5.task16;

public class Task16 {
    public static void Run() {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        Flyweight flyweight2 = factory.getFlyweight("B");
        Flyweight flyweight3 = factory.getFlyweight("A");

        flyweight1.operation("Первый вызов");
        flyweight2.operation("Второй вызов");
        flyweight3.operation("Третий вызов (тот же объект что и первый)");
    }
}
