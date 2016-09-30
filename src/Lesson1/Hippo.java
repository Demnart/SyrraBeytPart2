package Lesson1;

/**
 * Created by Артем on 30.09.2016.
 */
public class Hippo extends Animal {
    @Override
    void eat() {
        System.out.println("Гипопотам ест траву");
    }

    @Override
    void makeNoice() {
        System.out.println("Гипопотам рычит");
    }
}
