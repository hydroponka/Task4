package by.ageenko.task_4.entity;

import java.util.Objects;
import java.util.StringJoiner;

public class CutFlower extends Flower{
    private boolean freshness;

    public CutFlower(String name, boolean freshness, int weight, int length, int price) {
        super(name, weight, length, price);
        this.freshness = freshness;
    }


    public boolean isFreshness() {
        return freshness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CutFlower cutFlower)) return false;
        if (!super.equals(o)) return false;

        return freshness == cutFlower.freshness;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (freshness ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CutFlower.class.getSimpleName() + super.toString() + "[", "]")
                .add("freshness=" + freshness)
                .toString();
    }
}
