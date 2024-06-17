package queuedatastructure;

public class QueueDemo {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(2);
        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(8);
        q1.enqueue(10);
        q1.enqueue(12);

        q1.printQueue();

        q1.dequeue();
        q1.dequeue();

        q1.printQueue();

        q1.dequeue();
        q1.dequeue();

        q1.printQueue();

        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.printQueue();



    }
}