package task2;

//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает
//true, если они одинаковые, и false в противном случае. Массивы могут быть любого типа
//данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по
//индексам.

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray1 = {1, 2, 3, 4, 5};
        Integer[] integerArray2 = {1, 2, 3, 4, 5};
        System.out.println("Массивы соответствуют условию: " + compareArrays(integerArray1, integerArray2));

        String[] stringArray1 = {"1", "2", "3", "4", "5"};
        String[] stringArray2 = {"1", "2", "3", "4", "5"};
        System.out.println("Массивы соответствуют условию: " + compareArrays(stringArray1, stringArray2));

        Apple[] appleArray1 = {new Apple(), new Apple(), new Apple(), new Apple(), new Apple()};
        Orange[] orangeArray1 = {new Orange(), new Orange(), new Orange(), new Orange(), new Orange()};
        System.out.println("Массивы соответствуют условию: " + compareArrays(appleArray1, orangeArray1));

        Float[] floatArray1 = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Float[] floatArray2 = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        System.out.println("Массивы соответствуют условию: " + compareArrays(floatArray1, floatArray2));

        Integer[] integerArray3 = {1, 2, 3, 4, 5};
        Integer[] integerArray4 = {1, 2, 3, 4, 5, 6};
        System.out.println("Массивы соответствуют условию: " + compareArrays(integerArray3, integerArray4));
    }

    public static <T> boolean compareArrays(T[] firstArray, T[] secondArray) {
        if (firstArray.length != secondArray.length) return false;

        for (int index = 0; index < firstArray.length; index++) {
            if (!firstArray[index].getClass().equals(secondArray[index].getClass())) return false;
        }
        return true;
    }
}