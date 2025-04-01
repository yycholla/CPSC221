public class Customer {
    private int arrivalTime, departureTime;

    public Customer(int arrivalTime) {
        this.arrivalTime = arrivalTime;
        departureTime = Integer.MAX_VALUE;
    }

    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getDepartureTime() {
        return this.departureTime;
    }

    public int totalTime() {
        return this.departureTime - this.arrivalTime;
    }

    public String toString() {
        return Integer.toString(arrivalTime);
    }
}
