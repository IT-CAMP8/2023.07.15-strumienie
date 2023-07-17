package pl.camp.it.strumienie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {
        List<Client> list = new ArrayList<>();
        list.add(new Client("Janusz", "Kowalski"));
        list.add(new Client("Zbyszek", "Malinowski"));
        list.add(new Client("Wiesiek", "Jakis"));
        list.add(new Client("Mateusz", "Bereda"));

        list.stream()
                //.filter(c -> c.getName().equals("Janusz"))
                .peek(c -> c.setName("Y"))
                .forEach(c -> c.setSurname("X"));
                //.toList();

        //new LinkedList<>(list2);

        System.out.println(list);
    }
}
