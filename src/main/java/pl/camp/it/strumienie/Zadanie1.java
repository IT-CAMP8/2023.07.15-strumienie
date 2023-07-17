package pl.camp.it.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

        int sum = 0;
        int evenCounter = 0;
        for (int element : list) {
            if(element % 2 == 0) {
                sum += element;
                evenCounter++;
            }
        }
        double avg = ((double) sum) / ((double) evenCounter);
        System.out.println(avg);

        System.out.println(list.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(i -> i)
                .average().getAsDouble());
    }
}
