package by.ageenko.task_4.entity;

import by.ageenko.task_4.generator.BouquetIdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Bouquet {
    private int bouquetId;
    private List<CutFlower> cutFlowers;
    private List<PottedFlower> pottedFlowers;
    private List<Flower> flowerList = new ArrayList<>();
    private PackageType packageType;


    public Bouquet(List<CutFlower> cutFlowers, List<PottedFlower> pottedFlowers, PackageType packageType) {
        this.bouquetId = BouquetIdGenerator.generateIdOfBouquet();
        this.cutFlowers = cutFlowers;
        this.pottedFlowers = pottedFlowers;
        this.flowerList.addAll(cutFlowers);
        this.flowerList.addAll(pottedFlowers);
        this.packageType = packageType;
    }

    public int getBouquetId() {
        return bouquetId;
    }

    public List<CutFlower> getCutFlowers() {
        return cutFlowers;
    }

    public void setCutFlowers(List<CutFlower> cutFlowers) {
        this.cutFlowers = cutFlowers;
    }

    public List<PottedFlower> getPottedFlowers() {
        return pottedFlowers;
    }

    public void setPottedFlowers(List<PottedFlower> pottedFlowers) {
        this.pottedFlowers = pottedFlowers;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<CutFlower> cutFlowerList, List<PottedFlower> pottedFlowerList) {
        this.flowerList = new ArrayList<>();
        this.flowerList.addAll(cutFlowerList);
        this.flowerList.addAll(pottedFlowerList);

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
                .add("cutFlowers=" + cutFlowers)
                .add("pottedFlowers=" + pottedFlowers)
                .add("flowerList=" + flowerList)
                .add("packageType=" + packageType)
                .toString();
    }
}
