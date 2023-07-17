package pl.camp.it.strumienie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ania", "Adam", "Wiesiek",
                "Zbyszek", "Alfred",
                "Karol", "Mateusz");

        list.stream()
                .filter(s -> s.startsWith("A"))
                .sorted(Comparator.naturalOrder())
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
