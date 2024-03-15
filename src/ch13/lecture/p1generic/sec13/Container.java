package ch13.lecture.p1generic.sec13;

public class Container<T> {
    private T item;

    public void set(T param) {
        item = param;
    }

    public T get() {
        return item;
    }
}