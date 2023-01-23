package by.ageenko.task_4.entity;

import java.util.Objects;
import java.util.StringJoiner;

public class PottedFlower extends Flower{
private PotSize potSize;


    public PottedFlower(String name, int weight, int length, int price, PotSize potSize) {
        super(name, weight, length, price);
        this.potSize = potSize;
    }

    public PotSize getPotSize() {
        return potSize;
    }

    public void setPotSize(PotSize potSize) {
        this.potSize = potSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PottedFlower that)) return false;
        if (!super.equals(o)) return false;
        return potSize == that.potSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potSize);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PottedFlower.class.getSimpleName() + super.toString() + "[", "]")
                .add("potSize=" + potSize)
                .toString();
    }
}
