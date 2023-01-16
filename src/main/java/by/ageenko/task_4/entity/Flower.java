package by.ageenko.task_4.entity;

import by.ageenko.task_4.generator.FlowerIdGenerator;

import java.util.StringJoiner;

public abstract class Flower {
    private String flowerName;
    private String freshness;
    private int flowerWeight;
    private int flowerLength;
    private int flowerPrice;
    private int flowerId;


    public Flower(String flowerName, String freshness, int flowerWeight, int flowerLength, int flowerPrice) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.flowerWeight = flowerWeight;
        this.flowerLength = flowerLength;
        this.flowerPrice = flowerPrice;
        this.flowerId = FlowerIdGenerator.generateIdOfArray();
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFreshness() {
        return freshness;
    }

    public double getFlowerWeight() {
        return flowerWeight;
    }

    public double getFlowerLength() {
        return flowerLength;
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
                .add("flowerName='" + flowerName + "'")
                .add("freshness='" + freshness + "'")
                .add("flowerWeight=" + flowerWeight)
                .add("flowerLength=" + flowerLength)
                .add("flowerPrice=" + flowerPrice)
                .add("flowerId=" + flowerId)
                .toString();
    }
}
