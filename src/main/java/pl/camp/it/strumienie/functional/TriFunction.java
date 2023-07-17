package pl.camp.it.strumienie.functional;

@FunctionalInterface
public interface TriFunction<A, B, C, D> {
    D apply(A a, B b, C c);
}
