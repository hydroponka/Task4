package by.ageenko.task_4.service.sort.impl;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.entity.CutFlower;
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
    public void sortByFreshness(Bouquet bouquet) throws BouquetException, FlowerException {
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        }
        List<CutFlower> cutFlowers = bouquet.getCutFlowers();
        if (cutFlowers == null) {
            throw new FlowerException("Flower list is empty");
        }
        if (!cutFlowers.isEmpty()) {
            List<CutFlower> flowerListUnfresh = new ArrayList<>();
            List<CutFlower> flowerListFresh = new ArrayList<>();
            for (int i = 0; i < cutFlowers.size(); i++) {
                if (!cutFlowers.get(i).isFreshness()) {
                    flowerListUnfresh.add(cutFlowers.get(i));
                } else if (cutFlowers.get(i).isFreshness()) {
                    flowerListFresh.add(cutFlowers.get(i));
                }
            }
            cutFlowers = new ArrayList<>();
            for (int i = 0; i < flowerListFresh.size(); i++) {
                cutFlowers.add(flowerListFresh.get(i));
            }
            for (int i = 0; i < flowerListUnfresh.size(); i++) {
                cutFlowers.add(flowerListUnfresh.get(i));
            }
            bouquet.setCutFlowers(cutFlowers);
            bouquet.setFlowerList(cutFlowers, bouquet.getPottedFlowers());
        } else {
            logger.log(Level.INFO, "Flower list length = {}", bouquet.getFlowerList().size());
        }
    }
}
