package pl.camp.it.strumienie.optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<Integer> intBox = getInt();
        if(intBox.isPresent()) {
            Integer liczba = intBox.get();
            System.out.println(liczba);
        } else {
            System.out.println("Nie ma piątki !!!");
        }

        //System.out.println(intBox.get());
        System.out.println(intBox.orElse(8));

        Optional<List<Integer>> integerListBox = Optional.of(new ArrayList<>());
    }

    public static Optional<Integer> getInt() {
        return Optional.of(5);
        //return Optional.empty();
    }
}
