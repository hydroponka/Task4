package by.ageenko.task_4.entity;

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
    public String toString() {
        return new StringJoiner(", ", CutFlower.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("freshness=" + freshness)
                .toString();
    }
}
