package task2;

public class Apple implements Fruit {
    public static final float WEIGHT = 1.0f;

    @Override
    public float getWeight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}