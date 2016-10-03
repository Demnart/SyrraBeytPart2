package Lesson3StaticAndNoneStaticVariables;

/**
 * Created by Алина on 03.10.2016.
 */
public class Duck1 {
    int size;
   static int numberOfDucks = 0;

    public Duck1() {
        numberOfDucks++;
    }
}
