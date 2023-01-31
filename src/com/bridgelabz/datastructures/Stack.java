package com.bridgelabz.datastructures;

public class Stack<E extends Comparable<E>> {
    LinkedList<E> stack;

    public Stack(){
        stack = new LinkedList<>();
    }


    public void push(E key) {
        stack.push(key);
    }

    public void peak() {
        System.out.println(stack.head.key);
    }
}
