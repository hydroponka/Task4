package by.ageenko.task_4.service.search.impl;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.entity.Flower;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.service.search.SearchService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    static Logger logger = LogManager.getLogger();

    @Override
    public List<Flower> parserByFlowerLength(Bouquet bouquet, int leftEnd, int rightEnd) throws BouquetException, FlowerException {
        List<Flower> flowerList = new ArrayList<>();
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        } else if (bouquet.getFlowers() == null) {
            throw new FlowerException("Flower list is empty");
        } else if (bouquet.getFlowers().size() != 0) {
            for (int i = 0; i < bouquet.getFlowers().size(); i++) {
                if (bouquet.getFlowers().get(i).getFlowerLength() > leftEnd && bouquet.getFlowers().get(i).getFlowerLength() < rightEnd) {
                    flowerList.add(bouquet.getFlowers().get(i));
                } else {
                    logger.log(Level.INFO, "Flowers in the given range were not found");
                }
            }
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowers());
        }
        return flowerList;
    }

    @Override
    public List<Flower> parserByFlowerPrice(Bouquet bouquet, int leftEnd, int rightEnd) throws BouquetException, FlowerException {
        List<Flower> flowerList = new ArrayList<>();
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        } else if (bouquet.getFlowers() == null) {
            throw new FlowerException("Flower list is empty");
        } else if (bouquet.getFlowers().size() != 0) {
            for (int i = 0; i < bouquet.getFlowers().size(); i++) {
                if (bouquet.getFlowers().get(i).getFlowerPrice() > leftEnd && bouquet.getFlowers().get(i).getFlowerPrice() < rightEnd) {
                    flowerList.add(bouquet.getFlowers().get(i));
                } else {
                    logger.log(Level.INFO, "Flowers in the given range were not found");
                }
            }
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowers());
        }
        return flowerList;
    }
}
