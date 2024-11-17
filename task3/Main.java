package task3;

import task2.Orange;
import task2.Apple;

//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//Класс должен иметь методы getFirst(), getSecond() для получения значений каждого
// из составляющих пары, а также переопределение метода toString(), возвращающее
// строковое представление пары.
public class Main {
    public static void main(String[] args) {
        Pair<Orange, Apple> fruitPair = new Pair<>(new Orange(), new Apple());
        System.out.println(fruitPair);
    }
}
