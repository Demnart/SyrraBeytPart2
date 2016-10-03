package Lesson2ConcstructorsAndMemory;

/**
 * Created by Алина on 03.10.2016.
 */
public class Constructor {
    int size;// переменная класса(поле) создаеться вместе с каждым новым обьектом

    public Constructor() {// конструктор не принимающий никаких параметров
    }

    public Constructor(int size) {// конструктор принимающий целочисленное число в качестве параметра и выводит его на экран

        this.size = size;
        System.out.println(this.size);
    }

    public int getSize() {// возвращает поле класса
        return size;
    }

    public void setSize(int size) {//через параметр передаеться значенние переменной класса
        this.size = size;
    }
}
