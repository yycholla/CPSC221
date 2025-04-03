package ItsNotALoopItsASpiral;
// import java.util.LinkedList;
// import java.util.Queue;

public class TicketCounter {
    private final static int PROCESS_TIME = 120;
    private final static int ARRIVAL_INTERVAL = 15;
    private final static int NUM_CUSTOMERS = 200;
    private final static int MAX_CASHIERS = 10;
    public static void main(String[] args) {
        QueueADT<Customer> customerQueue = new LinkedQueue<Customer>();
        // QueueADT<Customer> customerQueue = new CircularArrayQueue<Customer>(); // Line of customers circle array
        // Queue<Customer> customerQueue = new LinkedList<Customer>(); // Line of customers
        Customer customer; // current customer being served
        int totalTime; // Sum of all the time that all customers spent before entering the theater
        int averageTime; // Average wait time of all of the customers
        int startTime; // Beginning time of when cashier is serving the customer
        int departureTime; // when customer leaves
        int[] cashierTime = new int[MAX_CASHIERS]; // Clock time since last customer was served by cashier in seconds

        for (int cashiers = 1; cashiers <= MAX_CASHIERS; cashiers++) {
            // Load the customer queue with each arriving ARRIVAL_INTERVAL after the prior.
            for (int count = 1; count <= NUM_CUSTOMERS; count++) {
                customerQueue.enqueue(new Customer(count * ARRIVAL_INTERVAL));
            }
            // Init total customer wait time
            totalTime = 0;

            // Init cashier's time
            for (int i = 0; i < cashiers; i++) {
                cashierTime[i] = 0;
            }

            // Single cashier processing all customers
            while (!customerQueue.isEmpty()) {
                for (int i = 0; i < cashiers && !customerQueue.isEmpty(); i++) {
                    customer = customerQueue.dequeue();

                    // When does the cashier start to work with the customer?
                    // If there is no line
                    if (customer.getArrivalTime() > cashierTime[i]) {
                        startTime = customer.getArrivalTime();
                    } else {
                        // If there is a HUGE line
                        startTime = cashierTime[i];
                    }

                    departureTime = startTime + PROCESS_TIME;
                    customer.setDepartureTime(departureTime);
                    totalTime += customer.totalTime();
                    cashierTime[i] = departureTime;
                }
            }


            // print average wait time
            averageTime = totalTime / NUM_CUSTOMERS;
            System.out.println("Number of cashiers: " + cashiers);
            System.out.println("Average Time: " + averageTime/60 + " minutes, " + averageTime%60 + " seconds (" + averageTime + ")\n");

        }

    }
}
