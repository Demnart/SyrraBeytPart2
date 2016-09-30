package Lesson1;

/**
 * Created by Артем on 30.09.2016.
 */
public class Cat extends Feline implements HomePets{

    @Override
    void eat() {
        System.out.println("Кошка всеядная");
    }

    @Override
    void makeNoice() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void beFriendly() {
        System.out.println("Кошка мурчит");
    }
//    void sleep(){ Java выдает ошибку! Нельзя переопределить метод помеченный как final!!!
//        System.out.println("Zzzz");
//    }
}
