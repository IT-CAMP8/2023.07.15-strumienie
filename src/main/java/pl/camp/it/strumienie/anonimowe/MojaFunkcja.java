package pl.camp.it.strumienie.anonimowe;

import java.util.function.Function;

public class MojaFunkcja implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        //return (integer + x) * 10;
        return 0;
    }
}
