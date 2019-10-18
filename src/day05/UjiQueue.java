package day05;

public class UjiQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(8);
        q.enqueue(5);
        q.enqueue(1);

        q.dequeue();

        q.print();
    }
}
