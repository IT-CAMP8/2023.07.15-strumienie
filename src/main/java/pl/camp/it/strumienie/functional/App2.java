package pl.camp.it.strumienie.functional;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        int result = getDataAndCalculate(App2::getDataFromFile, App2::calculate2);
        System.out.println(result);
    }

    //supplier
    public static int getDataFromDB() {
        System.out.println("Pobieram dane z bazy !!!");
        return 10;
    }

    //supplier
    public static int getDataFromFile() {
        System.out.println("Pobieram dane z pliku !!!");
        return 15;
    }

    //supplier
    public static int getDataFromUser() {
        System.out.println("Pobieram dane od usera !!!");
        return 25;
    }

    //unaryOperator
    public static int calculate1(int a) {
        System.out.println("liczenie sposobem 1 !!!");
        return a * 10;
    }

    //unaryOperator
    public static int calculate2(int a) {
        System.out.println("liczenie sposobem 2 !!!");
        return a * 13;
    }

    //unaryOperator
    public static int calculate3(int a) {
        System.out.println("liczenie sposobem 3 !!!");
        return a * 19 + 7;
    }

    public static int getDataAndCalculate(Supplier<Integer> getAlgorithm,
                                          UnaryOperator<Integer> calculator) {
        return calculator.apply(getAlgorithm.get());
    }
}