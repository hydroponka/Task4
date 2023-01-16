package by.ageenko.task_4.entity;

public class PottedFlower extends Flower{
    private int growthSpeed;
private PotSize potSize;
    public PottedFlower(String flowerName, int flowerWeight, int growthSpeed, int flowerPrice, PotSize potSize) {
        super(flowerName, flowerWeight, flowerPrice);
        this.growthSpeed = growthSpeed;
        this.potSize = potSize;

    }
}
