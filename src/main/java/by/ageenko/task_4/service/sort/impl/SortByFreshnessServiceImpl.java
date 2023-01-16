package by.ageenko.task_4.service.sort.impl;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.entity.Flower;
import by.ageenko.task_4.entity.Freshness;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.service.sort.SortByFreshnessService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class SortByFreshnessServiceImpl implements SortByFreshnessService {
    static Logger logger = LogManager.getLogger();

    @Override
    public void SortByFreshness(Bouquet bouquet) throws BouquetException, FlowerException {
        List<Flower> flowerList = bouquet.getFlowers();
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        } else if (flowerList == null) {
            throw new FlowerException("Flower list is empty");
        } else if (flowerList.size() != 0) {
            List<Flower> flowerListUnfresh = new ArrayList<>();
            List<Flower> flowerListFresh = new ArrayList<>();
            for (int i = 0; i < flowerList.size(); i++) {
                if (flowerList.get(i).getFreshness().toUpperCase().equals(Freshness.UNFRESH.toString())) {
                    flowerListUnfresh.add(flowerList.get(i));
                } else if (flowerList.get(i).getFreshness().toUpperCase().equals(Freshness.FRESH.toString())) {
                    flowerListFresh.add(flowerList.get(i));
                }
            }
            flowerList = new ArrayList<>();
            for (int i = 0; i < flowerListFresh.size(); i++) {
                flowerList.add(flowerListFresh.get(i));
            }
            for (int i = 0; i < flowerListUnfresh.size(); i++) {
                flowerList.add(flowerListUnfresh.get(i));
            }
            bouquet.setFlowers(flowerList);
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowers());
        }
    }
}
