package by.ageenko.task_4.service.sort.impl;

import by.ageenko.task_4.entity.*;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.reader.impl.FlowerReaderImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;

class SortByFreshnessServiceImplTest {
    static Logger logger = LogManager.getLogger();

    @Test
    void sortByFreshness() throws FlowerException, BouquetException {
        FlowerReaderImpl flowerReader = new FlowerReaderImpl();
        PottedFlower rose = flowerReader.pottedFlowerReader("data//Rose");
        CutFlower orchid = flowerReader.cutFlowerReader("data//Orchid");
        CutFlower gerbera = flowerReader.cutFlowerReader("data//Gerbera");
        List<PottedFlower>pottedFlowers = List.of(rose);
        List<CutFlower> cutFlower= List.of(orchid,gerbera);
        Bouquet bouquet = new Bouquet(cutFlower,pottedFlowers, PackageType.BASKET);
        logger.log(Level.INFO, "list = {}", bouquet.getFlowerList());
        SortByFreshnessServiceImpl sortByFreshnessService = new SortByFreshnessServiceImpl();
        sortByFreshnessService.sortByFreshness(bouquet);
        logger.log(Level.INFO, "listSort = {}", bouquet.getFlowerList());
    }
}