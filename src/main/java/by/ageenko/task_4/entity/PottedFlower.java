package by.ageenko.task_4.entity;

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
    public String toString() {
        return new StringJoiner(", ", PottedFlower.class.getSimpleName() + "[", "]")
                .add(super.toString())
                .add("potSize=" + potSize)
                .toString();
    }
}
