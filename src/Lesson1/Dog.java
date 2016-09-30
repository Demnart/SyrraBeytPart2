package Lesson1;

/**
 * Created by Артем on 30.09.2016.
 */
public class Dog extends Cannie implements HomePets {// Наш экземпляр не только расширяет класс Собачие, но так же наследует характерные черты Домашних питомцев
    // благодаря наследованию из интерфейса

    @Override
    void eat() {
        System.out.println("Собака ест кость");
    }

    @Override
    void makeNoice() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void beFriendly() {// Метод интерфейса. Так как интерфейсы подобны абстрактным классам мы обязаны переопределить данный метод!!!!
        System.out.println("Собака играет");
    }
}
