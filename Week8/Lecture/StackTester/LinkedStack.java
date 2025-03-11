public class LinkedStack<E> implements StackADT<E> {
    private int count;
    private LinearNode<E> top;

    public LinkedStack() {
        this.count = 0;
        this.top = null;
    }

    @Override
    public void push(E element) {
        LinearNode<E> temp = new LinearNode<LinkedStack.E>(element);
        temp.setNext(top);
        top = temp;
        temp = null;
        count++;
    }

    @Override
    public E pop() {
        E result = peek();
        this.top = this.top.getNext();
        count--;
        return result;
    }

    @Override
    public E peek() {
        if (isEmpty()) { throw new EmptyCollectionException("stack"); }
        return this.top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return count;
    }

    public String toString() {
        return ""; //TODO this
    }


}
