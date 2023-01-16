package by.ageenko.task_4.entity;

import by.ageenko.task_4.generator.FlowerIdGenerator;

import java.util.StringJoiner;

public abstract class Flower {
    private int flowerId;
    private String flowerName;
    private int flowerWeight;
    private int flowerPrice;


    public Flower(String flowerName, int flowerWeight, int flowerPrice) {
        this.flowerId = FlowerIdGenerator.generateIdOfFlower();
        this.flowerName = flowerName;
        this.flowerWeight = flowerWeight;
        this.flowerPrice = flowerPrice;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public double getFlowerWeight() {
        return flowerWeight;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Flower.class.getSimpleName() + "[", "]")
                .add("flowerId=" + flowerId)
                .add("flowerName='" + flowerName + "'")
                .add("flowerWeight=" + flowerWeight)
                .add("flowerPrice=" + flowerPrice)
                .toString();
    }
}
