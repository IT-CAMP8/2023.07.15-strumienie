package pl.camp.it.strumienie;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,8,3,5,6,7,8,9,-30,2,4,8);

        System.out.println(list);

        List<Integer> result = list.stream()
                .sorted((i1, i2) -> i1 - i2)
                .toList();
        System.out.println(result);
    }
}
