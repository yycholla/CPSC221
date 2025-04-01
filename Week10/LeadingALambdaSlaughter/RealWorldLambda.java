package LeadingALambdaSlaughter;

import java.util.Arrays;

public class RealWorldLambda {
    public static void main(String[] args) {
        Integer[] grades = { 16, 3, 1000, 42, 666, 23, 1, 13, 63 };

        Arrays.sort(grades, (numberOne, numerTwo) -> numberOne.compareTo(numerTwo));

        for (Integer integer : grades) {
            System.out.println(integer);
        }
    }
}
