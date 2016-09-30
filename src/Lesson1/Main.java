package Lesson1;

import java.util.ArrayList;

/**
 * Created by Артем on 30.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();// Создаем обертку для массива и ограничиваем ее обьектом Animal и его потомками
        list.add(0, new Dog());// Устанавливаем в каждый определенный индекс новый обьект: Собаку,Кошку и т.д.
        list.add(1, new Cat());
        list.add(2, new Lion());
        list.add(3, new Tiger());
        list.add(4, new Wolf());
        list.add(5, new Hippo());

        for (Animal animal : list) {// Пробегаемся по массиву list  и присваеваем каждому animal  индекс массива
            animal.eat();// вызываем метод, если методо переопределен в потомке то будет вызван он, если нет то будет вызван метод родителя
            animal.makeNoice();
            animal.sleep();
            System.out.println();
        }
    }
}
