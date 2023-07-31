package pl.camp.it.strumienie.optional;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class App2 {
    public static void main(String[] args) {
        Optional<Integer> integerBox = Optional.empty();

        Integer integer = integerBox.orElseGet(() -> 5);
        System.out.println(integer);

        integerBox.orElseThrow(() -> new RuntimeException());
    }
}
