/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.datastructure.stack;

/**
 *
 * @author venkat
 */
public class Stack {

    int arr[];
    int capacity;
    int top;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("size: " + stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("size: " + stack.size());

        // stack.display();
    }
    public void push(int num) {
        if (isFull()) {
            System.out.println("Array is full");
        } else {
            arr[++top] = num;
        }
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Array is empty");
        } else {
            return arr[top--];
        }
        return -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Array is empty");
        } else {
            return arr[top];
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int size() {
        return top + 1;
    }
}

