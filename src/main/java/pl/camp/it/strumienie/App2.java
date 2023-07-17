package pl.camp.it.strumienie;

import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,4,6,7,8);

        list.stream()
                .filter(x -> x > 3)
                .peek(System.out::println)
                .sorted()
                .limit(1)
                .forEach(System.out::println);


        List<Client> clients = Arrays.asList(
                new Client("Imie1", "Nazwisko1"),
                new Client("Imie2", "Nazwisko2"),
                new Client("Imie3", "Nazwisko3"),
                new Client("Imie4", "Nazwisko4"),
                new Client("Imie5", "Nazwisko5"),
                new Client("Imie6", "Nazwisko6"),
                new Client("Imie7", "Nazwisko7")
        );

        clients.forEach(c -> c.setName("X"));
        clients.stream().limit(1).forEach(System.out::println);

        System.out.println(clients);
    }
}
