package Lesson1;

/**
 * Created by Артем on 30.09.2016.
 */
public abstract class Animal {// обьявляем абстрактный класс, это значи что мы никогда не сможем создать его экземпляр
    int size;
    int liocation;


   final void sleep(){// Устанавливаем final  для предотвращения возможности изменить данный класс в потомках
       System.out.println("Zzzzz");
   }
    abstract void eat();// Создаем абстрактный метод, каждый конкретный потомок обязан переопределить этот метод
    abstract void makeNoice();

}
