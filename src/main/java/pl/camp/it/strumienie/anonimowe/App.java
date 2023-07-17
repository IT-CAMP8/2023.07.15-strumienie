package pl.camp.it.strumienie.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(10);
        list.add(0);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", 500.0));
        cars.add(new Car("Audi", "A5", 700.0));
        cars.add(new Car("Toyota", "Corolla", 400.0));
        cars.add(new Car("Kia", "Ceed", 300.0));

        System.out.println(cars);
        Collections.sort(cars, (car1, car2) -> car1.getBrand().compareTo(car2.getBrand()));
        /*Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });*/
        System.out.println(cars);

        Collections.sort(cars, (car1, car2) -> -car1.getBrand().compareTo(car2.getBrand()));
        System.out.println(cars);

        JakisInterfejs obiektNaBazieInterfejsu = new JakisInterfejs() {
            @Override
            public void x() {
                System.out.println("metoda x !!");
            }

            @Override
            public void y() {
                System.out.println("metoda y !!");
            }

            @Override
            public void z() {
                System.out.println("metoda z !!");
            }
        };

        obiektNaBazieInterfejsu.x();
        obiektNaBazieInterfejsu.y();
        obiektNaBazieInterfejsu.z();

        Abstrakcyjna abstrakcyjna = new Abstrakcyjna() {
            @Override
            void cos() {
                System.out.println("cos z klasy abstrakcyjnej !!");
            }
        };

        abstrakcyjna.cos();

        NieAbstrakcyjna nieAbstrakcyjna = new NieAbstrakcyjna();
        nieAbstrakcyjna.metoda();

        NieAbstrakcyjna nieAbstrakcyjna2 = new NieAbstrakcyjna() {
            @Override
            public void metoda() {
                System.out.println("metoda przeslonieta !!");
            }
        };

        nieAbstrakcyjna2.metoda();

        //AbstractFunctional abstractFunctional = () -> System.out.println("");
    }
}
