package Lesson4NubersHaveValue;

/**
 * Created by Алина on 03.10.2016.
 */
public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("%, d", 1000000);
        System.out.println(s);
    }
}
