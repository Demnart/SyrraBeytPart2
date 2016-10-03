package Lesson3StaticAndNoneStaticVariables;

/**
 * Created by Алина on 03.10.2016.
 */
public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.count);
        Player player = new Player();
        System.out.println(Player.count);
    }
}
