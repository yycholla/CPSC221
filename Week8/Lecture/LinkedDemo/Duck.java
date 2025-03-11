public class Duck {
    private String firstName, lastName;

    public Duck(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

// public class Duck {
//     private String firstName, lastName;
//     private Duck next;

//     public Duck(String firstName, String lastName) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.next = null;
//     }

//     public void setNext(Duck nextDuck) {
//         this.next = nextDuck;
//     }

//     public Duck getNext() {
//         return this.next;
//     }

//     public String toString() {
//         return firstName + " " + lastName;
//     }
// }
