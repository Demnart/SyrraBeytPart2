package Lesson2ConcstructorsAndMemory;

/**
 * Created by Алина on 03.10.2016.
 */
public class SonOfBoo extends Boo {

    public SonOfBoo() {
        super("boo");
    }

    public SonOfBoo(int i) {
        super("Fred");
    }

    public SonOfBoo(String s) {
        super(15);
    }


    // Данный конструктор выдаст ошибку так как не важно какие параметры принимает конструктор, если он пытаеться передать эти па
    //раметры в конструктор родителя и они не проходят проверку на соответсвие это вызывает ошибку!!!
//    public SonOfBoo(String a, String b, String c) {
//        super(a,b);
//    }
    public SonOfBoo(int i, int j) {
        super("man", j);
    }
    // Данный конструктор выдаст ошибку так как не важно какие параметры принимает конструктор, если он пытаеться передать эти па
    //раметры в конструктор родителя и они не проходят проверку на соответсвие это вызывает ошибку!!!
//    public SonOfBoo(int i, int x, int y) {
//        super(i,"man");
//    }
}
