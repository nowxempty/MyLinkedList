class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue Front: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack Top: " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Added elements: 1, 2, 3");

        System.out.println("Iterating over list:");
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("Element at index 1: " + list.get(1));

        list.delete(1);
        System.out.println("After deleting element at index 1:");
        for (Integer i : list) {
            System.out.println(i);
        }

        MyLinkedList<Person> peopleList = new MyLinkedList<>();
        peopleList.add(new Person("Alice", 30));
        peopleList.add(new Person("Bob", 25));

        for (Person p : peopleList) {
            System.out.println(p);
        }
    }
}
