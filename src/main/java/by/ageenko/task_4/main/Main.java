package by.ageenko.task_4.main;

import by.ageenko.task_4.entity.*;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.reader.impl.FlowerReaderImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws FlowerException {
        FlowerReaderImpl flowerReader = new FlowerReaderImpl();
        PottedFlower rose = flowerReader.pottedFlowerReader("data//Rose");
        CutFlower gerbera = flowerReader.cutFlowerReader("data//Gerbera");
        List<PottedFlower> pottedFlowers = List.of(rose);
        List<CutFlower> cutFlowers = List.of(gerbera);
        Bouquet bouquet = new Bouquet(cutFlowers, pottedFlowers, PackageType.BASKET);
        System.out.println(bouquet.getFlowerList());

    }
}
