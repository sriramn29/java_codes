package queuedatastructure;

public class Queue {
    int q[] = new int[10];
    int FirstIndex;
    int LastIndex;

    Queue() {
        FirstIndex = LastIndex = -1;
    }

    void enqueue(int item) {
        if(FirstIndex == -1 || LastIndex == -1) {
            FirstIndex = FirstIndex + 1;
            LastIndex = LastIndex + 1;
            q[LastIndex] = item;
        }
        else if (FirstIndex != -1 || LastIndex != -1) {
            LastIndex = LastIndex + 1;
            q[LastIndex] = item;
        }
        else {
            System.out.println("Queue is Full");
        }
    }

    void dequeue() {
        if(FirstIndex > LastIndex) {
            System.out.println("Queue is Empty");
        }
        else {
            FirstIndex = FirstIndex + 1;
        }
    }

    int printQueue() {
        for(int i = FirstIndex; i <= LastIndex; i++) {
            System.out.println(q[i]);
        }
        return 0;
    }
}