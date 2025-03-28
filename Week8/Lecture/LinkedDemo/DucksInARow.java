public class DucksInARow {
    public static void main(String[] args) {
        LinearNode<Duck> first = new LinearNode<Duck>(new Duck("Daffy", "Duck"));
        first.setNext(new LinearNode<Duck>(new Duck("Donald", "Duck")));
        first.getNext().setNext(new LinearNode<Duck>(new Duck("Scrooge", "McDuck")));
        first.getNext().getNext().setNext(new LinearNode<Duck>(new Duck("Darkwing", "Duck")));
        LinearNode<Duck> temp = new LinearNode<Duck>(new Duck("Howard", "The Duck"));

        System.out.println("*** Original");
        LinearNode<Duck> current = first;
        // Loop begins
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }

        temp.setNext(first);
        first = temp;
        temp = null;

        System.out.println("\n***** Add Howard");
        current = first;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }

        first = first.getNext();

        System.out.println("\n***** Get rid of Howard");
        current = first;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}

// public class DucksInARow {
//     public static void main(String[] args) {
//         Duck first = new Duck("Daffy", "Duck");
//         first.setNext(new Duck("Donald", "Duck"));
//         first.getNext().setNext(new Duck("Scrooge", "McDuck"));
//         first.getNext().getNext().setNext(new Duck("Darkwing", "Duck"));
//         Duck temp = new Duck("Howard", "The Duck");


//         // System.out.println(first);

//         System.out.println("*** Original");
//         Duck current = first;
//         // Loop begins
//         while (current != null) {
//             System.out.println(current);
//             current = current.getNext();
//         }

//         temp.setNext(first);
//         first = temp;
//         temp = null;

//         System.out.println("\n***** Add Howard");
//         current = first;
//         while (current != null) {
//             System.out.println(current);
//             current = current.getNext();
//         }

//         first = first.getNext();

//         System.out.println("\n***** Get rid of Howard");
//         current = first;
//         while (current != null) {
//             System.out.println(current);
//             current = current.getNext();
//         }
//     }
// }
