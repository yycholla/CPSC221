package ItsNotALoopItsASpiral;
// import java.util.Arrays;

public class CircularArrayQueue<E> implements QueueADT<E> {

    private final static int DEFAULT_CAPACITY = 100;
    private int front, rear, count;
    private E[] queue;

    public CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public CircularArrayQueue(int initialCapacity) {
        front = rear = count = 0;
        queue = (E[])(new Object[initialCapacity]);
    }

    @Override
    public void enqueue(E element) {
        if (size() == queue.length) {
            expandCapacity();
        }

        queue[rear] = element; // Insert element on rear
        rear = (rear + 1) % queue.length; // Increment rear keeping loop
        count++;
    }

    @Override
    public E dequeue() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Queue");
        }

        E result = queue[front]; // Grab front
        queue[front] = null; // Null to prevent memory leaks
        front = (front + 1) % queue.length; // increment front accounting for circular structure
        count--; // decrement count
        return result;
    }

    @Override
    public E first() {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Queue");
        }

        return queue[front];
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
        String result = "[";
        int index = this.front;

        for (int i = 0; i< this.size(); i++) {
            if (i > 0) {
                result += ", ";
            }
            result += queue[index];
            index = (index + 1) % queue.length;
        }

        result += "]";
        return result;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        // this.queue = Arrays.copyOf(queue, queue.length*2); - This does not work since it will add elements in the middle of the circle we currently have
        E[] larger = (E[])(new Object[queue.length*2]);
        int index = this.front;
        for (int i = 0; i< this.size(); i++) {
            larger[i] = queue[index];
            index = (index + 1) % queue.length;
        }

        front = 0;
        rear = this.size();
        queue = larger;

    }

}
