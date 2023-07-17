package pl.camp.it.strumienie.functional;

import pl.camp.it.strumienie.anonimowe.Car;
import pl.camp.it.strumienie.anonimowe.SuperFunkcja;

import java.util.Comparator;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "Liczba: " + i;

        String s = function.apply(5);
        System.out.println(s);
        System.out.println(function.apply(10));
        System.out.println(function.apply(15));

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();

        System.out.println(biFunction.apply("ABC", "akshjd"));
        System.out.println(biFunction.apply("akjshdgjh", "ajksh"));
        System.out.println(biFunction.apply("silkdjhf", "kajshdgkfjhask"));
        System.out.println(biFunction.apply("kjsahd", "hausgdkhgakj"));

        UnaryOperator<Integer> unaryOperator = i -> i * 100;

        System.out.println(unaryOperator.apply(10));
        System.out.println(unaryOperator.apply(3));
        System.out.println(unaryOperator.apply(19));

        Predicate<Car> predicate = car -> car.getPrice() > 350.00;

        System.out.println(predicate.test(new Car("asdf", "gfds", 200.00)));
        System.out.println(predicate.test(new Car("asdf", "gfds", 300.00)));
        System.out.println(predicate.test(new Car("asdf", "gfds", 400.00)));
        System.out.println(predicate.test(new Car("asdf", "gfds", 500.00)));

        Supplier<Car> defaultCarSupplier = () -> new Car("default", "", 0.0);

        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());

        Consumer<Car> consumer = car -> System.out.println("Marka: " + car.getBrand() + " Model: " + car.getModel());

        consumer.accept(new Car("BMW", "3", 500.0));
        consumer.accept(new Car("Audi", "A5", 700.0));
        consumer.accept(defaultCarSupplier.get());

        Comparator<Car> carComparator = (car1, car2) -> {
            int brandResult = car1.getBrand().compareTo(car2.getBrand());
            if(brandResult != 0) {
                return brandResult;
            }
            int modelResult = car1.getModel().compareTo(car2.getBrand());
            if(modelResult != 0) {
                return modelResult;
            }
            return (int) (car1.getPrice() - car2.getPrice());
        };

        Consumer<Car> carConsumer = System.out::println;
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;

        SuperFunkcja superFunkcja = (a, b, c, d) -> a*b + c*d;
        System.out.println(superFunkcja.apply(1,2,3,4));

        SuperFunkcja superFunkcja2 = (a,b,c,d) -> a*c + b*d;
        System.out.println(superFunkcja2.apply(2,3,4,5));

        int x = 10;
        Function<Integer, Integer> f1 = i -> (i + x) * 10;
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return (integer + x) * 10;
            }
        };

        System.out.println(f.apply(3));
        //x = 11;
        System.out.println(f.apply(3));
    }
}
