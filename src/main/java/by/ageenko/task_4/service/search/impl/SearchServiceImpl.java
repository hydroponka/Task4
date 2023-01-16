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
        } else if (bouquet.getFlowerList() == null) {
            throw new FlowerException("Flower list is empty");
        } else if (bouquet.getFlowerList().size()!= 0) {
            for (int i = 0; i < bouquet.getFlowerList().size(); i++) {
                if (bouquet.getFlowerList().get(i).getLength() > leftEnd && bouquet.getFlowerList().get(i).getLength() < rightEnd) {
                    flowerList.add(bouquet.getFlowerList().get(i));
                } else {
                    logger.log(Level.INFO, "Flowers in the given range were not found");
                }
            }
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowerList());
        }
        return flowerList;
    }

    @Override
    public List<Flower> parserByFlowerPrice(Bouquet bouquet, int leftEnd, int rightEnd) throws BouquetException, FlowerException {
        List<Flower> flowerList = new ArrayList<>();
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        }
        if (bouquet.getFlowerList() == null) {
            throw new FlowerException("Flower list is empty");
        }
        if (bouquet.getFlowerList().size() != 0) {
            for (int i = 0; i < bouquet.getFlowerList().size(); i++) {
                if (bouquet.getFlowerList().get(i).getPrice() > leftEnd && bouquet.getFlowerList().get(i).getPrice() < rightEnd) {
                    flowerList.add(bouquet.getFlowerList().get(i));
                } else {
                    logger.log(Level.INFO, "Flowers in the given range were not found");
                }
            }
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowerList());
        }
        return flowerList;
    }
}
