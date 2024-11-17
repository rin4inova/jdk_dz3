package task1;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические
// методы: sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа
// разного типа, над которыми должна быть произведена операция. Методы должны
// возвращать результат своей работы.

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3, 1.5f));
        System.out.println(Calculator.subtract(3, 1.5f));
        System.out.println(Calculator.multiply(3, 1.5f));
        System.out.println(Calculator.divide(3, 1.5f));
    }
}
