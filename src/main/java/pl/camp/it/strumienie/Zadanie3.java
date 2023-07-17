package pl.camp.it.strumienie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zadanie3 {
    /*Mamy liste intów
    szukamy tylko intów większych od 3 i mniejszych od 10 bez duplikatów
    chcemy wypisać tylko pierwszą znalezioną liczbę w postaci Liczba: x
    */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,32,8,23,7,3,7,2,65,23,3,67,45,8,34,54,9,432,8,345);

        list.stream()
                .filter(x -> x > 3)
                .filter(x -> x < 10)
                .distinct()
                .limit(1)
                .map(i -> "Liczba: " + i)
                .forEach(System.out::println);
    }
}
