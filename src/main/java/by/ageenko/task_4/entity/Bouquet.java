package by.ageenko.task_4.entity;

import by.ageenko.task_4.generator.BouquetIdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Bouquet {
    private int bouquetId;
    private List<Flower> flowers;
    private PackageType packageType;


    public Bouquet(List<Flower> flowers, PackageType packageType) {
        this.bouquetId = BouquetIdGenerator.generateIdOfBouquet();
        this.flowers = flowers;
        this.packageType = packageType;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
    public PackageType getPackageType() {
        return packageType;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bouquet.class.getSimpleName() + "[", "]")
                .add("flowers=" + flowers)
                .add("packageType=" + packageType)
                .toString();
    }
}
