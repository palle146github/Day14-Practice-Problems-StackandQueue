package com.bridgelabz.datastructures;

public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(70);
        integerStack.push(30);
        integerStack.push(56);
        integerStack.stack.display();
        System.out.println("Size of Stack is " + integerStack.stack.size());
    }
}
