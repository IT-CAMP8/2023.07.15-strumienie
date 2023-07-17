package pl.camp.it.strumienie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Zadanie5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32,5,5674,23,453,23,7,8,324,36,65,34,45,87,23,567,43);

        /*final int min = list.stream()
                .min(Comparator.comparingInt(i -> i)).get();
        int secondMin = list.stream()
                .filter(i -> i != min)
                .min(Comparator.comparingInt(i -> i)).get();

        System.out.println(secondMin);*/

        int second = list.stream()
                .sorted(Comparator.comparingInt(i -> i))
                .skip(1)
                .findFirst().get();
        System.out.println(second);
    }
}
