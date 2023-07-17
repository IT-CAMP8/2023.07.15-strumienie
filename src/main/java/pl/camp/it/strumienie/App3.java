package pl.camp.it.strumienie;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App3 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        /*list.stream().flatMap(Collection::stream)
                .forEach(x -> System.out.print(x + ","));*/

        List<Client> clients = Arrays.asList(
                new Client("Janusz", "Nazwisko1"),
                new Client("Ania", "Nazwisko2"),
                new Client("Zbyszek", "Nazwisko3"),
                new Client("Janusz", "Nazwisko4"),
                new Client("Ania", "Nazwisko5"),
                new Client("Karol", "Nazwisko6"),
                new Client("Janusz", "Nazwisko7")
        );

        Map<String, List<Client>> grupy = clients.stream().collect(Collectors.groupingBy(Client::getName));

        //System.out.println(grupy);

        List<Integer> list2 = Arrays.asList(1,2,3,4,8,3,5,6,7,8,9,-30,2,4,8);
        int sum = list2.stream()
                .reduce(0, (acc, element) -> acc + element);
        System.out.println(sum);

        List<String> strings = Arrays.asList("A", "B", "C", "D", "E");

        String wynik = strings.stream()
                .reduce("", (acc, s) -> acc + s);

        System.out.println(wynik);

        int min = list2.stream()
                .reduce(list2.get(0), (acc, l) -> acc > l ? l : acc);

        System.out.println(min);
    }
}
