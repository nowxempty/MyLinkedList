import java.util.NoSuchElementException;

public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T data = list.get(list.size() - 1);
        list.delete(list.size() - 1);
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
