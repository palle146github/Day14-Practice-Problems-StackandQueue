package com.bridgelabz.datastructures;

public class QueueMain {
    public static void main(String[] args) {
    Queue<Integer> integerQueue = new Queue<>();

        integerQueue.enqueue(78);
        integerQueue.enqueue(56);
        integerQueue.enqueue(30);
        integerQueue.enqueue(70);
        integerQueue.queue.display();
        integerQueue.dequeue();
        integerQueue.queue.display();
    }
}
