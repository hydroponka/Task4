package by.ageenko.task_4.entity;

import by.ageenko.task_4.generator.FlowerIdGenerator;

import java.util.Objects;
import java.util.StringJoiner;

public abstract class Flower {
    private int flowerId;
    private String name;
    private int weight;
    private int length;
    private int price;


    public Flower(String name, int weight, int length, int price) {
        this.flowerId = FlowerIdGenerator.generateIdOfFlower();
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.price = price;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Flower.class.getSimpleName() + "[", "]")
                .add("flowerId=" + flowerId)
                .add("flowerName='" + name + "'")
                .add("flowerWeight=" + weight)
                .add("flowerPrice=" + price)
                .toString();
    }
}
