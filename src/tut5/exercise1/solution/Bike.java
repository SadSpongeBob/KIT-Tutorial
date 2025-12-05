package tut5.exercise1.solution;

import java.util.Objects;

class Bike {
    private static final String STRING_PATTERN = "Bike{name=%s, model=%s, color=%s, year=%d}";

    private String name;
    private String model;
    private Color color;
    private int year;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bike) {
            Bike bike = (Bike) obj;
            return Objects.equals(bike.name, this.name)
                    && Objects.equals(bike.model, this.model)
                    && this.color == bike.color
                    && this.year == bike.year;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, color, year);
    }

    @Override
    public String toString() {
        return STRING_PATTERN.formatted(this.name, this.model, this.color, this.year);
    }
}
