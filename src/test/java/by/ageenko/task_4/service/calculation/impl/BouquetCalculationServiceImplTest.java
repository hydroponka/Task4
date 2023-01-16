package by.ageenko.task_4.service.calculation.impl;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.entity.CutFlower;
import by.ageenko.task_4.entity.PackageType;
import by.ageenko.task_4.entity.PottedFlower;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.reader.impl.FlowerReaderImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class BouquetCalculationServiceImplTest {
    static Logger logger = LogManager.getLogger();

    @Test
    void bouquetPrice() throws FlowerException, BouquetException {
        FlowerReaderImpl flowerReader = new FlowerReaderImpl();
        PottedFlower rose = flowerReader.pottedFlowerReader("data//Rose");
        CutFlower gerbera = flowerReader.cutFlowerReader("data//Gerbera");
        List<PottedFlower> pottedFlowers = List.of(rose);
        List<CutFlower> cutFlowers = List.of(gerbera);
        Bouquet bouquet = new Bouquet(cutFlowers, pottedFlowers, PackageType.BASKET);
        BouquetCalculationServiceImpl bouquetCalculationService = new BouquetCalculationServiceImpl();
        OptionalInt actual = bouquetCalculationService.bouquetPrice(bouquet);
        OptionalInt expected = OptionalInt.of(19);
        assertEquals(actual, expected);
        logger.log(Level.INFO, "Price = {}", actual);
    }

    @Test
    void bouquetLength() throws FlowerException, BouquetException {
        FlowerReaderImpl flowerReader = new FlowerReaderImpl();
        PottedFlower rose = flowerReader.pottedFlowerReader("data//Rose");
        CutFlower gerbera = flowerReader.cutFlowerReader("data//Gerbera");
        List<PottedFlower> pottedFlowers = List.of(rose);
        List<CutFlower> cutFlowers = List.of(gerbera);
        Bouquet bouquet = new Bouquet(cutFlowers, pottedFlowers, PackageType.BASKET);
        BouquetCalculationServiceImpl bouquetCalculationService = new BouquetCalculationServiceImpl();
        OptionalInt actual = bouquetCalculationService.bouquetLength(bouquet);
        OptionalInt expected = OptionalInt.of(3);
        assertEquals(actual, expected);
        logger.log(Level.INFO, "Price = {}", actual);
    }

    @Test
    void bouquetWeight() throws FlowerException, BouquetException {
        FlowerReaderImpl flowerReader = new FlowerReaderImpl();
        PottedFlower rose = flowerReader.pottedFlowerReader("data//Rose");
        CutFlower gerbera = flowerReader.cutFlowerReader("data//Gerbera");
        List<PottedFlower> pottedFlowers = List.of(rose);
        List<CutFlower> cutFlowers = List.of(gerbera);
        Bouquet bouquet = new Bouquet(cutFlowers, pottedFlowers, PackageType.BASKET);
        BouquetCalculationServiceImpl bouquetCalculationService = new BouquetCalculationServiceImpl();
        OptionalInt actual = bouquetCalculationService.bouquetWeight(bouquet);
        OptionalInt expected = OptionalInt.of(4);
        assertEquals(actual, expected);
        logger.log(Level.INFO, "Price = {}", actual);
    }
}