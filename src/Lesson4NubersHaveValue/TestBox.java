package Lesson4NubersHaveValue;

/**
 * Created by Алина on 03.10.2016.
 */
public class TestBox {
    Integer i =1;
    int a = 0;

    public static void main(String[] args) {
        TestBox testBox = new TestBox();
        testBox.go();
    }

    public void go() {
        a = i;
        System.out.println(a);
        System.out.println(i);
    }
}
