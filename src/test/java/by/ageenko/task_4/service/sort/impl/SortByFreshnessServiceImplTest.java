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
        Flower rose = flowerReader.pottedFlowerReader("data//Rose");
        Flower gerbera = flowerReader.cutFlowerReader("data//Gerbera");
        List<Flower> flowerList = List.of(rose,gerbera);
        Bouquet bouquet = new Bouquet(flowerList, PackageType.BASKET);
        logger.log(Level.INFO, "list = {}", bouquet.getFlowers());
        SortByFreshnessServiceImpl sortByFreshnessService = new SortByFreshnessServiceImpl();
        sortByFreshnessService.sortByFreshness(bouquet);
        logger.log(Level.INFO, "listSort = {}", bouquet.getFlowers());

    }
}