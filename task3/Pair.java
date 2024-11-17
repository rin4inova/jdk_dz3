package task3;

public class Pair<FirstType, SecondType> {
    private FirstType firstElement;
    private SecondType secondElement;

    public Pair(FirstType firstElement, SecondType secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public FirstType getFirstElement() {
        return firstElement;
    }

    public SecondType getSecondElement() {
        return secondElement;
    }

    @Override
    public String toString() {
        return "Первый элемент: " + firstElement + ", второй элемент: " + secondElement + ".";
    }
}
