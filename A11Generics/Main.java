class Box<T> {
    private T t;  // T stands for "Type"

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println(integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());
    }
}