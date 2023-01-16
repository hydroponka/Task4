package by.ageenko.task_4.entity;

public class CutFlower extends Flower{
    private boolean frehness;
    private int flowerLength;
    public CutFlower(String flowerName, boolean freshness, int flowerWeight, int flowerLength, int flowerPrice) {
        super(flowerName, flowerWeight, flowerPrice);
        this.frehness = freshness;
        this.flowerLength = flowerLength;
    }

    public boolean isFrehness() {
        return frehness;
    }

    public int getFlowerLength() {
        return flowerLength;
    }
}
