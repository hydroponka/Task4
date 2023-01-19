package by.ageenko.task_4.entity;

import by.ageenko.task_4.generator.BouquetIdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Bouquet {
    private int bouquetId;
    private List<Flower> flowerList;
    private PackageType packageType;

    public Bouquet(List<Flower> flowerList, PackageType packageType) {
        this.flowerList = flowerList;
        this.packageType = packageType;
        this.bouquetId = BouquetIdGenerator.generateIdOfBouquet();
    }

    public int getBouquetId() {
        return bouquetId;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bouquet.class.getSimpleName() + "[", "]")
                .add("bouquetId=" + bouquetId)
                .add("flowerList=" + flowerList)
                .add("packageType=" + packageType)
                .toString();
    }
}
