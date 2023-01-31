package com.bridgelabz.datastructures;

public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(70);
        integerStack.push(30);
        integerStack.push(56);
        integerStack.push(58);
        integerStack.push(39);
        integerStack.push(25);
        integerStack.stack.display();
        System.out.println("Size of Stack is " + integerStack.stack.size());
        integerStack.peak();
        integerStack.pop();
        integerStack.stack.display();
        while (integerStack.isEmplty() != 0){
            integerStack.peak();
            System.out.println("Size of Stack is " + integerStack.stack.size());
            integerStack.pop();
        }
    }
}
