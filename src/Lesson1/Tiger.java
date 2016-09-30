package Lesson1;

/**
 * Created by Артем on 30.09.2016.
 */
public class Tiger extends Feline {
    @Override
    void eat() {
        System.out.println("Тигр ест мясо");
    }

    @Override
    void makeNoice() {
        System.out.println("Тигр рычит");
    }
}
