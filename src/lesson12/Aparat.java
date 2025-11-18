package lesson12;

public class Aparat <T> {

    private T value;

    public Aparat() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Aparat{" +
                "value=" + value +
                '}';
    }
}
