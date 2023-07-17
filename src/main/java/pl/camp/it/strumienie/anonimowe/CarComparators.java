package pl.camp.it.strumienie.anonimowe;

import java.util.Comparator;

public enum CarComparators {
    BRAND_ASC(new PorownywaczPoMarceRosnaco()),
    BRAND_DESC(new PorownywaczPoMarceMalejaco());

    private final Comparator<Car> comparator;

    CarComparators(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Car> getComparator() {
        return comparator;
    }
}
