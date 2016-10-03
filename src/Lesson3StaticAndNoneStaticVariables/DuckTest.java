package Lesson3StaticAndNoneStaticVariables;

/**
 * Created by Алина on 03.10.2016.
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck.numberOfDucks);
        System.out.println(duck1.numberOfDucks);
        System.out.println(duck2.numberOfDucks);
        // Почему программа выводит всегда 1. Вопрос кроется в том что при каждом новом создании обьекта, его переменные экземпляра
        // Обнуляються
    }
}
