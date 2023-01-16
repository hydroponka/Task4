package by.ageenko.task_4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    private int bouquetLength;
    private int bouquetWeight;
    private int bouquetPrice;
    private PackageType packageType;


    public Bouquet(List<Flower> flowers, PackageType packageType) {
        this.flowers = flowers;
        this.packageType = packageType;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public int getBouquetLength() {
        return bouquetLength;
    }

    public void setBouquetLength(int bouquetLength) {
        this.bouquetLength = bouquetLength;
    }

    public int getBouquetWeight() {
        return bouquetWeight;
    }

    public void setBouquetWeight(int bouquetWeight) {
        this.bouquetWeight = bouquetWeight;
    }

    public int getBouquetPrice() {
        return bouquetPrice;
    }

    public void setBouquetPrice(int bouquetPrice) {
        this.bouquetPrice = bouquetPrice;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bouquet.class.getSimpleName() + "[", "]")
                .add("flowers=" + flowers)
                .add("bouquetLength=" + bouquetLength)
                .add("bouquetWeight=" + bouquetWeight)
                .add("bouquetPrice=" + bouquetPrice)
                .add("packageType=" + packageType)
                .toString();
    }
}
