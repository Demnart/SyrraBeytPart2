package Lesson2ConcstructorsAndMemory;

/**
 * Created by Алина on 03.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Constructor constructor = new Constructor(15);//Создаем экземпляр обьекта имеющий конструктор принимающий параметры
        Constructor constructor2 = new Constructor();//Создаем экземпляр обьекта с пустым конструктором
        constructor2.setSize(30);//ели конструктор обьекта пуст мы устанавливаем значение полю класса через сеттер
        System.out.println(constructor2.getSize());//и получаем его через геттер
    }
}
