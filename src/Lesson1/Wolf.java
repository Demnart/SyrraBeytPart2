package Lesson1;

/**
 * Created by Артем on 30.09.2016.
 */
public class Wolf extends Cannie {

    @Override
    void eat() {
        System.out.println("Волк грызет мясо");
    }

    @Override
    void makeNoice() {
        System.out.println("Волк воет");
    }
}
