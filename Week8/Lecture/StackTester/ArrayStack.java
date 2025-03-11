package Week7.Lecture.StackTester;

import java.util.Arrays;

public class ArrayStack<E> implements StackADT<E> {

    private final int DEFAULT_CAPACITY = 100;
    private E[] stack;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.top = 0;
        this.stack = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        this.top = 0;
        this.stack = (E[]) new Object[initialCapacity];
    }

    @Override
    public void push(E element) {
        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }

    @Override
    public E pop() {
        if (isEmpty()) { throw new EmptyCollectionException("Stack"); }
        top--;
        E result = this.stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public E peek() {
        if (isEmpty()) { throw new EmptyCollectionException("Stack"); }
        return this.stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return top;
    }

    public String toString() {
        String result = "";
        for (E item : stack) {
            result += "[" + item + "] ";
        }
        return result;
    }

    private void expandCapacity() {
        this.stack = Arrays.copyOf(stack, stack.length*2);
    }

}
