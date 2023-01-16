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

import static org.junit.jupiter.api.Assertions.*;

class SortByFreshnessServiceImplTest {
    static Logger logger = LogManager.getLogger();

    @Test
    void sortByFreshness() throws FlowerException, BouquetException {
        FlowerReaderImpl flowerReader = new FlowerReaderImpl();
        Flower rose = flowerReader.RoseFlowerReader("data//Rose");
        Flower gerbera = flowerReader.AsterFlowerReader("data//Gerbera");
        Flower orchid = flowerReader.OrchidFlowerReader("data//Orchid");
        List<Flower> flowerList = List.of(rose, orchid, gerbera);
        Bouquet bouquet = new Bouquet(flowerList, PackageType.BASKET);
        logger.log(Level.INFO, "list = {}", bouquet.getFlowers());
        SortByFreshnessServiceImpl sortByFreshnessService = new SortByFreshnessServiceImpl();
        sortByFreshnessService.SortByFreshness(bouquet);
        logger.log(Level.INFO, "listSort = {}", bouquet.getFlowers());

    }
}