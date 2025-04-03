package ItsNotALoopItsASpiral;

public class LinkedQueue<E> implements QueueADT<E> {

    private int count;
    private LinearNode<E> front, rear;

    public LinkedQueue() {
        count = 0;
        front = rear = null;
    }

    @Override
    public void enqueue(E element) {
        LinearNode<E> node = new LinearNode<E>(element);
        if (isEmpty()) {
            front = node;
        } else {
            rear.setNext(node);
        }
        rear = node;
        count++;
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Queue");
        }
        E result = front.getElement();
        front = front.getNext(); // Set new front, GC catches old front
        count--;
        if (isEmpty()) {
            rear = null;
        }
        return result;
    }

    @Override
    public E first() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Queue");
        }
        return front.getElement();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return count;
    }

}
