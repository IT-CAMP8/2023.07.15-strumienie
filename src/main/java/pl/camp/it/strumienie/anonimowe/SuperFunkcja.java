package pl.camp.it.strumienie.anonimowe;

@FunctionalInterface
public interface SuperFunkcja {
    int apply(int a, int b, int c, int d);

    default void m() {
        System.out.println("cos");
    }
}
