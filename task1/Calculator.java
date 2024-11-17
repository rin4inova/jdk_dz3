package task1;

public class Calculator {
    // Метод сложения
    public static <T extends Number> double add(T firstValue, T secondValue) {
        return firstValue.doubleValue() + secondValue.doubleValue();
    }

    // Метод вычитания
    public static <T extends Number> double subtract(T firstValue, T secondValue) {
        return firstValue.doubleValue() - secondValue.doubleValue();
    }

    // Метод умножения
    public static <T extends Number> double multiply(T firstValue, T secondValue) {
        return firstValue.doubleValue() * secondValue.doubleValue();
    }

    // Метод деления
    public static <T extends Number> double divide(T numerator, T denominator) {
        if (denominator.doubleValue() == 0) {
            throw new ArithmeticException("Нельзя делить на ноль!");
        }
        return numerator.doubleValue() / denominator.doubleValue();
    }
}
