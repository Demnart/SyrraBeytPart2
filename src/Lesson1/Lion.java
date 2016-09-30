package Lesson1;

/**
 * Created by Артем on 30.09.2016.
 */
public class Lion extends Feline {
    @Override
    void eat() {
        System.out.println("Лев ест мясо");
    }

    @Override
    void makeNoice() {
        System.out.println("Лев рычит");
    }
}
